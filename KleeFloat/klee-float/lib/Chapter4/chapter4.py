#coding=utf-8

import random
import math
import time


path="/home/zy/KleeFloat/KLEE-FLOAT/klee-float/lib/Chapter4/"

lffSampleSize = 20000
halfLen = random.uniform(0,10)
maxIter = 100  #1000
sampleSize = 10000 #1000
beta = 0.99  #0.95
addRate = 0.01
time_start=time.time()

# write the result to file 把实验结果写入到文件
def writeResult(res,time):
	with open(path+'/IIP.result', 'w+') as file:
		file.write(res+'\n') 
		file.close()
	print "FinalRes: ",res

#sample vector 随机抽样
def sampleValue(nameStr,interval):
	resDict = {}
	for i in range(len(interval)):
		resDict[nameStr[i]] = random.uniform(interval[i][0],interval[i][1])
	return resDict

#sample vector edge 针对边界的处理
def sampleEdge(nameStr,interval):
	resDict = {}
	for i in range(len(interval)):
		index = random.randint(0,100) % 2
		resDict[nameStr[i]] = interval[i][index]
	return resDict

#replace the var to value 把constraint 的变量替换为实际值
def replaceValue(constraint,runtimeDict):
	res = str(constraint)
	for key in runtimeDict.keys():
		res = res.replace(key,"("+str(runtimeDict[key])+")")
	return res

#deal with math functions 添加math的前缀
def replaceMath(constraint):
	res =constraint
	res = res.replace('sin','math.sin')
	res = res.replace('cos','math.cos')
	res = res.replace('tan','math.tan')
	res = res.replace('asin','math.asin')
	res = res.replace('acos','math.acos')
	res = res.replace('atan','math.atan')
	res = res.replace('log','math.log')
	res = res.replace('pow','math.pow')
	res = res.replace('sqrt','math.sqrt')
	res = res.replace('exp','math.exp')
	return res

#针对所有方向的区间削减
def reduceInterval(interval): 
	for i in range(len(interval)):
		interLen = (interval[i][1]-interval[i][0]) / 2 * beta
		cen = (interval[i][1]+interval[i][0]) / 2
		interval[i][0],interval[i][1]=cen-interLen,cen+interLen
	return interval

#左右边界区间的拓展
def addInterval(interval,extendType):
	for i in range(len(interval)):
		addLen = (interval[i][1]-interval[i][0]) * addRate
		if extendType == 'right':
			interval[i][0] = interval[i][0] - addLen
		elif extendType == 'left':
			interval[i][1] = interval[i][1] + addLen
	return interval

#左右边界区间的拓展
def extendInterval(constraint,nameStr,interval,extendType):
	found = False
	while True:
		pre = interval
		interval = addInterval(interval,extendType)
		for j in range(sampleSize):
			runtimeDict = sampleValue(nameStr,interval)
			calaStr = replaceValue(constraint,runtimeDict)
			if eval(calaStr) == False: 
				found = True
				break
		if found == True:
			interval = pre
			break
	return interval

#检查区间边界
def checkEdge(constraint,nameStr,interval):
	runtimeDict = []
	valueSet = set()
	needReduce = False
	for i in range(maxIter): 
		for j in range(int(math.pow(2,len(nameStr)+1))):
			runtimeDict = sampleEdge(nameStr,interval)
			if str(runtimeDict) in valueSet:
				continue
			else:
				valueSet.add(str(runtimeDict))

			calaStr = replaceValue(constraint,runtimeDict)
			if eval(calaStr) == False: 
				needReduce = True
				break
		if needReduce == True:
			interval = reduceInterval(interval)
			needReduce = False
	return interval

#随机抽样 & 验证约束
def sampleAndCheck(info,interval):
	nameDict = {}
	nameStr=info[0].split(',')
	valueStr=info[1].split(',')
	for i in range(len(nameStr)):
		nameDict[nameStr[i]]=float(valueStr[i])

	needReduce = False
	constraint = replaceMath(info[2])
	for i in range(maxIter): 
		for j in range(sampleSize):
			runtimeDict = sampleValue(nameStr,interval)
			calaStr = replaceValue(constraint,runtimeDict)
			if eval(calaStr) == False: 
				needReduce = True
				break
		if needReduce == True:
			interval = reduceInterval(interval)
			needReduce = False

	interval = extendInterval(constraint,nameStr,interval,'left')
	interval = extendInterval(constraint,nameStr,interval,'right')
	interval = checkEdge(constraint,nameStr,interval)
	
	totalTime = time.time()-time_start
	if needReduce == True:
		writeResult("FAIL",str(totalTime))
	else:
		writeResult(str(interval),str(totalTime))

	print info
	print nameStr
	print valueStr
	print interval 
	
# LFF 分割约束
def splitComp(pcVec):
	res = []
	for one in pcVec:
		if one.find("<=") != -1:
			tmp = one.split("<=")
			res.append("("+tmp[1]+")-("+tmp[0]+")")
		elif one.find("<") != -1:
			tmp = one.split("<")
			res.append("("+tmp[1]+")-("+tmp[0]+")")
		elif one.find(">=") != -1:
			tmp = one.split(">=")
			res.append("("+tmp[0]+")-("+tmp[1]+")")
		elif one.find(">") != -1:
			tmp = one.split(">")
			res.append("("+tmp[0]+")-("+tmp[1]+")")
		elif one.find("==") != -1:
			tmp = one.split("==")
			res.append("("+tmp[0]+")-("+tmp[1]+")")
		elif one.find("!=") != -1:
			tmp = one.split("!=")
			res.append("("+tmp[0]+")-("+tmp[1]+")")
		else :
			#print "Comp Operator Wrong"
			res.append("1")
	for i in range(len(res)):
		res[i] = res[i].replace(' ','')
	return res

#LFF constraint替换变量为实际值
def replaceRuntimeValue(constraint,runtimeDict):
	res = str(constraint)
	for key in runtimeDict.keys():
		res = res.replace(key,"("+str(runtimeDict[key])+")")
	return res

#LFF 线性拟合
def lff(xVec,yVec):
	interval = []
	for i in range(len(xVec)-1):
		x1,x2,y1,y2=xVec[i],xVec[i+1],yVec[i],yVec[i+1]
		if x2-x1 == 0.0:
			continue
		a = (y2-y1)/(x2-x1)
		b = y1-a*x1

		if a == 0.0:
			continue
		zero = -b/a;
		v=[]
		if y1>=0 and y2>=0:
			v=[x1,x2]
		elif y1<0 and y2>=0:
			v=[zero,x2]
		elif y1>=0 and y2<0:
			v=[x1,zero]
		else:
			if a>=0:
				v=[zero,zero+random.uniform(0,1)]
			else:
				v=[zero-random.uniform(0,1),zero]
		interval.append(v)
	return interval

#按列合并区间
def mergeColInterval(v1,v2):
	if len(v1) == 0:
		return v2
	elif len(v2) == 0:
		return v1
	res=[]
	for i in range(len(v1)):
		left =max(v1[i][0],v2[i][0])
		right=min(v1[i][1],v2[i][1])
		if left>right:
			res.append([left,right])
		else:
			res.append([left,right])
	return res

#按行合并相邻区间
def mergeRowInterval(v):
	tmp = []
	for i in range(len(v)):
		if v[i][0] <= v[i][1]:
			tmp.append(v[i]);
	v=tmp;
	res=[]
	pre=0
	for i in range(1,len(v)):
		if v[i][0] == v[i-1][1]:
			pass
		else:
			tmp = [ v[pre][0],v[i-1][1] ]
			res.append(tmp)
			pre=i

	if len(v)==0:
		pass
	else:
		tmp = [ v[pre][0],v[len(v)-1][1]]
		res.append(tmp)
	return res

#LFF 线性拟合计算单方向预测区间
def calcLFF(nameDict,key,xVec,constraintVec):
	runtimeDict = {}
	for i in nameDict.keys():
		runtimeDict[i]=nameDict[i]

	resInterval=[]
	for i in range(len(xVec)-1):
		resInterval.append([xVec[i],xVec[i+1]])

	for constraint in constraintVec:
		yVec = []
		for x in xVec:
			runtimeDict[key] = x
			yStr = replaceRuntimeValue(constraint,runtimeDict)
			yVec.append(eval(yStr))
		interval = lff(xVec,yVec)
		resInterval = mergeColInterval(resInterval,interval)

	resInterval = mergeRowInterval(resInterval)
	numVar = len(nameDict.keys())
	if numVar == 1:
		return resInterval
	if len(resInterval) == 0:
		return []
	elif len(resInterval) == 1:
		return resInterval[0]
	else:
		maxLen,index= -1,-1
		for i in range(len(resInterval)):
			if resInterval[i][1]-resInterval[i][0] > maxLen:
				maxLen = resInterval[i][1]-resInterval[i][0]
				index = i
		for i in range(len(resInterval)):
			if resInterval[i][1]-resInterval[i][0] == maxLen \
			and nameDict[key]<=resInterval[i][1] \
			and nameDict[key]>=resInterval[i][0]:
				index = i
		return resInterval[index]

# calc X input vector LFF 随机抽样
def calcXVec(cen):
	xVec = []
	checkSet = set()
	for i in range(lffSampleSize):
		tmpx = random.uniform(cen-halfLen,cen+halfLen)
		while tmpx in checkSet:
			tmpx = random.uniform(cen-halfLen,cen+halfLen)
		xVec.append(tmpx)
	xVec.sort()
	checkSet.clear()
	return xVec

#当只有一个输入变量的时候的边界处理
def dealWithOneVar(info,interval):
	nameDict = {}
	nameVec =info[0].split(',')
	valueVec =info[1].split(',')
	constraint = replaceMath(info[2])
	for i in range(len(nameVec)):
		nameDict[nameVec[i]]=float(valueVec[i])
	key = nameVec[0]
	res = []
	for v in interval:
		while True:
			if v[1]-v[0] <= 1e-6:
				break;
			nameDict[key] = v[0]
			yStr = replaceRuntimeValue(constraint,nameDict)
			if eval(yStr) == False:
				if v[1]-v[0] >= 1:
					v[0] = v[0] + 1e-1
				else:
					v[0] = v[0] + (v[1]-v[0])*(1e-4)
			else:
				break;

		while True:
			if v[1]-v[0] <= 1e-6:
				break;
			nameDict[key] = v[1]
			yStr = replaceRuntimeValue(constraint,nameDict)
			if eval(yStr) == False:
				if v[1]-v[0] >= 1:
					v[1] = v[1] - 1e-1
				else:
					v[1] = v[1] - (v[1]-v[0])*(1e-4)
			else:
				break;
		res.append(v);
	return res

# LFF 线性拟合
def lffAndInterval(info):
	nameDict = {}
	nameVec =info[0].split(',')
	valueVec =info[1].split(',')
	constraintVec = splitComp(replaceMath(info[2]).split('and'))

	for i in range(len(nameVec)):
		nameDict[nameVec[i]]=float(valueVec[i])

	interval = []
	for i in range(len(nameVec)):
		xVec = calcXVec(float(valueVec[i]))
		one = calcLFF(nameDict,nameVec[i],xVec,constraintVec)
		if len(one) == 0:
			writeResult("FAIL","0")
			exit() 
		interval.append(one)
	
	return interval

#程序入口
def beginSolver():
	random.seed(time.time())
	info = []
	with open(path+'/constraint.info', 'r') as file:
		for line in file.readlines():
			line = line.strip('\n')
			if len(line) > 0 :
				info.append(line)
		file.close()
	if len(info) != 3 or info[2].find("==") != -1:
		writeResult("FAIL","0")
		exit()

	interval = lffAndInterval(info)
	if len(interval) == 1:
		print "Before dealWithOneVar: ",interval[0]
		interval = dealWithOneVar(info,interval[0])  # interval[0]
		info = "" 
		if len(interval) <= 0:
			info = "["
		else:
			info = "[" + str(interval[0]) 
		for i in range(1,len(interval)):
			info = info + " or " + str(interval[i]) 
		info = info +"]"
		writeResult(info,str(time.time()-time_start))
		exit()
	sampleAndCheck(info,interval)

#Testing
if __name__ == '__main__':
	beginSolver()

  





	



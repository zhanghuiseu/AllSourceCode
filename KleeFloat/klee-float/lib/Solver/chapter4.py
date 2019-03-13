import random
import math
import time
import re


path="/home/zy/KleeFloat/KLEE-FLOAT/klee-float/examples/AllResult/InputIntervalPrediction/"
halfLen = random.uniform(0,20)

maxIter = 200  #1000
sampleSize = 1000 #1000
beta = 0.99  #0.95
addRate = 0.01

# write the result to file
def writeResult(info,res,time):
	with open(path+'/'+info[0]+'.result', 'w+') as file:
		file.write("PathName   : "+info[0]+'\n') 
		file.write("VatName    : "+info[1]+'\n') 
		file.write("Constraint : "+info[3]+'\n') 
		file.write("Result     : "+res+'\n') 
		file.write("TotalTime  : "+time+'\n') 
		file.write("MaxIterator: "+str(maxIter)+'\n') 
		file.write("SampleSize : "+str(sampleSize)+'\n') 
		file.write("ReduceRate : "+str(beta)+'\n') 
		file.close()

#sample vector
def sampleValue(nameStr,interval):
	resDict = {}
	for i in range(len(interval)):
		resDict[nameStr[i]] = random.uniform(interval[i][0],interval[i][1])
	return resDict

#sample vector edge
def sampleEdge(nameStr,interval):
	resDict = {}
	for i in range(len(interval)):
		index = random.randint(0,100) % 2
		resDict[nameStr[i]] = interval[i][index]
	return resDict

#replace the var to value
def replaceValue(constraint,runtimeDict):
	res = str(constraint)
	for key in runtimeDict.keys():
		res = res.replace(key,str(runtimeDict[key]))
	return res

#deal with math functions
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

def reduceInterval(interval):
	for i in range(len(interval)):
		interLen = (interval[i][1]-interval[i][0]) / 2 * beta
		cen = (interval[i][1]+interval[i][0]) / 2
		interval[i][0],interval[i][1]=cen-interLen,cen+interLen
	return interval

def addInterval(interval,extendType):
	for i in range(len(interval)):
		addLen = (interval[i][1]-interval[i][0]) * addRate
		if extendType == 'right':
			interval[i][0] = interval[i][0] - addLen
		elif extendType == 'left':
			interval[i][1] = interval[i][1] + addLen
	return interval

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

def checkEdge(constraint,nameStr,interval):
	runtimeDict = []
	valueSet = set()
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

def sampleAndCheck(info):
	time_start=time.time()
	nameDict = {}
	interval = []
	nameStr=info[1].split(',')
	valueStr=info[2].split(',')
	for i in range(len(nameStr)):
		nameDict[nameStr[i]]=float(valueStr[i])
		interval.append([float(valueStr[i])-halfLen,float(valueStr[i])+halfLen]);

	needReduce = False
	constraint = replaceMath(info[3])
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
	time_end=time.time()	
	
	totalTime = time_end-time_start
	if needReduce == True:
		writeResult(info,"FAIL",str(totalTime))
	else:
		writeResult(info,str(interval),str(totalTime))

	print info
	print nameStr
	print valueStr
	print interval 
	
	
def beginSolver():
	info = []
	with open(path+'/constraint.info', 'r') as file:
		for line in file.readlines():
			line = line.strip('\n')
			if len(line) > 0 :
				info.append(line)
		file.close()
	if len(info) != 4:
		writeResult(info,"FAIL","0")
		exit()
	sampleAndCheck(info)
	
if __name__ == '__main__':
	beginSolver()

  





	



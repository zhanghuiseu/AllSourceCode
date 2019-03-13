package cn.nju.seg.atpc.generate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;

import cn.nju.seg.atpc.main.ConstraintParameter;
import cn.nju.seg.atpc.model.BinaryExpression;
import cn.nju.seg.atpc.model.Operator;
import cn.nju.seg.atpc.parser.BinaryExpressionParse;


/*
 * 这个类主要负责ConstraintParameter.cuh 和 ConstraintParameter.cu
 * 两个文件的内容的自动生成，这个主要包含各种约束的信息，比如变量的数量、名称
 * 依赖关系等等，最重要的是CPU的验证模块
 * */
public class ForConstraintParameter 
{
	/*
	 * 下面是保存相关文件内容的字符串
	 * */
	public StringBuilder head = null;
	public StringBuilder code = null;
	public String headFilePath = "";
	
	/*
	 * 构造函数
	 * */
	public ForConstraintParameter(String path)
	{
		head = new StringBuilder();
		code = new StringBuilder();
		headFilePath = path;
	}
	
	/*
	 * 自动的生成所有的内容，并写到文件内
	 * */
	public boolean generateCode()
	{
		gelAllHeadFileContent();
		gelAllCodeFileContent();
		writeHeadFile(head, "ConstraintParameter.cuh");
		writeCodeFile(code, "ConstraintParameter.cu");
		return true;
	}
	
	/*
	 * 写到head文件内部
	 * */
	public boolean writeHeadFile(StringBuilder head,String filename)
	{
		String folderPath = new File("").getAbsolutePath()+"/ATPC_Result/";
		folderPath = headFilePath;
		File folder = new File(folderPath);
		if (!folder.exists()) 
			folder.mkdirs();
		String resultPath = folderPath + "/"+filename;
		try {
            FileOutputStream out=new FileOutputStream(resultPath);   
            BufferedWriter bufferedwriter = new BufferedWriter(new OutputStreamWriter(out));
            bufferedwriter.write(head.toString());
            bufferedwriter.flush();
            bufferedwriter.close();
        }catch (Exception e){   
            e.printStackTrace();   
        }
		return true;
	}
	
	/*
	 * 写到code文件内部
	 * */
	public boolean writeCodeFile(StringBuilder head,String filename)
	{
		String folderPath = new File("").getAbsolutePath()+"/ATPC_Result/";
		folderPath = headFilePath;
		File folder = new File(folderPath);
		if (!folder.exists()) 
			folder.mkdirs();
		String resultPath = folderPath + "/"+filename;
		try {
            FileOutputStream out=new FileOutputStream(resultPath);   
            BufferedWriter bufferedwriter = new BufferedWriter(new OutputStreamWriter(out));
            bufferedwriter.write(head.toString());
            bufferedwriter.flush();
            bufferedwriter.close();
        }catch (Exception e){   
            e.printStackTrace();   
        }
		return true;
	}
	
	/*
	 * 获取所有的head文件内容
	 * */
	public boolean gelAllHeadFileContent()
	{
		//类的声明开头
		String begin = getHBegin();
		head.append(begin);
		
		//类的参数部分
		String param = getHParam();
		head.append(param);
		
		//类的函数部分
		String func = getHFunction();
		head.append(func);
		
		//类的声明结束部分
		String end = getHEnd();
		head.append(end);
		
		return true;
	}
	
	/*
	 * 获取所有的code文件内容
	 * */
	public boolean gelAllCodeFileContent()
	{
		//类的声明部分
		String begin = getCBegin();
		code.append(begin);
		
		//类的参数部分
		String param = getCParam();
		code.append(param);
		
		//类的函数部分
		String func = getCFunction();
		code.append(func);
		
		return true;
	}
	
	
	/*
	 * 获取当前的begin注释
	 * */
	public String getCBegin()
	{
		String begin = "\t/*\n\t * ConstraintParameter.cu\n"
			     + "\t * \n"
			     + "\t * ***************   Notice   ***************\n"
			     + "\t * Auto Generated By ATPC on:"+getNowTime()+"\n"
			     + "\t * Author: ZhangHui\n"
			     + "\t * \n" 
			     + "\t */ \n\n" ;
		begin =begin 
			  + "\t#include <iostream>\n\n"
			   + "\t#include <vector>\n\n"
			   + "\t#include <map>\n\n"
			  + "\t#include \"./../solver/type.h\"\n"
			  + "\t#include \"./../solver/ConstantValue.h\"\n"
			  + "\t#include \"./../model/RuntimeValue.h\"\n"
			  + "\t#include \"ConstraintParameter.cuh\"\n\n"
			  + "\tusing namespace std;\n\n\n";
		return begin;
	}
	
	
	/*
	 * 获取当前的begin注释
	 * */
	public String getHBegin()
	{
		String begin = "/*\n * ConstraintParameter.cuh\n"
			     + " * \n"
			     + " * ***************   Notice   ***************\n"
			     + " * Auto Generated By ATPC on:"+getNowTime()+"\n"
			     + " * Author: ZhangHui\n"
			     + " * \n" 
			     + " */ \n\n" ;
		begin =begin 
			  + "#ifndef CONSTRAINTPARAMETER_CUH_\n"
			  + "#define CONSTRAINTPARAMETER_CUH_\n\n"
			  + "#include <string>\n"
			  + "#include <vector>\n"
			  + "#include <map>\n"
			  + "#include <iostream>\n\n"
			  + "#include <cmath>\n\n"
			  + "#include \"./../model/RuntimeValue.h\"\n"
			  + "#include \"./../solver/type.h\"\n\n"
			  + "#include \"./../solver/SolverParameter.h\"\n\n"
			 
			  + "using namespace std;\n\n"
			  + "/*\n"
			  + " * 这个类是经过约束依赖分析分析\n"
			  + " * */\n"
			  + "class ConstraintParameter\n"
			  + "{\n"
			  + "public:\n";
		return begin;
	}
	
	/*
	 * 获取当前的end注释
	 * */
	public String getHParam()
	{
		String param = "";
		param = param
			 + getComment("目标约束的参数数量")
			 + "\tstatic const int NUM_OF_PARAM = "
			 + ConstraintParameter.NumOfParam + ";\n\n"
			 
			 + getComment("约束的名字信息")
			 + "\tstatic string constraintName;\n\n"
			 
			 + getComment("约束的变量类型，使用bool变量表示，1表示浮点数，0表示整形")
			 + "\tstatic bool constraintVarType[NUM_OF_PARAM];\n\n"
			 
			 + getComment("变量的名字信息")
			 + "\tstatic string constraintVarName[NUM_OF_PARAM];\n\n"
		
			 + getComment("变量的整体依赖关系，使用bool变量表示，1表示相关，0表示不相关")
			 + "\tstatic bool constraintDependencyRela[NUM_OF_PARAM];\n\n"
			 
			 + getComment("所有的约束的数量")
			 + "\tstatic const int Num_Of_Constraints = "
			 + getNumOfConstraint() +";\n\n"
			 
			 + getComment("所有的约束的比较运算符的类型信息")
			 + "\tstatic int constraintCompType[Num_Of_Constraints];\n\n";
	
		
			List<String> hasComm=new ArrayList<>();
			hasComm.add("针对复杂约束昨晚化简和定义域求解之后，然后求解最小不可达集合，确定是否是无解的标志变量");
			hasComm.add(" eg x>0 && x<0  <===> 无解");
			hasComm.add("1）有解 ---------- true  没找到最小不可达集合，所以无法确定无解，也即有解");
			hasComm.add("2）无解 ---------- false 存在最小不可达集合，也即可以直接判定无解");
			
			param = param
			 + getComment(hasComm)
			 + "\tstatic const bool hasSolution = "+ConstraintParameter.hasSolution+";\n\n"
			 
			 + getComment("这个参数是用来记录当存在不可行解的时候，为什么不存在解的原因")
			 + "\tstatic string noSolutionInfo;\n\n";
			
			List<String> minNumComm=new ArrayList<>();
			minNumComm.add("这连个变量是定义求解的定义域的最大最小值，为什么用这两个值");
			minNumComm.add("的原因是这样的，首先这连个值的大小基本够用，其次这样容易去");
			minNumComm.add("做判断到底是区间走势");
			param = param
			+ getComment(minNumComm)
			+ "\tstatic const FloatType minNum = "+ConstraintParameter.minNum+";\n"
			+ "\tstatic const FloatType maxNum = "+ConstraintParameter.maxNum+";\n\n"
			
			 + getComment("所有的求解的结果的保留,这个主要存储的是经过化简求解过的变量的对应的值")
			 + "\tstatic map<string, FloatType> allVarEqualMap;\n\n"
			 
			 + getComment("所有的求解的结果的保留,这个主要存储的是每一个变量的定义域")
			 + "\tstatic FloatType left[NUM_OF_PARAM];\n"
			 + "\tstatic FloatType right[NUM_OF_PARAM];\n\n";
			
		return param;
	}
	
	
	/*
	 * 获取当前的end注释
	 * */
	public String getCParam()
	{
		String param = "";
		param = param			 
			 + getComment("约束的名字信息")
			 + "\tstring ConstraintParameter::constraintName = \""
			 +ConstraintParameter.constraintName+"\";\n\n"
			 
			 + getComment("约束的变量类型，使用bool变量表示，1表示浮点数，0表示整形")
			 + "\tbool ConstraintParameter::constraintVarType[NUM_OF_PARAM] = "
			 + "{ " + getCVarType() +" };\n\n"
			 
			 + getComment("变量的名字信息")
			 + "\tstring ConstraintParameter::constraintVarName[NUM_OF_PARAM] = "
			 + "{ " + getCVarName() +" };\n\n"
			 
			 + getComment("变量的整体依赖关系，使用bool变量表示，1表示相关，0表示不相关")
			 + "\tbool ConstraintParameter::constraintDependencyRela[NUM_OF_PARAM] = "
			 + "{ " + getCDepRela() +" };\n\n" ;
		
		ArrayList<String> comm = new ArrayList<>();
		comm.add("所有的约束的比较运算符的类型信息");
		comm.add("1 表示> , >= , < , <=四种情况");
		comm.add("0 表示 == 情况");
		comm.add("-1 表示 ！= 情况");
		
		param = param
			 + getComment(comm)
			 + "\tint ConstraintParameter::constraintCompType[Num_Of_Constraints] =  "
			 + "{ " + getCConstraintOp() +" };\n\n" ;
			 
		if(ConstraintParameter.hasSolution==true)
		{
			param = param
					 //这里对ConstraintParameter.noSolutionInfo做截取的原因是这个字符串的最后一行是换行符号\n
					 + getComment("这个参数是用来记录当存在不可行解的时候，为什么不存在解的原因")
					 + "\tstring ConstraintParameter::noSolutionInfo = \"\";\n\n";
		}else
		{
			param = param
					 //这里对ConstraintParameter.noSolutionInfo做截取的原因是这个字符串的最后一行是换行符号\n
					 + getComment("这个参数是用来记录当存在不可行解的时候，为什么不存在解的原因")
					 + "\tstring ConstraintParameter::noSolutionInfo = \"" 
					 + ConstraintParameter.noSolutionInfo.substring(0,ConstraintParameter.noSolutionInfo.length()-1)
					 +  "\";\n\n";
		}
		
			 
		param = param
			 + getComment("所有的求解的结果的保留,这个主要存储的是经过化简求解过的变量的对应的值")
			 + "\tmap<string, FloatType> ConstraintParameter::allVarEqualMap;\n\n"
			 
			 + getComment("所有的求解的结果的保留,这个主要存储的是每一个变量的定义域，")
			 + "\tFloatType ConstraintParameter::left[NUM_OF_PARAM] = {" + getDomain(0) + "};\n\n"
			 + "\tFloatType ConstraintParameter::right[NUM_OF_PARAM] = {" + getDomain(1) + "};\n\n";
		return param;
	}
	 
	public String getDomain(int key) 
	{
		String res="";
		if(key==0)
		{
			//区间的left值
			res+=ConstraintParameter.allVarDomain.get(0).left;
			for(int i=1;i<ConstraintParameter.allVarDomain.size();i++)
				res = res + " , " + ConstraintParameter.allVarDomain.get(i).left;
		}else if(key==1)
		{
			//区间的right值
			res+=ConstraintParameter.allVarDomain.get(0).right;
			for(int i=1;i<ConstraintParameter.allVarDomain.size();i++)
				res = res + " , " + ConstraintParameter.allVarDomain.get(i).right;
		}
		return res;
	}

	/*
	 * 获取当前约束的所有的比较运算符号
	 *  所有的约束的比较运算符的类型信息
	 *  1 表示> , >= , < , <=四种情况
	 *  0 表示 == 情况
	 * -1 表示 ！= 情况
	 * 这里只是处理析取范式的第一个合取子式
	 * */
	public String getCConstraintOp()
	{
		String res="";
		List<List<BinaryExpression>> all = BinaryExpressionParse.targetConstraint.getAtomicConstraintGroups();
		List<BinaryExpression> one = all.get(0);
		if(one.get(0).getOp() == Operator.EQ)
			res += "0";
		else if(one.get(0).getOp() == Operator.NE)
			res += "-1";
		else if(one.get(0).getOp() == Operator.GE || one.get(0).getOp() == Operator.GT)
			res += "1";
		else
			System.out.println("*************   Error  出现了不应该出现的符号，可能在做<和<=转换为>和>=的过程出了错误");
		
		for(int i=1; i<one.size(); i++)
		{
			if(one.get(i).getOp() == Operator.EQ)
				res += " , 0";
			else if(one.get(i).getOp() == Operator.NE)
				res += " , -1";
			else if(one.get(i).getOp() == Operator.GE  || one.get(i).getOp() == Operator.GT)
				res += " , 1";
			else
				System.out.println("*************   Error  出现了不应该出现的符号，可能在做<和<=转换为>和>=的过程出了错误");
		}
		
		//if(all.size()>=2)
			//System.out.println("*************   Warning 析取范式有多个合取子式   ***********");

		return res;
	}
	 
	/*
	 * 获取当前变量类型的信息
	 * 约束的变量类型，使用bool变量表示，1表示浮点数，0表示整形
	 * */
	public String getCDepRela()
	{
		String res="";
		if(ConstraintParameter.DependencyRele[0]==true)
			res += "true";
		else
			res += "false";
		
		for(int i=1; i<ConstraintParameter.DependencyRele.length; i++)
		{
			if(ConstraintParameter.DependencyRele[i]==true)
				res += " , true";
			else
				res += " , false";
		}
		return res;
	}
	
	
	/*
	 * 获取当前变量名字信息
	 * */
	public String getCVarName()
	{
		String res="";
		res = res + "\"" + ConstraintParameter.parameterNames[0] + "\"";
		for(int i=1; i<ConstraintParameter.parameterNames.length; i++)
		{
			res = res + " , " + "\"" + ConstraintParameter.parameterNames[i] + "\"";
		}
		return res;
	}
	
	/*
	 * 获取当前变量类型的信息
	 * 约束的变量类型，使用bool变量表示，1表示浮点数，0表示整形
	 * */
	public String getCVarType()
	{
		String res="";
		if(ConstraintParameter.parameterTypes[0].equals("int"))
			res+="0";
		else
			res +="1";
		for(int i=1; i<ConstraintParameter.parameterTypes.length; i++)
		{
			if(ConstraintParameter.parameterTypes[i].equals("int"))
				res+=" , 0";
			else
				res +=" , 1";
		}
		return res;
	}
	
	/*
	 * 获取第一个合取子式的约束的数量
	 * */
	int getNumOfConstraint()
	{
		return ConstraintParameter.NumOFConstraint;
	}
	
	/*
	 * 获取当前的end注释
	 * */
	public String getCFunction()
	{
		String func = "";
		
		List<String> initComm=new ArrayList<>();
		initComm.add("这个函数主要是针对复合约束预处理后的结果的初始化函数，由于是C++98的标准，没有办法直接初始化");
		initComm.add("主要有allVarEqualMap");
		func = func + getComment(initComm)
				+ "\tvoid ConstraintParameter::initConstraintPreprocess()\n"
				+ "\t{\n";
		
		func = func + func1InitContent() + "\t}\n\n";
		
		
		func = func + getComment("这个函数是用来获取约束的信息")
			+ "\tvector< vector<string> > ConstraintParameter::getConstraintInfo()\n"
			+ "\t{\n";
		func = func + func1Content() + "\t}\n\n";
	
		func = func + getComment("这个函数是用来获取约束的运行时刻值，用于CPU验证")
				+ "\tvector< vector<RuntimeValue*> > ConstraintParameter::getCoveredInfo(FloatType* nums)\n"
				+ "\t{\n";
		func = func + func2Content() + "\t}\n\n";
			
		
		List<List<BinaryExpression>> all = BinaryExpressionParse.targetConstraint.getAtomicConstraintGroups();
		List<BinaryExpression> one = all.get(0);
		
		ArrayList<String> comm = new ArrayList<String>();
		comm.add("下面是最后在CPU对求出的可行解向量做验证的函数，");
		comm.add("主要就是计算每一个简单子约束的运行时刻值，以及每一个简单自约束的满足情况");
		func += getComment(comm);
		
		ArrayList<String> order = getOrder();
		String paraList = getParaList();
		for(int i=0;i<order.size();i++)
		{
			String ind = order.get(i);
			func = func + "\tRuntimeValue* ConstraintParameter::getConstraintValue" + ind 
				+ "( " + paraList +" )\n";
			func += "\t{\n";
			func += "\t\tFloatType value = " + getInstrument(one.get(i)) +";\n";
			
			if(ATPC.forDouble)
			{
				if(one.get(i).getOp().equals(Operator.EQ))
					func = func + "\t\tbool isCovered = (bool)( abs(value)<=SolverParameter::floatAccuracy );\n";
				else
					func = func + "\t\tbool isCovered = (bool)(value " + getOp(one.get(i).getOp()) + " 0.0);\n";
			}
			else
			{
				if(one.get(i).getOp().equals(Operator.EQ))
					func = func + "\t\tbool isCovered = (bool)( abs(value)<=SolverParameter::floatAccuracy );\n";
				else
					func = func + "\t\tbool isCovered = (bool)(value " + getOp(one.get(i).getOp()) + " 0.f);\n";
			}
			
			//func += "\t\tbool isCovered = (" + getInstrumentForAccurcy(one.get(i)) +") * true;\n";
			
			
			func += "\t\tRuntimeValue* one = new RuntimeValue(value,isCovered);\n";
			func += "\t\treturn one;\n";
			func += "\t}\n\n";	
		}
		
		return func;
	}
	
	public String func1InitContent()
	{		
		String res = "";
		Set<String> set = ConstraintParameter.allVarEqualMap.keySet();
		for(String key:set)
		{
			String value=ConstraintParameter.allVarEqualMap.get(key);
			
			res = res + "\t\tConstraintParameter::allVarEqualMap[\""+key
					+"\"] = "+ value + ";\n";
		}
		return res;
	}

	/*
	 * 获取约束的
	 * */
	public String getInstrumentForAccurcy(BinaryExpression a)
	{
		if(a.getOp().equals(Operator.EQ))
		{
			return "abs( ( " + a.getOperand1().toString() + " ) - ( "
					+a.getOperand2().toString() + " ) ) <= SolverParameter::floatAccuracy";
		}else 
		{
			return a.toString();
		}
	}
	
	
	/*
	 * 获取约束的
	 * */
	public String getInstrument(BinaryExpression a)
	{
		String res = "( " + a.getOperand1().toString() + " ) - ( "
				   + a.getOperand2().toString() + " )";
		return res;
	}
	

	/*
	 * 获取函数1的内容
	 * */
	public String func1Content()
	{
		List<List<BinaryExpression>> all = BinaryExpressionParse.targetConstraint.getAtomicConstraintGroups();
		List<BinaryExpression> one = all.get(0);
		
		String res = "";
		res = res + "\t\tvector< vector<string> > res;\n\n"
			+ "\t\tvector<string> HeQv1;\n";
		
		for(BinaryExpression i : one)
		{
			res = res + "\t\tHeQv1.push_back(\"" + getInstrumentForAccurcy(i) + "\");\n";
		}
		res = res + "\n\t\tres.push_back(HeQv1);\n\n"
		    + "\t\treturn res;\n";
		return res;
	}
	
	
	/*
	 * 获取函数1的内容
	 * */
	public String func2Content()
	{
		List<List<BinaryExpression>> all = BinaryExpressionParse.targetConstraint.getAtomicConstraintGroups();
		List<BinaryExpression> one = all.get(0);
		
		String res = "";
		res = res + "\t\tvector< vector<RuntimeValue*> > res;\n\n"
			+ "\t\tvector<RuntimeValue*> HeQv1;\n\n";
		
		String param = "nums[" + 0 + "]";
		for(int i=1; i<ConstraintParameter.NumOfParam;i++)
			param = param + " , " + "nums[" + i + "]";
		
		for(int i=0; i<getNumOfConstraint(); i++)
		{			
			String order = "_0_" + i;
			res = res + "\t\tRuntimeValue* tmp"+order + " = getConstraintValue"+order+"("+param+");\n";
			res = res + "\t\tHeQv1.push_back(tmp" + order + ");\n";
		}
		res = res + "\n\t\tres.push_back(HeQv1);\n\n"
		    + "\t\treturn res;\n";
		return res;
	}
	
	/*
	 * 获取当前的end注释
	 * */
	public String getHFunction()
	{
		String func = "";
		
		List<String> initComm=new ArrayList<>();
		initComm.add("这个函数主要是针对复合约束预处理后的结果的初始化函数，由于是C++98的标准，没有办法直接初始化");
		initComm.add("主要有allVarEqualMap");
		
		func = func 
			+ getComment(initComm)
			+"\tstatic void initConstraintPreprocess();\n\n";
		
		func = func 
			+ getComment("这个函数是用来获取约束的信息")
			+ "\tstatic vector< vector<string> > getConstraintInfo();\n"
			+"\tstatic vector< vector<RuntimeValue*> > getCoveredInfo(FloatType* nums);\n\n";
		
		ArrayList<String> comm = new ArrayList<String>();
		comm.add("下面是最后在CPU对求出的可行解向量做验证的函数，");
		comm.add("主要就是计算每一个简单子约束的运行时刻值，以及每一个简单自约束的满足情况");
		func += getComment(comm);
		
		ArrayList<String> order = getOrder();
		String paraList = getParaList();
		for(String i : order)
		{
			func = func +  "\tstatic RuntimeValue* getConstraintValue"
				 + i + "(" + paraList +");\n";
		}
		
		return func;
	}
	
	
	/*
	 * 获取当前的Parammeter注释
	 * */
	public String getParaList()
	{
		String para = "FloatType "+ConstraintParameter.parameterNames[0];
		for(int i=1;i<ConstraintParameter.NumOfParam;i++)
			para += " , " + "FloatType "+ConstraintParameter.parameterNames[i];
		return para;
	}
	
	
	/*
	 * 根据约束的数量来生成各个函数
	 * 要注意的是这里只考虑析取范式的第一个合取子式
	 * */
	public ArrayList<String> getOrder()
	{
		ArrayList<String> res = new ArrayList<>();
		for(int i=0; i<getNumOfConstraint(); i++)
		{
			String one = "_0_"+i;
			res.add(one);
		}
		return res;
	}
	
	
	/*
	 * 获取当前的end注释
	 * */
	public String getHEnd()
	{
		String end = "};\n"
				   + "\n"
				   + "#endif /* CONSTRAINTPARAMETER_CUH_ */\n";
		return end;
	}
	
	/*
	 * 获取约束的
	 * */
	public String getOp(Operator op)
	{
		String res = ">=";
		if(op==Operator.GE)
			res = ">=";
		else if(op==Operator.GT)
			res = ">";
		else if(op==Operator.EQ)
			res = "==";
		else if(op==Operator.NE)
			res = "!=";
		else 
			System.out.println("*************    Error:约束出现<和<=的情况，应该是转化为>和>=的过程中出现问题了");
		return res;
	}
	
	/*
	 * 获取当前的注释
	 * */
	public String getComment(String comm)
	{
		String res = "\t/*\n"
		           + "\t * " + comm + "\n" 
		           + "\t * */ \n";
		return res;
	}
	
	/*
	 * 获取当前的注释
	 * */
	public String getComment(List<String> comm)
	{
		String res = "\t/*\n";
		for(String oneString : comm)
		{
			res += "\t * " + oneString + "\n" ;
		}
		res += "\t * */ \n";
		return res;
	}
	
	/*
	 * 获取当前的日期的字符串
	 * */
	public String getNowTime()
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(d);
		return time;
	}
}

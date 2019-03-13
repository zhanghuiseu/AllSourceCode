package cn.nju.seg.atpc.main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import cn.nju.seg.atpc.parser.BinaryExpressionParse;

/*
 * @author zhanghui
 * */
public class Main
{
	public void dealWithInit()
	{
		List<String> functionName, binaryExp,paraName,paraType;
/*       //OK 0-4
        BenchmarkBlind.initBenchmark();
		functionName = BenchmarkBlind.functionName;
		binaryExp = BenchmarkBlind.binaryExp;
		paraName = BenchmarkBlind.paraName;
		paraType = BenchmarkBlind.paraType;
	
		//OK 0-6
		BenchmarkDart.initBenchmark();
		functionName = BenchmarkDart.functionName;
		binaryExp = BenchmarkDart.binaryExp;
		paraName = BenchmarkDart.paraName;
		paraType = BenchmarkDart.paraType;
		
		//OK 0-4
		BenchmarkHashCode.initBenchmark();
		functionName = BenchmarkHashCode.functionName;
		binaryExp = BenchmarkHashCode.binaryExp;
		paraName = BenchmarkHashCode.paraName;
		paraType = BenchmarkHashCode.paraType;

		//OK 0-6
		BenchmarkPower.initBenchmark();
		functionName = BenchmarkPower.functionName;
		binaryExp = BenchmarkPower.binaryExp;
		paraName = BenchmarkPower.paraName;
		paraType = BenchmarkPower.paraType;
		
		//OK 0-4
		BenchmarkStat.initBenchmark();
		functionName = BenchmarkStat.functionName;
		binaryExp = BenchmarkStat.binaryExp;
		paraName = BenchmarkStat.paraName;
		paraType = BenchmarkStat.paraType;
		
		//OK 0-15
		BenchmarkTcas.initBenchmark();
		functionName = BenchmarkTcas.functionName;
		binaryExp = BenchmarkTcas.binaryExp;
		paraName = BenchmarkTcas.paraName;
		paraType = BenchmarkTcas.paraType;
		
		//有两个不容易求解 0-17
		BenchmarkApollo.initBenchmark();
		functionName = BenchmarkApollo.functionName;
		binaryExp = BenchmarkApollo.binaryExp;
		paraName = BenchmarkApollo.paraName;
		paraType = BenchmarkApollo.paraType;
		
		//有几个不太容易的解
		//Powell 0-8 Wood 0-19 Beale 0-5 FreudensteinRoth0-5  HV0-18
		//Rosenbrock0-2
		BenchmarkOpti.initBenchmark();
		functionName = BenchmarkOpti.functionName;
		binaryExp = BenchmarkOpti.binaryExp;
		paraName = BenchmarkOpti.paraName;
		paraType = BenchmarkOpti.paraType;
		
		//有几个不太容易的解 Conflict 0-17 TurnLogic0-23
		BenchmarkTsafe.initBenchmark();
		functionName = BenchmarkTsafe.functionName;
		binaryExp = BenchmarkTsafe.binaryExp;
		paraName = BenchmarkTsafe.paraName;
		paraType = BenchmarkTsafe.paraType;
		
		//SphereIntersect0-20
		BenchmarkRaytrace.initBenchmark();
		functionName = BenchmarkRaytrace.functionName;
		binaryExp = BenchmarkRaytrace.binaryExp;
		paraName = BenchmarkRaytrace.paraName;
		paraType = BenchmarkRaytrace.paraType;
		
		int i = 21;
		BinaryExpressionParse.initAll(binaryExp.get(i),functionName.get(i),paraType.get(i),paraName.get(i));
		String filepath1 = "/home/zy/Cuda_Workspace/LFF Solver/src/ConstraintParser";
		String filepath2 = "/home/zy/Cuda_Workspace/LFF Solver/src/cuda";
		BinaryExpressionParse.beginAutoGenerateParallelCode(filepath1,filepath2);
		System.out.println("***** Game Over *****");
*/	
}
	public void dealWithOUTInit()
	{
		/*		//OK 0-4
        BenchmarkBlindWithoutInit.initBenchmark();
		functionName = BenchmarkBlindWithoutInit.functionName;
		binaryExp = BenchmarkBlindWithoutInit.binaryExp;
		paraName = BenchmarkBlindWithoutInit.paraName;
		paraType = BenchmarkBlindWithoutInit.paraType;
		//OK 0-6
		BenchmarkDartWithoutInit.initBenchmark();
		functionName = BenchmarkDartWithoutInit.functionName;
		binaryExp = BenchmarkDartWithoutInit.binaryExp;
		paraName = BenchmarkDartWithoutInit.paraName;
		paraType = BenchmarkDartWithoutInit.paraType;
		//OK 0-6
		BenchmarkPowerWithoutInit.initBenchmark();
		functionName = BenchmarkPowerWithoutInit.functionName;
		binaryExp = BenchmarkPowerWithoutInit.binaryExp;
		paraName = BenchmarkPowerWithoutInit.paraName;
		paraType = BenchmarkPowerWithoutInit.paraType;
		//OK 0-4
		BenchmarkStatWithoutInit.initBenchmark();
		functionName = BenchmarkStatWithoutInit.functionName;
		binaryExp = BenchmarkStatWithoutInit.binaryExp;
		paraName = BenchmarkStatWithoutInit.paraName;
		paraType = BenchmarkStatWithoutInit.paraType;
		//OK 0-15
		BenchmarkTcasWithoutInit.initBenchmark();
		functionName = BenchmarkTcasWithoutInit.functionName;
		binaryExp = BenchmarkTcasWithoutInit.binaryExp;
		paraName = BenchmarkTcasWithoutInit.paraName;
		paraType = BenchmarkTcasWithoutInit.paraType;
		//有两个不容易求解 0-17
		BenchmarkApolloWithoutInit.initBenchmark();
		functionName = BenchmarkApolloWithoutInit.functionName;
		binaryExp = BenchmarkApolloWithoutInit.binaryExp;
		paraName = BenchmarkApolloWithoutInit.paraName;
		paraType = BenchmarkApolloWithoutInit.paraType;
		//有几个不太容易的解
		//Powell 0-8 Wood 0-19 Beale 0-5 FreudensteinRoth0-5  HV0-18
		//Rosenbrock0-2
		BenchmarkOptiWithoutInit.initBenchmark();
		functionName = BenchmarkOptiWithoutInit.functionName;
		binaryExp = BenchmarkOptiWithoutInit.binaryExp;
		paraName = BenchmarkOptiWithoutInit.paraName;
		paraType = BenchmarkOptiWithoutInit.paraType;
		//有几个不太容易的解 Conflict 0-17 TurnLogic0-23
		BenchmarkTsafeWithoutInit.initBenchmark();
		functionName = BenchmarkTsafeWithoutInit.functionName;
		binaryExp = BenchmarkTsafeWithoutInit.binaryExp;
		paraName = BenchmarkTsafeWithoutInit.paraName;
		paraType = BenchmarkTsafeWithoutInit.paraType;
		//SphereIntersect0-20
		BenchmarkRaytraceWithoutInit.initBenchmark();
		functionName = BenchmarkRaytraceWithoutInit.functionName;
		binaryExp = BenchmarkRaytraceWithoutInit.binaryExp;
		paraName = BenchmarkRaytraceWithoutInit.paraName;
		paraType = BenchmarkRaytraceWithoutInit.paraType;
		//SphereIntersect0-20
		BenchmarkRaytraceWithoutInit.initBenchmark();
		functionName = BenchmarkRaytraceWithoutInit.functionName;
		binaryExp = BenchmarkRaytraceWithoutInit.binaryExp;
		paraName = BenchmarkRaytraceWithoutInit.paraName;
		paraType = BenchmarkRaytraceWithoutInit.paraType;
	*/
	}
	public void forZYF()
	{
		/*		BenchMarkForZYFWithInit.sp();
		List<String> functionName = BenchMarkForZYFWithInit.functionName;
		List<String> binaryExp = BenchMarkForZYFWithInit.binaryExp;
		List<String> paraName = BenchMarkForZYFWithInit.paraName;
		List<String> paraType = BenchMarkForZYFWithInit.paraType;
		List<String> initNum = BenchMarkForZYFWithInit.initNum;
		
		BenchMarkForZYF.sp1();
		List<String> functionName = BenchMarkForZYF.functionName;
		List<String> binaryExp = BenchMarkForZYF.binaryExp;
		List<String> paraName = BenchMarkForZYF.paraName;
		List<String> paraType = BenchMarkForZYF.paraType;
		List<String> initNum = BenchMarkForZYF.initNum;
		 
		for(int i=0;i<functionName.size();i++)
		{
			if(initNum.size()<=0 || initNum.size()!=binaryExp.size())
				BinaryExpressionParse.initAll(binaryExp.get(i),functionName.get(i),paraType.get(i),paraName.get(i));
			else 
				BinaryExpressionParse.initAll(binaryExp.get(i),functionName.get(i),paraType.get(i),paraName.get(i),initNum.get(i));
			BinaryExpressionParse.beginSolver();
			System.gc();
		}
		*/
	}
	
	
	public static void main(String[] args)
	{
/*		String fileName = "file1.data";
		if(ATPC.showLFFGUI == true)
			LFFGUI.begintGUI(fileName);
*/	
		
		String folderPath="/home/zy/cudaWorkspaceServer/JavaJar/one.constraint";
		if(args.length==1)
			folderPath = args[0];
		
		String constraint=null,varType=null,varName=null;
		try {
            BufferedReader bufferRead=new BufferedReader(new FileReader(new File(folderPath)));
            constraint = bufferRead.readLine();
            varType    = bufferRead.readLine();
            varName    = bufferRead.readLine();
            bufferRead.close();
        }catch (Exception e){   
            e.printStackTrace();   
        }
	
		if(constraint!=null && varType!=null && varName!=null)
		{
			String cudaPath = folderPath.substring(0, folderPath.lastIndexOf("/"));
			cudaPath = cudaPath.substring(0, cudaPath.lastIndexOf("/"));
			
			BinaryExpressionParse.initAll(constraint,"PLFFSolver",varType,varName);
			
			String filepath1 = cudaPath  + "/CUDA/LFFSolver/src/ConstraintParser";
			String filepath2 =  cudaPath + "/CUDA/LFFSolver/src/cuda";
			
			//System.out.println(filepath1);
			BinaryExpressionParse.beginAutoGenerateParallelCode(filepath1,filepath2);
		
			System.out.println("SUCC");
		}else
			System.out.println("FAIL");
		System.exit(0);	
	}
}

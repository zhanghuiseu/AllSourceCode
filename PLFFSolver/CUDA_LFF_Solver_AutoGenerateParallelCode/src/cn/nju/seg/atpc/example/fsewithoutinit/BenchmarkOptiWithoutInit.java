package cn.nju.seg.atpc.example.fsewithoutinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkOptiWithoutInit 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	

		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetBeale.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.566 seconds.
		functionName.add(" JpfTargetBeale.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.05 seconds.
		functionName.add(" JpfTargetBeale.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetBeale.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.004 seconds.
		functionName.add(" JpfTargetBeale.main()_3");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.008 seconds.
		functionName.add(" JpfTargetBeale.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetBeale.main()_5");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))>0.0))");


		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetFreudensteinRoth.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.567 seconds.
		functionName.add(" JpfTargetFreudensteinRoth.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.043 seconds.
		functionName.add(" JpfTargetFreudensteinRoth.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.004 seconds.
		functionName.add(" JpfTargetFreudensteinRoth.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))>0.0))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.006 seconds.
		functionName.add(" JpfTargetFreudensteinRoth.main()_3");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.01 seconds.
		functionName.add(" JpfTargetFreudensteinRoth.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.009 seconds.
		functionName.add(" JpfTargetFreudensteinRoth.main()_5");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))>0.0))");


		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetHelicalValley.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.565 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_0");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.029 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_1");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((0.0==x1_4_SYMREAL))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.004 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_2");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.004 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_3");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.037 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_4");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((0.0==x1_4_SYMREAL)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.028 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_5");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL>0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.005 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_6");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_7");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.007 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_8");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))<0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.009 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_9");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.071 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_10");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))>0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.078 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_11");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))<0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");

		//   应该是无解    Parse time: 0.0 seconds.     Solve time: 0.51 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_12");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL,x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((10.0*(exp(((x1_1_SYMREAL*x1_1_SYMREAL)+(x2_2_SYMREAL*x2_2_SYMREAL)))-1.0))<0.0)) && ((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");

		// 有解  Parse time: 0.0 seconds.     Solve time: 0.301 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_13");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL,x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((0.0==(10.0*(exp(((x1_1_SYMREAL*x1_1_SYMREAL)+(x2_2_SYMREAL*x2_2_SYMREAL)))-1.0)))) && ((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.502 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_14");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL,x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((10.0*(exp(((x1_1_SYMREAL*x1_1_SYMREAL)+(x2_2_SYMREAL*x2_2_SYMREAL)))-1.0))>0.0)) && ((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");


		//Parse time: 0.0 seconds.     Solve time: 0.018 seconds.
		functionName.add(" JpfTargetHelicalValley.main()_15");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))>0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");


		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetPowell.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.562 seconds.
		functionName.add(" JpfTargetPowell.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.048 seconds.
		functionName.add(" JpfTargetPowell.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.006 seconds.
		functionName.add(" JpfTargetPowell.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetPowell.main()_3");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.494 seconds.
		functionName.add(" JpfTargetPowell.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((((pow(2.718281828459045, (0.0-x1_1_SYMREAL))+pow(2.718281828459045, (0.0-x2_2_SYMREAL)))-1.0001)<0.0)) && ((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.272 seconds.
		functionName.add(" JpfTargetPowell.main()_5");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==((pow(2.718281828459045, (0.0-x1_1_SYMREAL))+pow(2.718281828459045, (0.0-x2_2_SYMREAL)))-1.0001))) && ((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.012 seconds.
		functionName.add(" JpfTargetPowell.main()_6");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((((pow(2.718281828459045, (0.0-x1_1_SYMREAL))+pow(2.718281828459045, (0.0-x2_2_SYMREAL)))-1.0001)>0.0)) && ((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.004 seconds.
		functionName.add(" JpfTargetPowell.main()_7");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.007 seconds.
		functionName.add(" JpfTargetPowell.main()_8");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)>0.0))");



		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetRosenbrock.main().txt      *********/
		//Parse time: 0.005 seconds.     Solve time: 0.916 seconds.
		functionName.add(" JpfTargetRosenbrock.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow((1.0-x1_1_SYMREAL), 2.0)+(100.0*pow((x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)), 2.0)))<0.0))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.249 seconds.
		functionName.add(" JpfTargetRosenbrock.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(pow((1.0-x1_1_SYMREAL), 2.0)+(100.0*pow((x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)), 2.0)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetRosenbrock.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow((1.0-x1_1_SYMREAL), 2.0)+(100.0*pow((x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)), 2.0)))>0.0))");


		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetWood.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.565 seconds.
		functionName.add(" JpfTargetWood.main()_0");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.012 seconds.
		functionName.add(" JpfTargetWood.main()_1");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.005 seconds.
		functionName.add(" JpfTargetWood.main()_2");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.005 seconds.
		functionName.add(" JpfTargetWood.main()_3");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.116 seconds.
		functionName.add(" JpfTargetWood.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)<0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.195 seconds.
		functionName.add(" JpfTargetWood.main()_5");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.051 seconds.
		functionName.add(" JpfTargetWood.main()_6");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)>0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.056 seconds.
		functionName.add(" JpfTargetWood.main()_7");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)<0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.053 seconds.
		functionName.add(" JpfTargetWood.main()_8");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)>0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetWood.main()_9");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))>0.0))");
	
		

	}
}

package cn.nju.seg.atpc.example.fsewithinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkOpti 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/opti/JpfTargetPowell.main().txt      *********/
/*		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetPowell.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowell.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowell.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)>0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowell.main()_3");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowell.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((((pow(2.718281828459045, (0.0-x1_1_SYMREAL))+pow(2.718281828459045, (0.0-x2_2_SYMREAL)))-1.0001)<0.0)) && ((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowell.main()_5");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==((pow(2.718281828459045, (0.0-x1_1_SYMREAL))+pow(2.718281828459045, (0.0-x2_2_SYMREAL)))-1.0001))) && ((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.001 seconds.     
		functionName.add(" JpfTargetPowell.main()_6");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((((pow(2.718281828459045, (0.0-x1_1_SYMREAL))+pow(2.718281828459045, (0.0-x2_2_SYMREAL)))-1.0001)>0.0)) && ((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowell.main()_7");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowell.main()_8");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((10000.0*x1_1_SYMREAL)*x2_2_SYMREAL)-1.0)>0.0))");
*/		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/opti/JpfTargetWood.main().txt      *********/
/*		//Parse time: 0.005 seconds.     
		functionName.add(" JpfTargetWood.main()_0");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_1");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_2");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))>0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_3");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)<0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_5");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_6");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)>0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_7");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)<0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_8");
		paraName.add("x4_4_SYMREAL,x3_3_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL)))<0.0)) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_9");
		paraName.add("x4_4_SYMREAL,x3_3_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((0.0==(9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL))))) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_10");
		paraName.add("x4_4_SYMREAL,x3_3_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL)))>0.0)) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_11");
		paraName.add("x4_4_SYMREAL,x3_3_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL)))<0.0)) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_12");
		paraName.add("x3_3_SYMREAL,x4_4_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.0-x3_3_SYMREAL)<0.0)) && ((0.0==(9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL))))) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_13");
		paraName.add("x3_3_SYMREAL,x4_4_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((0.0==(1.0-x3_3_SYMREAL))) && ((0.0==(9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL))))) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_14");
		paraName.add("x3_3_SYMREAL,x4_4_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.0-x3_3_SYMREAL)>0.0)) && ((0.0==(9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL))))) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_15");
		paraName.add("x3_3_SYMREAL,x4_4_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.0-x3_3_SYMREAL)<0.0)) && ((0.0==(9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL))))) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_16");
		paraName.add("x3_3_SYMREAL,x4_4_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.0-x3_3_SYMREAL)>0.0)) && ((0.0==(9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL))))) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_17");
		paraName.add("x4_4_SYMREAL,x3_3_SYMREAL,x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((9.486832980505138*(x4_4_SYMREAL-(x3_3_SYMREAL*x3_3_SYMREAL)))>0.0)) && ((0.0==(1.0-x1_1_SYMREAL))) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_18");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.0-x1_1_SYMREAL)>0.0)) && ((0.0==(10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetWood.main()_19");
		paraName.add("x2_2_SYMREAL,x1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((10.0*(x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)))>0.0))");
*/		
			/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/opti/JpfTargetBeale.main().txt      *********/
/*		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetBeale.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetBeale.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetBeale.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))>0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetBeale.main()_3");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetBeale.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetBeale.main()_5");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((1.5-(x1_1_SYMREAL*(1.0-x2_2_SYMREAL)))>0.0))");
*/		
			/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/opti/JpfTargetFreudensteinRoth.main().txt      *********/
/*		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetFreudensteinRoth.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetFreudensteinRoth.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetFreudensteinRoth.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))>0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetFreudensteinRoth.main()_3");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetFreudensteinRoth.main()_4");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetFreudensteinRoth.main()_5");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((x1_1_SYMREAL+-13.0)+((((5.0-x2_2_SYMREAL)*x2_2_SYMREAL)-2.0)*x2_2_SYMREAL))+((x1_1_SYMREAL+-29.0)+((((x2_2_SYMREAL+1.0)*x2_2_SYMREAL)-14.0)*x2_2_SYMREAL)))>0.0))");
*/		
			/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/opti/JpfTargetHelicalValley.main().txt      *********/
/*		//Parse time: 0.005 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_0");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_1");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((0.0==x1_4_SYMREAL))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_2");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL>0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_3");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.001 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_4");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((0.0==x1_4_SYMREAL)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_5");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL>0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_6");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_7");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_8");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))<0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_9");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_10");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))>0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_11");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))<0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_12");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL,x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((10.0*(exp(((x1_1_SYMREAL*x1_1_SYMREAL)+(x2_2_SYMREAL*x2_2_SYMREAL)))-1.0))<0.0)) && ((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_13");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL,x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((0.0==(10.0*(exp(((x1_1_SYMREAL*x1_1_SYMREAL)+(x2_2_SYMREAL*x2_2_SYMREAL)))-1.0)))) && ((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_14");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL,x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((10.0*(exp(((x1_1_SYMREAL*x1_1_SYMREAL)+(x2_2_SYMREAL*x2_2_SYMREAL)))-1.0))>0.0)) && ((0.0==(10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5)))))) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_15");
		paraName.add("x3_3_SYMREAL,x2_5_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((10.0*(x3_3_SYMREAL-(10.0*((atan((x2_5_SYMREAL/x1_4_SYMREAL))/6.283185307179586)+0.5))))>0.0)) && ((x1_4_SYMREAL!=0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_16");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL==0.0)) && ((x1_4_SYMREAL<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_17");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((x1_4_SYMREAL<0.0)) && ((0.0==x1_4_SYMREAL))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetHelicalValley.main()_18");
		paraName.add("x1_4_SYMREAL");
		paraType.add("double");
		binaryExp.add("((0.0==x1_4_SYMREAL))");
*/		
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/opti/JpfTargetRosenbrock.main().txt      *********/
		//Parse time: 0.003 seconds.     
		functionName.add(" JpfTargetRosenbrock.main()_0");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow((1.0-x1_1_SYMREAL), 2.0)+(100.0*pow((x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)), 2.0)))<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRosenbrock.main()_1");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(pow((1.0-x1_1_SYMREAL), 2.0)+(100.0*pow((x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)), 2.0)))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRosenbrock.main()_2");
		paraName.add("x1_1_SYMREAL,x2_2_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((pow((1.0-x1_1_SYMREAL), 2.0)+(100.0*pow((x2_2_SYMREAL-(x1_1_SYMREAL*x1_1_SYMREAL)), 2.0)))>0.0))");
		
	

	}
}

package cn.nju.seg.atpc.example.fsewithoutinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkRaytraceWithoutInit 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		 /* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetRayTrace.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.735 seconds.
		functionName.add(" JpfTargetRayTrace.main()_0");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.251 seconds.
		functionName.add(" JpfTargetRayTrace.main()_1");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetRayTrace.main()_2");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.085 seconds.
		functionName.add(" JpfTargetRayTrace.main()_3");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.02 seconds.
		functionName.add(" JpfTargetRayTrace.main()_4");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetRayTrace.main()_5");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.047 seconds.
		functionName.add(" JpfTargetRayTrace.main()_6");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.089 seconds.
		functionName.add(" JpfTargetRayTrace.main()_7");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-r_4_SYMREAL)<3.4028234663852886E38)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");

		//Parse time: 0.001 seconds.     Solve time: 1.511 seconds.
		functionName.add(" JpfTargetRayTrace.main()_8");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((3.4028234663852886E38==(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-r_4_SYMREAL))) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");	
		
		//Parse time: 0.0 seconds.     Solve time: 1.158 seconds.
		functionName.add(" JpfTargetRayTrace.main()_9");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-r_4_SYMREAL)>3.4028234663852886E38)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.075 seconds.
		functionName.add(" JpfTargetRayTrace.main()_10");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))<0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");

		//Parse time: 0.0 seconds.     Solve time: 2.097 seconds.
		functionName.add(" JpfTargetRayTrace.main()_11");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL))))) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");	
	
		//Parse time: 0.0 seconds.     Solve time: 0.452 seconds.
		functionName.add(" JpfTargetRayTrace.main()_12");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
	
		//Parse time: 0.0 seconds.     Solve time: 0.077 seconds.
		functionName.add(" JpfTargetRayTrace.main()_13");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))<0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.157 seconds.
		functionName.add(" JpfTargetRayTrace.main()_14");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))<3.4028234663852886E38)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
	
		//Parse time: 0.0 seconds.     Solve time: 3.242 seconds.
		functionName.add(" JpfTargetRayTrace.main()_15");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((3.4028234663852886E38==(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL))))))) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
				
		//Parse time: 0.0 seconds.     Solve time: 3.204 seconds.
		functionName.add(" JpfTargetRayTrace.main()_16");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))>3.4028234663852886E38)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.488 seconds.
		functionName.add(" JpfTargetRayTrace.main()_17");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))<0.0)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 4.652 seconds.
		functionName.add(" JpfTargetRayTrace.main()_18");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL))))))) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
	
		//Parse time: 0.0 seconds.     Solve time: 1.673 seconds.
		functionName.add(" JpfTargetRayTrace.main()_19");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))>0.0)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 1.298 seconds.
		functionName.add(" JpfTargetRayTrace.main()_20");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))<0.0)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");

		//Parse time: 0.0 seconds.     Solve time: 1.04 seconds.
		functionName.add(" JpfTargetRayTrace.main()_21");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))>0.0)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");


		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetSphereIntersect.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.824 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_0");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.142 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_1");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_2");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.04 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_3");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.055 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_4");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_5");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.052 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_6");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.523 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_7");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 1.646 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_8");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL))) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.259 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_9");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)>0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.952 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_10");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))<0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
	
		//Parse time: 0.001 seconds.     Solve time: 2.284 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_11");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL))))) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.084 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_12");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.076 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_13");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))<0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.556 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_14");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))<0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");

		//Parse time: 0.0 seconds.     Solve time: 4.544 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_15");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL))))))) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.001 seconds.     Solve time: 3.993 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_16");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))>0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");

		//Parse time: 0.0 seconds.     Solve time: 2.015 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_17");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))<0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		

		//Parse time: 0.0 seconds.     Solve time: 4.582 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_18");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL))))))) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 3.843 seconds.
		functionName.add(" JpfTargetSphereIntersect.main()_19");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))>0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");



		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetSphereShade.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.808 seconds.
		functionName.add(" JpfTargetSphereShade.main()_0");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.193 seconds.
		functionName.add(" JpfTargetSphereShade.main()_1");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetSphereShade.main()_2");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.029 seconds.
		functionName.add(" JpfTargetSphereShade.main()_3");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.043 seconds.
		functionName.add(" JpfTargetSphereShade.main()_4");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetSphereShade.main()_5");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.046 seconds.
		functionName.add(" JpfTargetSphereShade.main()_6");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.05 seconds.
		functionName.add(" JpfTargetSphereShade.main()_7");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT==0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.235 seconds.
		functionName.add(" JpfTargetSphereShade.main()_8");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.054 seconds.
		functionName.add(" JpfTargetSphereShade.main()_9");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT!=1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.031 seconds.
		functionName.add(" JpfTargetSphereShade.main()_10");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.299 seconds.
		functionName.add(" JpfTargetSphereShade.main()_11");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("(((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<0.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.25 seconds.
		functionName.add(" JpfTargetSphereShade.main()_12");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("((0.0==(((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.06 seconds.
		functionName.add(" JpfTargetSphereShade.main()_13");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("(((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))>0.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.147 seconds.
		functionName.add(" JpfTargetSphereShade.main()_14");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("(((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<1.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.155 seconds.
		functionName.add(" JpfTargetSphereShade.main()_15");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("((1.0==(((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");


		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetSurfaceShade.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.565 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_0");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT==0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_1");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_2");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT!=1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.008 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_3");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.328 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_4");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<0.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.231 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_5");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((0.0==(((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.065 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_6");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))>0.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.021 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_7");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.02 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_8");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((1.0==(((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_9");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))>1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.076 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_10");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.065 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_11");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");

		//Parse time: 0.0 seconds.     Solve time: 0.381 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_12");
		paraName.add("lType_20_SYMINT,lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_20_SYMINT==0)) && ((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.049 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_13");
		paraName.add("lType_20_SYMINT,lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_20_SYMINT!=2)) && ((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.245 seconds.
		functionName.add(" JpfTargetSurfaceShade.main()_14");
		paraName.add("lType_20_SYMINT,lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_20_SYMINT==2)) && ((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");


 		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetVector3DNormalize.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.803 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_0");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.17 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_1");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_2");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.011 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_3");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.025 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_4");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_5");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.238 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_6");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.066 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_7");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.138 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_8");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))==0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");
	
		//Parse time: 0.0 seconds.     Solve time: 0.021 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_9");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_10");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_11");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");

		//Parse time: 0.0 seconds.     Solve time: 0.115 seconds.
		functionName.add(" JpfTargetVector3DNormalize.main()_12");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))==0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");




	}
}

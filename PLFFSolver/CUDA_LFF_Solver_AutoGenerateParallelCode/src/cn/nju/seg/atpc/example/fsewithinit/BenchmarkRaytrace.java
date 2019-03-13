package cn.nju.seg.atpc.example.fsewithinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkRaytrace 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/raytrace/JpfTargetSphereIntersect.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_0");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_1");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_2");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_3");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_4");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_5");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_6");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_7");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_8");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL))) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_9");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)>0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_10");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))<0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.001 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_11");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL))))) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_12");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_13");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))<0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_14");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))<0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_15");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL))))))) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_16");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))>0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_17");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))<0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_18");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL))))))) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_19");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL,rad_14_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-exp((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))>0.0)) && (((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereIntersect.main()_20");
		paraName.add("rad_14_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeX_15_SYMREAL,y_12_SYMREAL,eyeY_16_SYMREAL,z_13_SYMREAL,eyeZ_17_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((rad_14_SYMREAL*rad_14_SYMREAL)+(((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))*((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))))-((x_11_SYMREAL-eyeX_15_SYMREAL)*(x_11_SYMREAL-eyeX_15_SYMREAL)))-((y_12_SYMREAL-eyeY_16_SYMREAL)*(y_12_SYMREAL-eyeY_16_SYMREAL)))-((z_13_SYMREAL-eyeZ_17_SYMREAL)*(z_13_SYMREAL-eyeZ_17_SYMREAL)))>0.0)) && (((((((dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(x_11_SYMREAL-eyeX_15_SYMREAL))+((dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(y_12_SYMREAL-eyeY_16_SYMREAL)))+((dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))*(z_13_SYMREAL-eyeZ_17_SYMREAL)))-rad_14_SYMREAL)<0.0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
			/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/raytrace/JpfTargetVector3DNormalize.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_0");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_1");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))))");
		
		//Parse time: 0.001 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_2");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_3");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_4");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_5");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_6");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_7");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_8");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))==0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_9");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_10");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_11");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))!=0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetVector3DNormalize.main()_12");
		paraName.add("x_1_SYMREAL,y_2_SYMREAL,z_3_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL)))==0.0)) && (((((x_1_SYMREAL*x_1_SYMREAL)+(y_2_SYMREAL*y_2_SYMREAL))+(z_3_SYMREAL*z_3_SYMREAL))>1.0))");
		
			/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/raytrace/JpfTargetSurfaceShade.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_0");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT==0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_1");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_2");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT!=1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_3");
		paraName.add("lType_20_SYMINT");
		paraType.add("int");
		binaryExp.add("((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_4");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<0.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_5");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((0.0==(((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_6");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))>0.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_7");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_8");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((1.0==(((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_9");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("(((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))>1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.001 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_10");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_11");
		paraName.add("lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL,lType_20_SYMINT");
		paraType.add("double,double,double,int");
		binaryExp.add("((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_12");
		paraName.add("lType_20_SYMINT,lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_20_SYMINT==0)) && ((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSurfaceShade.main()_13");
		paraName.add("lType_20_SYMINT,lX_21_SYMREAL,lY_22_SYMREAL,lZ_23_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_20_SYMINT!=2)) && ((exp((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL)))!=0.0)) && (((((lX_21_SYMREAL*lX_21_SYMREAL)+(lY_22_SYMREAL*lY_22_SYMREAL))+(lZ_23_SYMREAL*lZ_23_SYMREAL))<1.0)) && ((lType_20_SYMINT==1)) && ((lType_20_SYMINT!=0))");
		
			/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/raytrace/JpfTargetSphereShade.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_0");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_1");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_2");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_3");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_4");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_5");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_6");
		paraName.add("dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_7");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT==0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_8");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_9");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT!=1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.001 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_10");
		paraName.add("lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("int,double,double,double");
		binaryExp.add("((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_11");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("(((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<0.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_12");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("((0.0==(((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_13");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("(((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))>0.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_14");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("(((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<1.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_15");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("((1.0==(((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_16");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("(((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))>1.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_17");
		paraName.add("lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL");
		paraType.add("double,double,double,int,double,double,double");
		binaryExp.add("((exp((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))!=0.0)) && (((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<1.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_18");
		paraName.add("eyeX_15_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeY_16_SYMREAL,y_12_SYMREAL,eyeZ_17_SYMREAL,z_13_SYMREAL,lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT");
		paraType.add("double,double,double,double,double,double,double,double,double,double,double,double,int");
		binaryExp.add("(((((((eyeX_15_SYMREAL+(0.0*(dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-x_11_SYMREAL)*((eyeX_15_SYMREAL+(0.0*(dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-x_11_SYMREAL))+(((eyeY_16_SYMREAL+(0.0*(dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-y_12_SYMREAL)*((eyeY_16_SYMREAL+(0.0*(dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-y_12_SYMREAL)))+(((eyeZ_17_SYMREAL+(0.0*(dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-z_13_SYMREAL)*((eyeZ_17_SYMREAL+(0.0*(dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-z_13_SYMREAL)))<0.0)) && ((exp((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))!=0.0)) && (((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<1.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_19");
		paraName.add("eyeX_15_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeY_16_SYMREAL,y_12_SYMREAL,eyeZ_17_SYMREAL,z_13_SYMREAL,lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT");
		paraType.add("double,double,double,double,double,double,double,double,double,double,double,double,int");
		binaryExp.add("((0.0==(((((eyeX_15_SYMREAL+(0.0*(dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-x_11_SYMREAL)*((eyeX_15_SYMREAL+(0.0*(dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-x_11_SYMREAL))+(((eyeY_16_SYMREAL+(0.0*(dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-y_12_SYMREAL)*((eyeY_16_SYMREAL+(0.0*(dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-y_12_SYMREAL)))+(((eyeZ_17_SYMREAL+(0.0*(dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-z_13_SYMREAL)*((eyeZ_17_SYMREAL+(0.0*(dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-z_13_SYMREAL))))) && ((exp((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))!=0.0)) && (((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<1.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetSphereShade.main()_20");
		paraName.add("eyeX_15_SYMREAL,dirX_18_SYMREAL,dirY_19_SYMREAL,dirZ_20_SYMREAL,x_11_SYMREAL,eyeY_16_SYMREAL,y_12_SYMREAL,eyeZ_17_SYMREAL,z_13_SYMREAL,lX_22_SYMREAL,lY_23_SYMREAL,lZ_24_SYMREAL,lType_21_SYMINT");
		paraType.add("double,double,double,double,double,double,double,double,double,double,double,double,int");
		binaryExp.add("(((((((eyeX_15_SYMREAL+(0.0*(dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-x_11_SYMREAL)*((eyeX_15_SYMREAL+(0.0*(dirX_18_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-x_11_SYMREAL))+(((eyeY_16_SYMREAL+(0.0*(dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-y_12_SYMREAL)*((eyeY_16_SYMREAL+(0.0*(dirY_19_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-y_12_SYMREAL)))+(((eyeZ_17_SYMREAL+(0.0*(dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-z_13_SYMREAL)*((eyeZ_17_SYMREAL+(0.0*(dirZ_20_SYMREAL*(1.0/exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))))))-z_13_SYMREAL)))>0.0)) && ((exp((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL)))!=0.0)) && (((((lX_22_SYMREAL*lX_22_SYMREAL)+(lY_23_SYMREAL*lY_23_SYMREAL))+(lZ_24_SYMREAL*lZ_24_SYMREAL))<1.0)) && ((lType_21_SYMINT==1)) && ((lType_21_SYMINT!=0)) && ((exp((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL)))!=0.0)) && (((((dirX_18_SYMREAL*dirX_18_SYMREAL)+(dirY_19_SYMREAL*dirY_19_SYMREAL))+(dirZ_20_SYMREAL*dirZ_20_SYMREAL))<1.0))");
		
			/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/raytrace/JpfTargetRayTrace.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_0");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_1");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((0.0==(((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_2");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))>0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_3");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_4");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((1.0==(((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_5");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("(((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))>1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_6");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_7");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-r_4_SYMREAL)<3.4028234663852886E38)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_8");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((3.4028234663852886E38==(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-r_4_SYMREAL))) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_9");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-r_4_SYMREAL)>3.4028234663852886E38)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_10");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))<0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.001 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_11");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL))))) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_12");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_13");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))<0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_14");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))<3.4028234663852886E38)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.001 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_15");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((3.4028234663852886E38==(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL))))))) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_16");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))>3.4028234663852886E38)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_17");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))<0.0)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_18");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL))))))) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_19");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL,r_4_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))-exp((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))>0.0)) && (((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_20");
		paraName.add("r_4_SYMREAL,dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL,cX_1_SYMREAL,eyeX_5_SYMREAL,cY_2_SYMREAL,eyeY_6_SYMREAL,cZ_3_SYMREAL,eyeZ_7_SYMREAL");
		paraType.add("double,double,double,double,double,double,double,double,double,double");
		binaryExp.add("(((((((r_4_SYMREAL*r_4_SYMREAL)+(((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))*((((dirX_8_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cX_1_SYMREAL-eyeX_5_SYMREAL))+((dirY_9_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cY_2_SYMREAL-eyeY_6_SYMREAL)))+((dirZ_10_SYMREAL*(1.0/exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))))*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))))-((cX_1_SYMREAL-eyeX_5_SYMREAL)*(cX_1_SYMREAL-eyeX_5_SYMREAL)))-((cY_2_SYMREAL-eyeY_6_SYMREAL)*(cY_2_SYMREAL-eyeY_6_SYMREAL)))-((cZ_3_SYMREAL-eyeZ_7_SYMREAL)*(cZ_3_SYMREAL-eyeZ_7_SYMREAL)))>0.0)) && ((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))!=0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetRayTrace.main()_21");
		paraName.add("dirX_8_SYMREAL,dirY_9_SYMREAL,dirZ_10_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((exp((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL)))==0.0)) && (((((dirX_8_SYMREAL*dirX_8_SYMREAL)+(dirY_9_SYMREAL*dirY_9_SYMREAL))+(dirZ_10_SYMREAL*dirZ_10_SYMREAL))<1.0))");
		
		
	}
}

package cn.nju.seg.atpc.example.fsewithoutinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkApolloWithoutInit 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetApollo.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.479 seconds.
		functionName.add(" JpfTargetApollo.main()_0");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.014 seconds.
		functionName.add(" JpfTargetApollo.main()_1");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetApollo.main()_2");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)>0.0))");
				//Parse time: 0.0 seconds.     Solve time: 0.48 seconds.
		functionName.add(" JpfTargetApollo.main()_3");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((0.18181818181818185*(((0.5*(((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)*((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)))+(0.0-(((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)))-0.04759988869075444))<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");


		//Parse time: 0.0 seconds.     Solve time: 0.247 seconds.
		functionName.add(" JpfTargetApollo.main()_4");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(0.18181818181818185*(((0.5*(((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)*((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)))+(0.0-(((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)))-0.04759988869075444)))) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetApollo.main()_5");
		paraName.add("in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((0.18181818181818185*(((0.5*(((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)*((((((10.0*in2_0_4_SYMREAL)+-0.0)-0.0)/1.0)/0.055)/2.0)))+(0.0-(((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)))-0.04759988869075444))>0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.041 seconds.
		functionName.add(" JpfTargetApollo.main()_6");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.014 seconds.
		functionName.add(" JpfTargetApollo.main()_7");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0))) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetApollo.main()_8");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)>0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		// 可解 Parse time: 0.0 seconds.     Solve time: 0.59 seconds.
		functionName.add(" JpfTargetApollo.main()_9");
		paraName.add("in2_1_5_SYMREAL,in2_2_6_SYMREAL,in1_1_2_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((0.18181818181818185*(((0.5*((((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)*(((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)))+(0.0-(((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)))-3.332757323673897))<0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.455 seconds.
		functionName.add(" JpfTargetApollo.main()_10");
		paraName.add("in2_1_5_SYMREAL,in2_2_6_SYMREAL,in1_1_2_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(0.18181818181818185*(((0.5*((((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)*(((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)))+(0.0-(((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)))-3.332757323673897)))) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");


		//Parse time: 0.0 seconds.     Solve time: 0.069 seconds.
		functionName.add(" JpfTargetApollo.main()_11");
		paraName.add("in2_1_5_SYMREAL,in2_2_6_SYMREAL,in1_1_2_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((0.18181818181818185*(((0.5*((((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)*(((((-0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/7.855339059327378E-4)/2.0)))+(0.0-(((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)))-3.332757323673897))>0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.035 seconds.
		functionName.add(" JpfTargetApollo.main()_12");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0)<0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.188 seconds.
		functionName.add(" JpfTargetApollo.main()_13");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0))) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetApollo.main()_14");
		paraName.add("in2_1_5_SYMREAL,in1_1_2_SYMREAL,in2_2_6_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0)>0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");

		// 可解Parse time: 0.0 seconds.     Solve time: 0.454 seconds.
		functionName.add(" JpfTargetApollo.main()_15");
		paraName.add("in2_1_5_SYMREAL,in2_2_6_SYMREAL,in1_1_2_SYMREAL,in1_2_3_SYMREAL,in2_0_4_SYMREAL,in1_0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((0.18181818181818185*(((0.5*((((((0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/0.006285533905932738)/2.0)*(((((0.7071067811865476*((((10.0*in2_1_5_SYMREAL)+-0.0)-0.0)/1.0))+0.0)+(0.7071067811865476*((((10.0*in2_2_6_SYMREAL)+-0.0)-0.0)/1.0)))/0.006285533905932738)/2.0)))+(0.0-(((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0)))-0.4165109785694488))<0.0)) && (((((((0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/0.006285533905932738)/2.0)<0.0)) && (((((((-0.7071067811865476*(in2_1_5_SYMREAL-in1_1_2_SYMREAL))+0.0)+(0.7071067811865476*(in2_2_6_SYMREAL-in1_2_3_SYMREAL)))/7.855339059327378E-4)/2.0)<0.0)) && (((((in2_0_4_SYMREAL-in1_0_1_SYMREAL)/0.055)/2.0)<0.0))");
	
	}
}

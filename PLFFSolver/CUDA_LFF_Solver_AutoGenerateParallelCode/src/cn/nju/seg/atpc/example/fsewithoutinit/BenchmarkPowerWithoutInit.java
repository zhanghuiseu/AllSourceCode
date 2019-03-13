package cn.nju.seg.atpc.example.fsewithoutinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkPowerWithoutInit 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetPowTest.main().txt      *********/		
		//Parse time: 0.006 seconds.     Solve time: 0.566 seconds.
		functionName.add(" JpfTargetPowTest.main()_0");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT<=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetPowTest.main()_1");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetPowTest.main()_2");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT!=(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.089 seconds.
		functionName.add(" JpfTargetPowTest.main()_3");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT==(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");

		//Parse time: 0.0 seconds.     Solve time: 0.124 seconds.
		functionName.add(" JpfTargetPowTest.main()_4");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT<=8)) && ((y_2_SYMINT==(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.104 seconds.
		functionName.add(" JpfTargetPowTest.main()_5");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT>8)) && ((y_2_SYMINT==(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.111 seconds.
		functionName.add(" JpfTargetPowTest.main()_6");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT>8)) && ((y_2_SYMINT==(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.129 seconds.
		functionName.add(" JpfTargetPowTest.main()_7");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT<=8)) && ((y_2_SYMINT==(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.019 seconds.
		functionName.add(" JpfTargetPowTest.main()_8");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT<=8)) && ((y_2_SYMINT!=(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.005 seconds.
		functionName.add(" JpfTargetPowTest.main()_9");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT>8)) && ((y_2_SYMINT!=(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.037 seconds.
		functionName.add(" JpfTargetPowTest.main()_10");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT>8)) && ((y_2_SYMINT!=(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetPowTest.main()_11");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT<=8)) && ((y_2_SYMINT!=(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetPowTest.main()_12");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT<=0))");
		
	}
}

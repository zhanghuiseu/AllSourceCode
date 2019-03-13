package cn.nju.seg.atpc.example.fsewithoutinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkBlindWithoutInit 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetEarly.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.562 seconds.
		functionName.add(" JpfTargetEarly.main()_0");
		paraName.add("b_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((b_2_SYMINT<=2))");
		
		//Parse time: 0.001 seconds.     Solve time: 0.008 seconds.
		functionName.add(" JpfTargetEarly.main()_1");
		paraName.add("b_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.008 seconds.
		functionName.add(" JpfTargetEarly.main()_2");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT!=(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.101 seconds.
		functionName.add(" JpfTargetEarly.main()_3");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT==(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.059 seconds.
		functionName.add(" JpfTargetEarly.main()_4");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT==(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.008 seconds.
		functionName.add(" JpfTargetEarly.main()_5");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT!=(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetEarly.main()_6");
		paraName.add("b_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((b_2_SYMINT<=2))");
		
	}
}

package cn.nju.seg.atpc.example.fsewithoutinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkDartWithoutInit 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/concolic.DART.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.578 seconds.
		functionName.add(" concolic.DART.main()_0");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("(((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))<=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.008 seconds.
		functionName.add(" concolic.DART.main()_1");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("(((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.051 seconds.
		functionName.add(" concolic.DART.main()_2");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT<=0)) && (((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.01 seconds.
		functionName.add(" concolic.DART.main()_3");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT>0)) && (((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))>0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" concolic.DART.main()_4");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT<=0)) && (((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))<=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.029 seconds.
		functionName.add(" concolic.DART.main()_5");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT>0)) && (((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))<=0))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" concolic.DART.main()_6");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("(((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))<=0))");
		
	}
}

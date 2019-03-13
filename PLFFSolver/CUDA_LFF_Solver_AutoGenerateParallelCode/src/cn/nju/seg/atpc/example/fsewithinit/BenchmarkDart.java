package cn.nju.seg.atpc.example.fsewithinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkDart 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/dart/concolic.DART.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" concolic.DART.main()_0");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("(((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))<=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" concolic.DART.main()_1");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("(((x_1_SYMINT*(x_1_SYMINT*x_1_SYMINT))>0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" concolic.DART.main()_2");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT<=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" concolic.DART.main()_3");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" concolic.DART.main()_4");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT!=20)) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" concolic.DART.main()_5");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT==20)) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" concolic.DART.main()_6");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT==20)) && ((x_1_SYMINT>0))");
		
		
	}
}

package cn.nju.seg.atpc.example.fsewithinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkBlind 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/blind/JpfTargetEarly.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetEarly.main()_0");
		paraName.add("b_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((b_2_SYMINT<=2))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetEarly.main()_1");
		paraName.add("b_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetEarly.main()_2");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT!=(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetEarly.main()_3");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT==(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetEarly.main()_4");
		paraName.add("b_2_SYMINT,a_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((b_2_SYMINT==(b_2_SYMINT*a_1_SYMINT))) && ((b_2_SYMINT>2))");
		
		
		
	}
}

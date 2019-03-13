package cn.nju.seg.atpc.example.fsewithinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkStat 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/stat/concolic.TestStatCalc.main().txt      *********/
		//Parse time: 0.003 seconds.     
		functionName.add(" concolic.TestStatCalc.main()_0");
		paraName.add("REAL_1,val_1_SYMINT");
		paraType.add("double,int");
		binaryExp.add("((REAL_1==val_1_SYMINT))");
		
		//Parse time: 0.001 seconds.     
		functionName.add(" concolic.TestStatCalc.main()_1");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT>=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" concolic.TestStatCalc.main()_2");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT<val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" concolic.TestStatCalc.main()_3");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT!=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" concolic.TestStatCalc.main()_4");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT==val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		
	}
}

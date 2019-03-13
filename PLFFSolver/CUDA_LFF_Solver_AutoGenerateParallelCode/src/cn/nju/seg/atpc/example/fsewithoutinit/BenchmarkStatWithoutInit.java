package cn.nju.seg.atpc.example.fsewithoutinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkStatWithoutInit 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/concolic.TestStatCalc.main().txt      *********/
		//Parse time: 0.005 seconds.     Solve time: 0.487 seconds.
		functionName.add(" concolic.TestStatCalc.main()_0");
		paraName.add("REAL_1,val_1_SYMINT");
		paraType.add("double,int");
		binaryExp.add("((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" concolic.TestStatCalc.main()_1");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT>=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.176 seconds.
		functionName.add(" concolic.TestStatCalc.main()_2");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT<val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.319 seconds.
		functionName.add(" concolic.TestStatCalc.main()_3");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT!=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.007 seconds.
		functionName.add(" concolic.TestStatCalc.main()_4");
		paraName.add("val_1_SYMINT,REAL_1");
		paraType.add("int,double");
		binaryExp.add("((val_1_SYMINT==val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" concolic.TestStatCalc.main()_5");
		paraName.add("REAL_2,val_1_SYMINT,REAL_1");
		paraType.add("double,int,double");
		binaryExp.add("((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" concolic.TestStatCalc.main()_6");
		paraName.add("val_1_SYMINT,REAL_2,REAL_1");
		paraType.add("int,double,double");
		binaryExp.add("((val_1_SYMINT>=val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.096 seconds.
		functionName.add(" concolic.TestStatCalc.main()_7");
		paraName.add("val_1_SYMINT,REAL_2,REAL_1");
		paraType.add("int,double,double");
		binaryExp.add("((val_1_SYMINT<val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.142 seconds.
		functionName.add(" concolic.TestStatCalc.main()_8");
		paraName.add("val_1_SYMINT,REAL_2,REAL_1");
		paraType.add("int,double,double");
		binaryExp.add("((val_1_SYMINT!=val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" concolic.TestStatCalc.main()_9");
		paraName.add("val_1_SYMINT,REAL_2,REAL_1");
		paraType.add("int,double,double");
		binaryExp.add("((val_1_SYMINT==val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.016 seconds.
		functionName.add(" concolic.TestStatCalc.main()_10");
		paraName.add("REAL_3,val_1_SYMINT,REAL_2,REAL_1");
		paraType.add("double,int,double,double");
		binaryExp.add("((REAL_3=val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" concolic.TestStatCalc.main()_11");
		paraName.add("val_1_SYMINT,REAL_3,REAL_2,REAL_1");
		paraType.add("int,double,double,double");
		binaryExp.add("((val_1_SYMINT>=val_1_SYMINT)) && ((REAL_3=val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.132 seconds.
		functionName.add(" concolic.TestStatCalc.main()_12");
		paraName.add("val_1_SYMINT,REAL_3,REAL_2,REAL_1");
		paraType.add("int,double,double,double");
		binaryExp.add("((val_1_SYMINT<val_1_SYMINT)) && ((REAL_3=val_1_SYMINT)) && ((REAL_2=val_1_SYMINT)) && ((REAL_1=val_1_SYMINT))");
	}
}

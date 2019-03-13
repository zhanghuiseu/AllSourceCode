package cn.nju.seg.atpc.example.fsewithinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkPower 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/power/JpfTargetPowTest.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetPowTest.main()_0");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT<=0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowTest.main()_1");
		paraName.add("x_1_SYMINT");
		paraType.add("int");
		binaryExp.add("((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowTest.main()_2");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT!=(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowTest.main()_3");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT==(x_1_SYMINT*x_1_SYMINT))) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowTest.main()_4");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT<=8)) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowTest.main()_5");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT>8)) && ((x_1_SYMINT>0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetPowTest.main()_6");
		paraName.add("y_2_SYMINT,x_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((y_2_SYMINT>8)) && ((x_1_SYMINT>0))");
		
		
		
	}
}

package cn.nju.seg.atpc.example.fsewithoutinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkHashCodeWithoutInit 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/hashcode/JpfTargetCollision2.main().txt      *********/
		//Parse time: 0.005 seconds.     
		functionName.add(" JpfTargetCollision2.main()_0");
		paraName.add("z1_2_SYMINT,y1_1_SYMINT,z2_4_SYMINT,y2_3_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("(((z1_2_SYMINT+(31*(((32+y1_1_SYMINT)*y1_1_SYMINT)+31)))!=(z2_4_SYMINT+(31*(((32+y2_3_SYMINT)*y2_3_SYMINT)+62)))))");
		
			/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/hashcode/JpfTargetCollision4.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetCollision4.main()_0");
		paraName.add("z1_3_SYMINT,y1_2_SYMINT,x1_1_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((-412516635!=(z1_3_SYMINT+(31*(((32+y1_2_SYMINT)*y1_2_SYMINT)+(31*x1_1_SYMINT))))))");
		
			/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/hashcode/JpfTargetCollision5.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetCollision5.main()_0");
		paraName.add("z1_2_SYMINT,y1_1_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((-412516635!=(z1_2_SYMINT+(31*(((32+y1_1_SYMINT)*y1_1_SYMINT)+176018)))))");
		
			/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/hashcode/JpfTargetCollision3.main().txt      *********/
		//Parse time: 0.005 seconds.     
		functionName.add(" JpfTargetCollision3.main()_0");
		paraName.add("y1_1_SYMINT,y2_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((((31*(((32+y1_1_SYMINT)*y1_1_SYMINT)+38254))+3141)!=((31*(((32+y2_2_SYMINT)*y2_2_SYMINT)+176018))+3141)))");
		
			/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/hashcode/JpfTargetCollision1.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetCollision1.main()_0");
		paraName.add("z1_3_SYMINT,y1_2_SYMINT,x1_1_SYMINT,z2_6_SYMINT,y2_5_SYMINT,x2_4_SYMINT");
		paraType.add("int,int,int,int,int,int");
		binaryExp.add("(((z1_3_SYMINT+(31*(((32+y1_2_SYMINT)*y1_2_SYMINT)+(31*x1_1_SYMINT))))!=(z2_6_SYMINT+(31*(((32+y2_5_SYMINT)*y2_5_SYMINT)+(31*x2_4_SYMINT))))))");
	}
}

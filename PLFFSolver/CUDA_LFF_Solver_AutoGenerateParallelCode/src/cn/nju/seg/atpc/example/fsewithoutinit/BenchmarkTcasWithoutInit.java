package cn.nju.seg.atpc.example.fsewithoutinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkTcasWithoutInit 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/JpfTargetTcas.main().txt      *********/
		//Parse time: 0.006 seconds.     Solve time: 0.566 seconds.
		functionName.add(" JpfTargetTcas.main()_0");
		paraName.add("high_confidence_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.007 seconds.
		functionName.add(" JpfTargetTcas.main()_1");
		paraName.add("high_confidence_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.175 seconds.
		functionName.add(" JpfTargetTcas.main()_2");
		paraName.add("own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((own_tracked_alt_rate_5_SYMINT>600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.022 seconds.
		functionName.add(" JpfTargetTcas.main()_3");
		paraName.add("own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.021 seconds.
		functionName.add(" JpfTargetTcas.main()_4");
		paraName.add("cur_vertical_sep_1_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((cur_vertical_sep_1_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.119 seconds.
		functionName.add(" JpfTargetTcas.main()_5");
		paraName.add("cur_vertical_sep_1_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((cur_vertical_sep_1_SYMINT>600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.019 seconds.
		functionName.add(" JpfTargetTcas.main()_6");
		paraName.add("other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.055 seconds.
		functionName.add(" JpfTargetTcas.main()_7");
		paraName.add("other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.038 seconds.
		functionName.add(" JpfTargetTcas.main()_8");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.019 seconds.
		functionName.add(" JpfTargetTcas.main()_9");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.043 seconds.
		functionName.add(" JpfTargetTcas.main()_10");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.03 seconds.
		functionName.add(" JpfTargetTcas.main()_11");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.038 seconds.
		functionName.add(" JpfTargetTcas.main()_12");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.046 seconds.
		functionName.add(" JpfTargetTcas.main()_13");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.03 seconds.
		functionName.add(" JpfTargetTcas.main()_14");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetTcas.main()_15");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.014 seconds.
		functionName.add(" JpfTargetTcas.main()_16");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
	
				//Parse time: 0.0 seconds.     Solve time: 0.027 seconds.
		functionName.add(" JpfTargetTcas.main()_17");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.033 seconds.
		functionName.add(" JpfTargetTcas.main()_18");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.015 seconds.
		functionName.add(" JpfTargetTcas.main()_19");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.036 seconds.
		functionName.add(" JpfTargetTcas.main()_20");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.027 seconds.
		functionName.add(" JpfTargetTcas.main()_21");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetTcas.main()_22");
		paraName.add("other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetTcas.main()_23");
		paraName.add("other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.01 seconds.
		functionName.add(" JpfTargetTcas.main()_24");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.015 seconds.
		functionName.add(" JpfTargetTcas.main()_25");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.024 seconds.
		functionName.add(" JpfTargetTcas.main()_26");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.02 seconds.
		functionName.add(" JpfTargetTcas.main()_27");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.005 seconds.
		functionName.add(" JpfTargetTcas.main()_28");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.019 seconds.
		functionName.add(" JpfTargetTcas.main()_29");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.011 seconds.
		functionName.add(" JpfTargetTcas.main()_30");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT==1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetTcas.main()_31");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.002 seconds.
		functionName.add(" JpfTargetTcas.main()_32");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetTcas.main()_33");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.003 seconds.
		functionName.add(" JpfTargetTcas.main()_34");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.005 seconds.
		functionName.add(" JpfTargetTcas.main()_35");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.016 seconds.
		functionName.add(" JpfTargetTcas.main()_36");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     Solve time: 0.001 seconds.
		functionName.add(" JpfTargetTcas.main()_37");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT!=1)) && ((high_confidence_2_SYMINT!=1))");
	
	}
}

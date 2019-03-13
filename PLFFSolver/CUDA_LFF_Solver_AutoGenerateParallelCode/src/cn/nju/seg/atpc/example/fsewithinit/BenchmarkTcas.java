package cn.nju.seg.atpc.example.fsewithinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkTcas 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/tcas/JpfTargetTcas.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" JpfTargetTcas.main()_0");
		paraName.add("high_confidence_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((high_confidence_2_SYMINT!=1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_1");
		paraName.add("high_confidence_2_SYMINT");
		paraType.add("int");
		binaryExp.add("((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_2");
		paraName.add("own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((own_tracked_alt_rate_5_SYMINT>600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_3");
		paraName.add("own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int");
		binaryExp.add("((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_4");
		paraName.add("cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((cur_vertical_sep_1_SYMINT<=600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_5");
		paraName.add("cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int");
		binaryExp.add("((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_6");
		paraName.add("other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_capability_11_SYMINT!=1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_7");
		paraName.add("other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int");
		binaryExp.add("((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_8");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT!=1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_9");
		paraName.add("two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int");
		binaryExp.add("((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_10");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT!=0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_11");
		paraName.add("other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int,int");
		binaryExp.add("((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_12");
		paraName.add("climb_inhibit_12_SYMINT,other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int,int,int");
		binaryExp.add("((climb_inhibit_12_SYMINT!=1)) && ((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_13");
		paraName.add("climb_inhibit_12_SYMINT,other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int,int,int");
		binaryExp.add("((climb_inhibit_12_SYMINT==1)) && ((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_14");
		paraName.add("up_separation_8_SYMINT,down_separation_9_SYMINT,climb_inhibit_12_SYMINT,other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int,int,int,int,int");
		binaryExp.add("(((up_separation_8_SYMINT+300)<=down_separation_9_SYMINT)) && ((climb_inhibit_12_SYMINT==1)) && ((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" JpfTargetTcas.main()_15");
		paraName.add("up_separation_8_SYMINT,down_separation_9_SYMINT,climb_inhibit_12_SYMINT,other_rac_10_SYMINT,two_of_three_reports_valid_3_SYMINT,other_capability_11_SYMINT,cur_vertical_sep_1_SYMINT,own_tracked_alt_rate_5_SYMINT,high_confidence_2_SYMINT");
		paraType.add("int,int,int,int,int,int,int,int,int");
		binaryExp.add("(((up_separation_8_SYMINT+300)>down_separation_9_SYMINT)) && ((climb_inhibit_12_SYMINT==1)) && ((other_rac_10_SYMINT==0)) && ((two_of_three_reports_valid_3_SYMINT==1)) && ((other_capability_11_SYMINT==1)) && ((cur_vertical_sep_1_SYMINT>600)) && ((own_tracked_alt_rate_5_SYMINT<=600)) && ((high_confidence_2_SYMINT==1))");
	
		
	}
}

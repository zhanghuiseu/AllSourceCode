package cn.nju.seg.atpc.example.fsewithinit;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkTsafe 
{
	public static List<String> functionName=new ArrayList<String>();
	public static List<String> binaryExp=new ArrayList<String>();
	public static List<String> paraName=new ArrayList<String>();
	public static List<String> paraType=new ArrayList<String>();
	
	public static void initBenchmark()
	{	
		/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/tsafe/tsafe.Conflict.main().txt      *********/
/*		//Parse time: 0.004 seconds.     
		functionName.add(" tsafe.Conflict.main()_0");
		paraName.add("psi1_1_SYMREAL");
		paraType.add("double");
		binaryExp.add("(((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_1");
		paraName.add("psi1_1_SYMREAL");
		paraType.add("double");
		binaryExp.add("((0.0==(0.017453292519943295*psi1_1_SYMREAL)))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_2");
		paraName.add("psi1_1_SYMREAL");
		paraType.add("double");
		binaryExp.add("(((0.017453292519943295*psi1_1_SYMREAL)>0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_3");
		paraName.add("bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_4");
		paraName.add("bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_5");
		paraName.add("bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//存在不可解子集Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_6");
		paraName.add("psi1_1_SYMREAL,bank_ang_7_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(0.017453292519943295*psi1_1_SYMREAL))) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//存在不可解子集Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_7");
		paraName.add("psi1_1_SYMREAL,bank_ang_7_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((0.017453292519943295*psi1_1_SYMREAL)>0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.001 seconds.     
		functionName.add(" tsafe.Conflict.main()_8");
		paraName.add("vA_2_SYMREAL,bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_9");
		paraName.add("vC_3_SYMREAL,bank_ang_7_SYMREAL,vA_2_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_10");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))<999.0)) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//真的很难求解Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_11");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((999.0==exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0))))) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_12");
		paraName.add("xC0_4_SYMREAL,vC_3_SYMREAL,bank_ang_7_SYMREAL,psiC_6_SYMREAL,psi1_1_SYMREAL,vA_2_SYMREAL,yC0_5_SYMREAL");
		paraType.add("double,double,double,double,double,double,double");
		binaryExp.add("((exp((pow(((xC0_4_SYMREAL+((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(cos(psiC_6_SYMREAL)-cos((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(1.0-cos((0.017453292519943295*psi1_1_SYMREAL))))), 2.0)+pow(((yC0_5_SYMREAL-((1.0*((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*(sin(psiC_6_SYMREAL)-sin((psiC_6_SYMREAL+(((1.0*(((0.0-(0.017453292519943295*psi1_1_SYMREAL))*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))/vA_2_SYMREAL))*vC_3_SYMREAL)/((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)))))))-((-1.0*((pow(vA_2_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0))*sin((0.017453292519943295*psi1_1_SYMREAL)))), 2.0)))>999.0)) && ((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_13");
		paraName.add("vC_3_SYMREAL,bank_ang_7_SYMREAL,vA_2_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)!=0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//难以求解Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_14");
		paraName.add("vC_3_SYMREAL,bank_ang_7_SYMREAL,vA_2_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((pow(vC_3_SYMREAL, 2.0)/tan((0.017453292519943295*bank_ang_7_SYMREAL)))/68443.0)==0.0)) && ((vA_2_SYMREAL!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_15");
		paraName.add("vA_2_SYMREAL,bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((vA_2_SYMREAL==0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_16");
		paraName.add("vA_2_SYMREAL,bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double,double");
		binaryExp.add("((vA_2_SYMREAL==0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
		
		//存在不可解子集Parse time: 0.0 seconds.     
		functionName.add(" tsafe.Conflict.main()_17");
		paraName.add("bank_ang_7_SYMREAL,psi1_1_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((tan((0.017453292519943295*bank_ang_7_SYMREAL))==0.0)) && ((tan((0.017453292519943295*bank_ang_7_SYMREAL))!=0.0)) && (((0.017453292519943295*psi1_1_SYMREAL)<0.0))");
*/
		
			/* ********     /home/zy/workspace2/ReadFromZYF/LffLogs/tsafe/tsafe.TurnLogic.main().txt      *********/
		//Parse time: 0.004 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_0");
		paraName.add("x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_1");
		paraName.add("x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("((0.0==(x0_1_SYMREAL-x1_4_SYMREAL)))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_2");
		paraName.add("x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double");
		binaryExp.add("(((x0_1_SYMREAL-x1_4_SYMREAL)>0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_3");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//存在不可解子集Parse time: 0.001 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_4");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((0.0==(1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL))))) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_5");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))>0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_6");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_7");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((6.283185307179586==((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586))) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//存在不可解子集Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_8");
		paraName.add("y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL,x1_4_SYMREAL");
		paraType.add("double,double,double,double");
		binaryExp.add("((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)>6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_9");
		paraName.add("x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_10");
		paraName.add("x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
	
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_11");
		paraName.add("x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,y1_5_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double");
		binaryExp.add("(((x1_4_SYMREAL-x2_6_SYMREAL)>0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_12");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
	
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_13");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL))))) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_14");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))>0.0)) && (((x1_4_SYMREAL-x2_6_SYMREAL)<0.0)) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_15");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((y1_5_SYMREAL-y2_7_SYMREAL)<0.0)) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.001 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_16");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(y1_5_SYMREAL-y2_7_SYMREAL))) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_17");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((y1_5_SYMREAL-y2_7_SYMREAL)>0.0)) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_18");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<0.0)) && (((y1_5_SYMREAL-y2_7_SYMREAL)<0.0)) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_19");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((0.0==(1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL))))) && (((y1_5_SYMREAL-y2_7_SYMREAL)<0.0)) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_20");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))>0.0)) && (((y1_5_SYMREAL-y2_7_SYMREAL)<0.0)) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_21");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))<6.283185307179586)) && (((y1_5_SYMREAL-y2_7_SYMREAL)<0.0)) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_22");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("((6.283185307179586==(1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL))))) && (((y1_5_SYMREAL-y2_7_SYMREAL)<0.0)) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
		//Parse time: 0.0 seconds.     
		functionName.add(" tsafe.TurnLogic.main()_23");
		paraName.add("y1_5_SYMREAL,y2_7_SYMREAL,x1_4_SYMREAL,x2_6_SYMREAL,y0_2_SYMREAL,x0_1_SYMREAL");
		paraType.add("double,double,double,double,double,double");
		binaryExp.add("(((1.5707963267948966-atan2((y1_5_SYMREAL-y2_7_SYMREAL), (x1_4_SYMREAL-x2_6_SYMREAL)))>6.283185307179586)) && (((y1_5_SYMREAL-y2_7_SYMREAL)<0.0)) && ((0.0==(x1_4_SYMREAL-x2_6_SYMREAL))) && ((((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))+6.283185307179586)<6.283185307179586)) && (((1.5707963267948966-atan2((y0_2_SYMREAL-y1_5_SYMREAL), (x0_1_SYMREAL-x1_4_SYMREAL)))<0.0)) && (((x0_1_SYMREAL-x1_4_SYMREAL)<0.0))");
		
	}
}

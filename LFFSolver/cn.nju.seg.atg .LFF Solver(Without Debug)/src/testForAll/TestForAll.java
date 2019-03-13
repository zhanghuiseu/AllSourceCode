package testForAll;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import cn.nju.seg.atg.BEParse.BinaryExpressionParse;
import cn.nju.seg.atg.model.constraint.BinaryExpression;
import cn.nju.seg.atg.parse.TestBuilder;

public class TestForAll {

	public static void main(String[] args)
	{
		String folderPath="/home/zy/KleeFloat/LFFSolver/one.constraint";
		if(args.length==1)
			folderPath = args[0];
		
		String para0=null,para1=null,para2=null;
		
		try {
            BufferedReader bufferRead=new BufferedReader(new FileReader(new File(folderPath)));
            para0=bufferRead.readLine();
            para1=bufferRead.readLine();
            para2=bufferRead.readLine();
            bufferRead.close();
        }catch (Exception e){   
            e.printStackTrace();   
        }
		
		
		/*StringBuilder argsBuilder = new StringBuilder();
		for(int i=0;i<args.length;i++)
		{
			argsBuilder.append(args[i]);
		}*/
		
		/*
		 * 为了更加简单的区分所有的参数类型,这里规定是按照@作为区分符号,如下:
		 * x+5==5@double,double,double,double,double@x,y,z,w,v
		 * 第一个属于BinaryExpression,第二个是type信息;第三个是变量名字信息
		 * */
		//String[] paras = argsBuilder.toString().replace(" ","").split("@");
		
/*		//For testing
		paras = new String[3];
		paras[0] = "z*z<-1";
		paras[1] = "double,double,double";
		paras[2] = "x,y,z";*/
		
		if(para0!=null && para1!=null && para2!=null)
		{
			para0=para0.replace("^", "|");
			//para0=para0.replace(">>", "+");
			BinaryExpressionParse.initAll(para0, "LFF Solver", para1, para2);
			BinaryExpressionParse.beginSolver();
			
			if(TestBuilder.finalCovered >= 1)
				System.out.print("1@"+TestBuilder.finalCovered+"@");//用于LFF Solver的接口:求解成功
			else
				System.out.print("0@"+TestBuilder.finalCovered+"@");//用于LFF Solver的接口:求解成功
			
			double []a=TestBuilder.finalParams;
			if(a.length<=0)
				System.out.println();
			else
			{
				System.out.print(a[0]);
				for(int i=1;i<a.length;i++)
					System.out.print(","+a[i]);
			}
			System.out.println();
		}else
			System.out.println("-1@-1@-1");
		
		System.exit(0);
		
		
		
		/*BenchMark.initBenchmark();
		List<String> functionName=BenchMark.functionName;
		List<String> binaryExp=BenchMark.binaryExp;
		List<String> paraName=BenchMark.paraName;
		List<String> paraType=BenchMark.paraType;
		
		for(int i=0;i<functionName.size();i++)
		{
			BinaryExpressionParse.initAll(binaryExp.get(i),functionName.get(i),paraType.get(i),paraName.get(i));
			BinaryExpressionParse.beginSolver();
			System.gc();
		}*/
		//System.out.println("***** Game Over *****");
	}
	
	

}
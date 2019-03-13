	/*
	 * main.cpp
	 *
	 *  Created on: Oct 14, 2017
	 *      Author: zhanghui
	 */



	#include <iostream>
	#include <fstream>

	#include "./../solver/runLFFSolver.h"

	using namespace std;


	int main(int argc,char **argv)
	{
		cout<<"LFF Solver Begin:  "<<endl;

		string res = "";
		string path(argv[0]);
		if(argc==1)
		{
			//path = "/home/zy/cudaWorkspaceServer/JavaJar/PLFFSolver.result";
			runLFFSolver::run(res);
		}else
		{
			res = "-1@-1@-1";
		}
		ofstream fd(path.c_str());
		fd<<res<<endl;
		fd.close();

		cout<<res<<endl;
		cout<<"LFF Solver Game Over!!!"<<endl;
		return 1;
	}

	/*
	 * ExcuteConstraint.cuh
	 * 
	 * ***************   Notice   ***************
	 * Auto Generated By ATPC on:2019-03-07 17:05:30
	 * Author: ZhangHui
	 * 
	 */ 

	#ifndef EXCUTECONSTRAINT_CUH_
	#define EXCUTECONSTRAINT_CUH_

	#include <iostream>

	#include "./../ConstraintParser/ConstraintParameter.cuh"
	#include "./../model/Coodinate.cuh"
	#include "./../model/Interval.cuh"
	#include "./../model/Priority.cuh"
	#include "./../model/FullCoveredInfo.cuh"
	#include "./../model/PredictValue.cuh"
	#include "./../model/PredictValueWithOne.cuh"
	#include "./../solver/type.h"
	#include "./../solver/ATG.h"
	#include "./../solver/PCATG.h"
	#include "./../solver/ConstantValue.h"
	#include "ExcuteConstraint.cuh"
	#include "HardwareStrategy.cuh"

	#include "ParallelATG.cuh"

	#include "cuda_runtime.h"
	#include "device_launch_parameters.h"

	#include <stdio.h>

	using namespace std;

	/*
	 * 这个文件是函数获取运行时刻的各种函数的声明
	 * */ 

	/*
	 * 注意这里计算有两部的计算优化：
	 * 1）在计算运行时刻值的时候，顺便把子约束满足情况计算了
	 * 2）计算子约束的满足情况的时候没有使用if等判断分支结构，
	 *    同时使用到已经计算好的运行时刻值去减少复杂的浮点数计算过程
	 * 这里采用的编码函数命名编码规则是这样的:
	 * getRuntimeValue_i_j表示计算第i个析取范式的第j个约束的运行时刻值
	 * */ 
	/*
	 * 第0个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_0(FloatType DOUBLE_doubleA , FloatType DOUBLE_doubleB , Coodinate* res );

	/*
	 * 第1个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_1(FloatType DOUBLE_doubleA , FloatType DOUBLE_doubleB , Coodinate* res );

	/*
	 * 第2个约束的CUDA计算函数
	 * */ 
	__device__ void getRuntimeValue_0_2(FloatType DOUBLE_doubleA , FloatType DOUBLE_doubleB , Coodinate* res );


	/*
	 * 下面是所有的  约束  在  各个搜索方向  的获取运行时刻值的关系（假如n个约束m个搜索方向，那么一共 m*n 个函数）
	 * */ 

	/*
	 * 第0个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_0_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第0个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_0_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第1个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_1_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第1个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_1_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 第2个约束在第0个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_2_0(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);

	/*
	 * 第2个约束在第1个搜索方向的执行
	 * */ 
	__global__ void calaConstraint_0_2_1(Coodinate* dev_predictArray,FloatType* dev_parameter,const int base,const int calaMatCol);



	/*
	 * 复合约束的并行计算模块,注意，这个函数还可以使用CUDA提供的流加速计算
	 * */ 
	void calaRuntimeValue(int paraIndex,Coodinate* dev_predictArray,FloatType* dev_parameter,const int row,const int col);

	/*
	 *  这个核函数是为了寻找可行解
	 * */ 
	__global__ void calaFeasibleSolution(FullCoveredInfo* dev_coveredInfo,Coodinate* dev_predictArray,const int calaMatCol);

	/*
	 * 判断是否有满足复合约束的可行解,CPU验证模块
	 * */ 
	bool checkisFullCovered(FullCoveredInfo* dev_coveredInfo,Coodinate* initArray, bool &findSolution,const int row,const int col);

	/*
	 * 就是区间交运算的计算
	 * */ 
	__global__ void calaFinalIntervel(Interval* dev_finalIntervel,Interval* dev_interval,const int calaArraySize);

	/*
	 * 根据预测的序列生成predct矩阵
	 * */ 
	__global__ void generatePredictMat(Coodinate* dev_predictArray,PredictValueWithOne* dev_finalAllPredictValue,const int col);

	/*
	 * 并行计算所有的预测解向量的优先级
	 * */ 
	__global__ void calaPriority(Priority* dev_priority,Coodinate* dev_calaArray,const int row,const int Size);



	#endif /* EXCUTECONSTRAINT_CUH_ */

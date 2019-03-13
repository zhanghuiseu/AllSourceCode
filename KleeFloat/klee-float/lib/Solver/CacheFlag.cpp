#include <iostream>
#include <string>
#include <set>
#include <unordered_set>
#include <map>
#include <unordered_map>
#include <vector>
#include <algorithm>
#include <sstream>
#include <fstream>


#include "LFFCommon.h"


using namespace std;


bool CacheFlag::useSolverCache = true;
bool CacheFlag::isNowCached = false;
unordered_map<string,string> CacheFlag::dataCache_map = unordered_map<string,string>();



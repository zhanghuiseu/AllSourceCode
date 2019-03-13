#include <string>
#include <map>
#include "LFFSolver.h"

using namespace std;

bool CacheFlag1::useSolverCache = true;
bool CacheFlag1::isNowCached = false;
map<string,string> CacheFlag1::dataCache_map = map<string,string>();



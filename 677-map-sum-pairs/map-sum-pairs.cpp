#include <iostream>
#include <map>
class MapSum {
public:
    std::map<std::string,int> myMap;
    MapSum() {
        
    }
    
    void insert(string key, int val) {
        for(std::map<std::string,int>::iterator i = myMap.begin() ; i != myMap.end() ; i++)
        {
         if(strcmp(key.c_str(),i->first.c_str()) == 0)
         {
            i->second = val;
            return ;
         }
        }
        myMap.insert(std::pair<string,int>(key,val));
    }
    
    int sum(string prefix) {
        int tmp = 0;
    for(std::map<std::string,int>::iterator i = myMap.begin() ; i != myMap.end() ; i++)
         if(strncmp(prefix.c_str(),i->first.c_str(),prefix.length()) == 0)
            tmp +=i->second;
        return tmp;
    }
};

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum* obj = new MapSum();
 * obj->insert(key,val);
 * int param_2 = obj->sum(prefix);
 */
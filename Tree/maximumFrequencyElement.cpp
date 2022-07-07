#include<vector>
#include<utility>
#include<unordered_map>
#include<map>
#include<iostream>
using namespace std;
int highestFrequency(int *input, int n){	
    // soultion 1:
    unordered_map<int,int> m;
    int maxFreq = 0;

    for(int i=0;i<n;i++){
        ++m[input[i]];
        maxFreq = max(maxFreq,m[input[i]]);
    }
    for(auto itr = m.begin();itr != m.end();itr++){
        cout<<"<"<<itr->first<<","<<itr->second<<">"<<" ";
    }
    cout<<endl;
    int max =0;
    /* it will not give me first maximum frequency 
       element when i have multiple maximum frequencies
       because it is unsorted map


    for(auto itr = m.begin(); itr != m.end();++itr){
         if(itr->second == maxFreq){
             max = itr->first;
             break;
         }
    }
    */
    for(int i=0;i<n;i++){
        if(m[input[i]] == maxFreq){
            max = input[i];
            break;
        }
    }
    return max;
    /*
    solution 2 :
    // Time complexity o(map.size()) 
    map <int ,int> max;
    for(int i=0 ;i<n ;i++){
        max[input[i]]++;
    }
    // int mapSize = max.size();
    int key =0;
    int value=0;
   
    for(int i=0;i<max.size() ;i++)
    {
        if(max[input[i]] > value)
        {
            key=input[i];
            value = max[input[i]];
        }
    }
    return key;
    */

   /* --- time complexity o(n^2)
   solution 3 :
    vector<pair<int,int>> v;
    for(int i=0;i<n;i++){
        if(v.size() == 0){
            pair<int,int> p(input[i],1);
            v.push_back(p);
        }else{
            bool flag = false;
            for(int j=0;j<v.size();j++){
                if(v[j].first == input[i] ){
                    v[j].second++;
                    flag =true;
                    break;
                }
            }
            if(flag == false){
                pair<int,int> p(input[i],1);
                v.push_back(p);
            }
        }
    }
    for(int i=0;i<v.size();i++){
        cout<<"("<<v[i].first<<","<<v[i].second<<")"<<" ";
    }
    cout<<endl;
    int max = v[0].second;
    int index = 0;
    for(int i=1;i<v.size();i++){
        if(max < v[i].second){
            max = v[i].second;index = i;
        }else if(max >=v[i].second){
            continue;
        }
    }
    return v[index].first;
    */
}

int main() {
    int n;
    cin >> n;

    int* arr = new int[n];

    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }

    cout << highestFrequency(arr, n);

    delete[] arr;
}
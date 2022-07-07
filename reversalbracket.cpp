#include<stack>
#include<bits/stdc++.h>
#include<iostream>
#include<string>
using namespace std;
int countBracketReversals(string input) {
	// Write your code here
    stack<char> s;
    int i =0;
    while(input[i] != '\0'){
        s.push(input[i]);
        i++;
    }
    int len = s.size();
    if(len % 2 != 0){
        return -1;
    }else{
        int count = 0;
        string str;
        str = input;
        sort(str.begin(),str.end());
        int i =0;
        while(input[i] != '\0'){
            if(input[i] != str[i]){
                count++;
            }
            i++;
        }
        
        return count;
    }
    
}
int main() {
    string input;
    cin >> input;
    cout << countBracketReversals(input);
}
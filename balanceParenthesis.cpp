#include<stack>
#include<iostream>
#include<string>
using namespace std;

bool isBalanced(string expression) 
{   
    stack<char> s;
    int i=0;
    char str;
    int size = expression.size();
    if(size == 0){
        return true;
    }
    if(expression[0] == ')' || expression[0] == '}' || expression[0] == ']'){
        return false;
    }
    while(expression[i] != '\0'){
        str = expression[i];
        i++;
        if(str == '('  || str == '{' || str == '['){
            s.push(str);
        }else if((str == ')' && s.top() == '(') || (str == '}' && s.top() == '{')|| (str == ']' && s.top() == '[')){
            s.pop();
        } 
    }
    if(!s.empty()){
        return false;
    }
    return true;
    // Write your code here
    
}
int main() 
{
    string input;
    cin >> input;
    cout << ((isBalanced(input)) ? "true" : "false");
}
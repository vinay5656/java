#include<iostream>
using namespace std;

class Stack{
    int capacity;
    int top;
    int * data;
    public:
    Stack(int n):capacity(n),top(-1){
        data = new int[capacity];
    }
    void push(int element){
        top++;
        data[top] = element;
    }
    int pop(){
        int e = data[top];
        top--;
        return e;
    }
    bool isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    int size(){
        return top+1;
    }
};
int main(){
    int capacity;
    cin>>capacity;
    Stack roll_no(capacity);
    // cout<<roll_no.isEmpty();
    roll_no.push(101803296);
    roll_no.push(101803297);
    roll_no.push(101803298);
    roll_no.push(101803299);
    roll_no.push(101803291);
    roll_no.push(101803292);
    roll_no.push(101803293);
    // cout<<roll_no.isEmpty();
    cout<<roll_no.size()<<endl;
    cout<<roll_no.pop()<<endl;
    cout<<roll_no.size()<<endl;

    return 0;

}
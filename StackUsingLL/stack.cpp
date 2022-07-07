#include<iostream>
using namespace std;

class Node{
    public:
    int data;
    Node *next;
    public:
    Node(int d):data(d),next(NULL){}
};

class Stack{
    Node* head;
    int size;
    public:
    Stack():head(NULL),size(0){};
    void push(Node *newNode){
        if(head == NULL){
            head = newNode;
     
        }else{
          
            newNode->next = head;
            head = newNode;
            
        }
        size++;
    }
    int pop(){
        if(head == NULL){
            cout<<"stack is empty "<<endl;
            return 0;
        }
        int element = head->data;
        head = head->next;
        size--;
        return element;

    }
    int top(){
        if(head == NULL){
            cout<<"stack is empty "<<endl;
            return 0;
        }
        return head->data;
    }
    bool isEmpty(){
        if(head == NULL){
            cout<<"stack is empty "<<endl;
            return true;
        }else{
            cout<<"Stack is not empty"<<endl;
            return false;
        }
    }
    int stackSize(){
        return size;
    }
};

int main(){
    Node n1(10);
    Stack S;
    S.isEmpty();
    cout<<S.stackSize()<<endl;
    S.push(&n1);
    cout<<S.stackSize()<<endl;
    Node n2(20);Node n3(30);Node n4(40);Node n5(50);Node n6(60);Node n7(70);Node n8(80);Node n9(90);Node n10(110);
    cout<<S.stackSize()<<endl;
    S.push(&n2);S.push(&n3);S.push(&n4);S.push(&n5);S.push(&n6);S.push(&n7);S.push(&n8);S.push(&n9);S.push(&n10);
    cout<<S.stackSize()<<endl;
    cout<<"data = "<<S.pop()<<" "<<S.stackSize()<< " "<<"data = "<<S.pop()<<" "<<S.stackSize()<< " "<<"data = "<<S.pop()<<" "<<S.stackSize()<<endl;
    cout<<" data = "<< S.top()<<" "<<S.stackSize()<<endl;
    S.isEmpty();
return 0;

}
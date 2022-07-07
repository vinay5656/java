#include<iostream>
using namespace std;

class Node{
    public:
    int data;
    Node *next;
    public:
    Node(int d):data(d){
        next = NULL;
    }
    

};
int main(){

    Node n1(10);
    Node *head = &n1;
    Node n2(20);
    n1.next = &n2;
    Node n3(30);
    n2.next = &n3;
    Node n4(40);
    n3.next = &n4;
    Node n5(50);
    n4.next = &n5;
    Node n6(60);
    n5.next = &n6;
    Node n7(70);
    n6.next = &n7;
    Node *temp = head;
    while(temp != NULL){
        cout<<temp->data<<endl;
        temp = temp->next;
    }
    return 0;
    }
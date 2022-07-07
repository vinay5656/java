#include<iostream>
using namespace std;
// How to create dynamic link list
class Node{
    public:
    int data;
    Node *next;
    Node(int d):data(d),next(NULL){}
};
void print(Node *head){
    Node *temp = head;
    while(temp != NULL){
        cout<<temp->data<<endl;
        temp = temp->next;
    }
}
int sumOfElement(Node *head){
    int sum = 0;
    Node *temp = head;
    while(temp != NULL){
        sum = sum+temp->data;
        temp = temp->next;
    }
    return sum;
}
int main(){
    Node *n1 = new Node(10);
    Node *n2 = new Node(20);
    Node *n3 = new Node(30);
    Node *n4 = new Node(40);
    Node *n5 = new Node(50);
    Node *head = n1;
    n1->next = n2;
    n2->next = n3;
    n3->next = n4;
    n4->next = n5;
    print(head);
    cout<<"sum = "<<sumOfElement(head);
    
    return 0;
    
}

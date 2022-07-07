#include<iostream>
using namespace std;

class Node{
    public:
    int data;
    Node * next;
    Node(int d):data(d),next(NULL){}
};

Node* userInput(){
    int data;
    cin>>data;
    Node *head = NULL;
    Node *temp = NULL;
    while(data != -1){
        Node *newNode = new Node(data);
        if(head == NULL){
            head = temp = newNode;
        }else{
            temp->next = newNode;
            temp = newNode;
        }
        cin>>data;
    }
    return head;
}
void print(Node *head){
    Node *temp = head;
    while(temp != NULL){
        cout<<temp->data<<endl;
        temp = temp->next;

    }
}
int main(){
    Node *head = userInput();
    print(head);
    return 0;
    
}
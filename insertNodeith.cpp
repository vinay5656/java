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
int length(Node *head){
    Node *temp = head;
    int count = 0;
    if(temp == NULL){
        return -1;
    }else if(temp->next == NULL){
        return 1;
    }else{
        while(temp != NULL){
            count++;
            temp = temp->next;
        }
    }
    return count;
}
 Node* insertithNode(int ith,int data, Node *head){
     Node *newNode = new Node(data);
     int size = length(head);
     Node *temp = head;
     if(ith == size+1){
        while (temp != NULL)
        {
            temp = temp->next;
        }
        temp->next = newNode;
        return head;
     }else if(ith == 1){
         newNode->next = head;
         head = newNode;
         return head;
     }else{
         int n=1;
         while (ith-1 != n)
         {
             n++;
             temp = temp->next;
         }
         newNode->next = temp->next;
         temp->next = newNode; 
         return head;
     }
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
    cout<<" length = "<<length(head)<<endl;
    int ith,data;
    cin>>ith;

    cin>>data;
    head = insertithNode(ith,data,head);
    print(head);
    cout<<endl;
    cout<<length(head);
    return 0;
}
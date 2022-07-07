#include<iostream>
using namespace std;

class Node{
    public:
    int data;
    Node *next;
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
            head  = temp = newNode;
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
        cout<<temp->data<<" ";
        temp = temp->next;
    }
    cout<<endl;

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
int nodeData(int i,Node *head){
    int size = length(head);
    
    if(size < i || size == 0){
        return -1;
    }else{
       Node *temp = head;
       int n = 1;
       while(i != n){
           n++;
           temp = temp->next;
       }
       return temp->data; 
    }
    
}
int main(){
    int testCase;
    cin>>testCase;
    while(testCase>0){
        Node *head  = userInput();
        cout<<"length = "<<length(head)<<endl;
        print(head);
        int ith;
        cin>>ith;
        cout<<nodeData(ith,head)<<endl;
        testCase--;
    }

    return 0;
}

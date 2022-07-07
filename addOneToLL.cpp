
#include <iostream>
#include <stack>

using namespace std;
template <typename T>
class LinkedListNode
{
public:
    T data;
    LinkedListNode<T>* next;
    LinkedListNode(T data)
    { 
        this->data = data;
        next = NULL;
    }
};

LinkedListNode<int>* addOneToList(LinkedListNode<int> *head)
{
	stack<int> s;
    stack<int> tempStack;
    LinkedListNode<int> *temp = head;
    while(temp->data != -1){
        s.push(temp->data);
        cout<<"temp->data : "<<temp->data;
        temp = temp->next;
    }
    cout<<"p";
    int num = (s.top()+1)%10;
    int remainder  = (s.top()+1)/10;
   cout<<"D";
    tempStack.push(num);
    s.pop();
    while(s.size()!=0){
        cout<<"d";
        num=(s.top()+remainder)%10;
        remainder  = (s.top()+remainder)/10;
        s.pop();
        tempStack.push(num);
    }
    if(remainder != 0 ){
        tempStack.push(remainder);
    }
    LinkedListNode<int> *newhead = NULL;
    LinkedListNode<int> *tail = NULL;
    temp = newhead;
    while(tempStack.size()!=0){
        LinkedListNode<int> *newNode = new LinkedListNode<int>(tempStack.top());
        tempStack.pop();
        if(newhead == NULL){
            newhead = temp = tail = newNode;
        }else{
            temp->next = newNode;
            temp = temp->next;
            tail = temp;
        }
    }
    tail->next = new LinkedListNode<int>(-1);
    tail = tail->next;
    head = newhead;
    return head;
}


int main() {
	int data;
    cin>>data;
	LinkedListNode<int> *head = NULL;
	LinkedListNode<int> *temp = head;
	while(data != -1){
	    LinkedListNode<int> *newNode = new LinkedListNode<int>(data);
		if(head == NULL){
			head = temp = newNode;
        }else{
            temp->next = newNode;
            temp = temp->next;
        }
        int num;
        cin>>num;
		data = num;
	}
    cout<<"head"<<head->data<<endl;
	
    LinkedListNode<int>* res = addOneToList(head);
    temp = res;
	while(temp->data != -1 || temp != NULL){
		cout<<temp->data<<" ";
		temp = temp->next;
	}
    cout<<endl;
	return 0;
}
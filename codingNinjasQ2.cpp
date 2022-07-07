#include<iostream>
using namespace std;

class Node
    {
    public:
	    int data;
	    Node *next;
	    Node(int data)
	    {
	        this->data = data;
	        this->next = NULL;
	    }
};
int length(Node *head)
{
    //Write your code here
    Node *nextNode;
    int count = 0;
    if(head==NULL){
        return 0;
    }else{
        count++;
        nextNode = head;
        while(nextNode->next != NULL){
            nextNode = nextNode->next;
            count++;
        }
        return count;
    }
}
Node *appendLastNToFirst(Node *head, int n)
{
    //Write your code here
    Node *temp = head;
   
    int size = length(head);
    if(size == 0){
        return head;
        
    }else if(n<0){
        return head;
    }else{
        while(temp->next!= NULL){
             temp = temp->next;
             cout<<"hello"<<endl;
        }
        cout<<temp->data<<endl;
        int i = size-n;
        while(i>0){
            temp->next = head;
            head = head->next;
            temp = temp->next;
            temp->next = NULL;
            i--;
        }

        
        return head;
    }
    
}
Node *takeinput()
{
	int data;
	cin >> data;
	Node *head = NULL, *tail = NULL;
	while (data != -1)
	{
		Node *newnode = new Node(data);
		if (head == NULL)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail->next = newnode;
			tail = newnode;
		}
		cin >> data;
	}
	return head;
}

void print(Node *head)
{
	Node *temp = head;
	while (temp != NULL)
	{
		cout << temp->data << " ";
		temp = temp->next;
	}
	cout << endl;
}

int main()
{
	int t;
	cin >> t;
	while (t--)
	{
		Node *head = takeinput();
		int n;
		cin >> n;
		head = appendLastNToFirst(head, n);
		print(head);
	}
	return 0;
}

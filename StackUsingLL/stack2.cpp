#include <iostream>
using namespace std;

class Node {
   public:
    int data;
    Node *next;

    Node(int data) {
        this->data = data;
        next = NULL;
    }
};


class Stack {
	// Define the data members
    Node *head;
    int size;
   public:
    Stack(){
        head = NULL;
        size = 0;
        // Implement the Constructor
    }

	/*----------------- Public Functions of Stack -----------------*/

    int getSize() {
        return size;
        // Implement the getSize() function
    }

    bool isEmpty() {
        return (size == 0);
        // Implement the isEmpty() function
    }

    void push(int element) {
      
        Node *nNode = new Node(element);
        if(isEmpty()){
            head = nNode;
            
        }else{
            nNode->next = head;
            head = nNode;
        }
        size++;
        // Implement the push() function
    }

    int pop() {
        if(isEmpty()){
            return -1;
        }
        int element = head->data;
        head = head->next;
        size--;
        return element;
        
        // Implement the pop() function
    }

    int top() {
        if(isEmpty()){
            return -1;
        }
        return head->data;

        // Implement the top() function
    }
};

int main() {
    Stack st;

    int q;
    cin >> q;

    while (q--) {
        int choice, input;
        cin >> choice;
        switch (choice) {
            case 1:
                cin >> input;
                st.push(input);
                break;
            case 2:
                cout << st.pop() << "\n";
                break;
            case 3:
                cout << st.top() << "\n";
                break;
            case 4:
                cout << st.getSize() << "\n";
                break;
            default:
                cout << ((st.isEmpty()) ? "true\n" : "false\n");
                break;
        }
    }
}

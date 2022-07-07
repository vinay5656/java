#include<iostream>
#include<queue>
using namespace std;

void reverseQueue(queue<int> &input) {
	// Write your code here
    // int s = input.size();
    if(input.empty()){
        return;
    }else if(input.size() == 1){
        return;
    }
    queue<int> extra;
    // queue<int> temp;
    while(!input.empty()){
        // int element = input.front();
        extra.push(input.back());
        input.pop(); 
    }
   
    while (!extra.empty()) {
            cout << extra.front() << " ";
            extra.pop();
        }
   /*
    while(!extra.empty()){
        // int element = ;
        input.push(extra.front());
        extra.pop(); 
    }
    */
    return;
    
}
int main() {
    int t;
    cin >> t;

    while (t--) {
        queue<int> q;
        int size;
        cin >> size;

        for (int i = 0, val; i < size; i++) {
            cin >> val;
            q.push(val);
        }

        reverseQueue(q);
        // while (!q.empty()) {
        //     cout << q.front() << " ";
        //     q.pop();
        // }

        cout << "\n";
    }
}

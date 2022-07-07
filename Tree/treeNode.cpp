#include<iostream>
#include<vector>
using namespace std;
template <typename T>
class treeNode{
    public:
    T data;
    vector<treeNode<T>*> children ;
    treeNode(T d):data(d){};
};

int main(){
    treeNode<int> * root  = new treeNode<int>(1);
    treeNode<int> * Node1  = new treeNode<int>(2);
    treeNode<int> * node2  = new treeNode<int>(3);

    root->children.push_back(Node1);
    root->children.push_back(node2);
    return 0;
}
#include<iostream>
#include<string>

using namespace std;

class TrieNode{
    public:
    char data;
    TrieNode** children;
    bool isTerminal;
   
    TrieNode(char data):data(data),isTerminal(false){
        children  = new TrieNode*[26];
        for(int i=0;i<26;i++){
            children[i] =  NULL;
        }
    }

};

class Trie{
    TrieNode *root;
    public:
    Trie(){
        root = new TrieNode('\0');
    }
    void insertHelper(string word,TrieNode* root){
        if(word.size()==0){
            root->isTerminal = true;
            return;
        }
        int index = word[0]-'a';
        TrieNode *child;
        if(root->children[index] != NULL){
            child = root->children[index];
            cout<<child->data<<" ";
        }else{
           child = new TrieNode(word[0]); 
           cout<<child->data<<" ";
           root->children[index] = child;
        }
        insertHelper(word.substr(1),child);
        
        return;
    }
    void insert(string word){
        return insertHelper(word, root);
    }
    
    bool searchHelper(string word, TrieNode *root){
        if(root == NULL){
            return false;
        }
        if(word.size()== 0 && root->isTerminal == true){
            return true;
        }
        int index = word[0]-'a';
        TrieNode *child;
        if(root->children[index] == NULL){
            return false;
        }else{
            child = root->children[index];
            return searchHelper(word.substr(1),child);
        }
         
    }

    bool search(string word){
        if(word.size() == 0){
            cout<<"Please give us a word to search"<<endl;
            cout<<"Thank You"<<endl;
            return false;
        }
        return searchHelper(word,root);
    }

    void removeWord(string word, TrieNode* root){
        if(word.size()== 0 && root->isTerminal == true){
             root->isTerminal = false;
             cout<<root->data<<":";
             cout<<"Element deleted"<<endl;
             return; 
        }
        int index = word[0]-'a';
        TrieNode *child;
        if(root->children[index] != NULL){
            child = root->children[index];
            cout<<root->data;
        }else{
            cout<<"Element is Not exist"<<endl;
            return;
        }
        removeWord(word.substr(1),child);
        bool isAnyOther = false;
        for(int i = 0 ;i<26;i++){
            if(child->children[i] != NULL){
                isAnyOther = true;
            }
        }
        if(isAnyOther == false && child->isTerminal == false){
            root->children[index] = NULL;
            delete child;
        }
        return;
    }
    void remove(string word){
        if(word.size() == 0){
            return;
        }
        removeWord(word,this->root);
        return;
    }

};
int main(){
    Trie* root = new Trie();
    root->insert("ask");
    cout<<endl;
    root->insert("and");
     cout<<endl;
    root->insert("eat");
     cout<<endl;
    root->insert("ate");
     cout<<endl;

     cout<<root->search("eat")<<endl;
     cout<<root->search("ate")<<endl;
     cout<<root->search("app")<<endl;
     cout<<root->search("");
     cout<<endl;
     root->remove("eat");
     cout<<endl;
     root->remove("ebc");
     cout<<endl;
     cout<<root->search("ate")<<endl;
     
    return 0;
}
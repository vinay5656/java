#include<iostream>
#include<queue>
using namespace std;
/* BFS printing */
void printBFS(int **edges,int &s,bool *visited, int startVartex){
    queue<int> pendingVartex;
    pendingVartex.push(startVartex);
    visited[startVartex] = true;
    while(pendingVartex.size()!=0){
        int frontVartex = pendingVartex.front();
        cout<<frontVartex<<" ";
        pendingVartex.pop();
        for(int i=0;i<s;i++){
            if(frontVartex == i){
                continue;
            }
            if(edges[frontVartex][i] == 1 && visited[i]!=true ){
                
            /* this is my code check it but don't do it
            if(edges[frontVartex][i] == 1){
                if(visited[i]==true){
                    continue;
                }
                // I have done this because if element is already present in queue the i don't need to push it again
                if(pendingVartex.size() != 0){
                    queue<int> q_copy = pendingVartex;
                    bool flag = false;
                     while(!q_copy.empty()){
                         if(q_copy.front()== i){
                             flag = true;
                             break;
                         }
                         q_copy.pop();
                     }
                     if(flag == true){
                         continue;
                     }
    
                }
                pendingVartex.push(i);
            }
            */
           pendingVartex.push(i);
           visited[i]=true;
        }
     }
    }
    // I have done this because if graph is disconnected then i have to traverse other disconnected component
    for(int i =0;i<s;i++){
        if (visited[i]== false)
        {
            startVartex = i;
            printBFS(edges,s,visited,startVartex);
        }   
    }
    
   return;
}


/* DFS printing */
void printDFS(int** edges,int& size,bool *visited,int startVartex){
    cout<<startVartex<<" ";
    visited[startVartex] = true;
    for(int i=0;i<size;i++){
        if(startVartex == i){
            continue;
        }
    
        if(edges[startVartex][i] == 1){
            if(visited[i] == true){
                continue;
            }
            printDFS(edges,size,visited,i);
        }
    }
    return;
}
void DFS(int** edges,int& size){
    bool *visited = new bool[size];
    for(int i=0;i<size;i++){
        visited[i]= false;
    }
    for(int i=0;i<size;i++){
        if(!visited[i]){
            printDFS(edges,size,visited,i);
        }
    }
    delete [] visited;
    cout<<endl;
    return;
}
int main(){
    int v,e;
    cin>>v>>e;
    int** adjacencyMatrix = new int*[v];
    for(int i=0;i<v;i++){
         adjacencyMatrix[i] = new int[v];
         for(int j=0;j<v;j++){
             adjacencyMatrix[i][j] = 0;
         }
    }
    for(int i=0;i<e;i++){
        int f,s;
        cin>>f>>s;
        adjacencyMatrix[f][s] = 1;
        adjacencyMatrix[s][f] = 1;
    }
    DFS(adjacencyMatrix,v);
    bool* visited = new bool[v];
    for(int i=0;i<v;i++){
        visited[i] = false;
    }
    printDFS(adjacencyMatrix,v,visited,0);
    cout<<endl;
    for(int i=0;i<v;i++){
        visited[i] = false;
    }
    printBFS(adjacencyMatrix,v,visited,0);
    return 0;
}
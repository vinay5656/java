#include<iostream>
using namespace std;

void insertionSort(int *arr,int &size){
    for(int i=1;i<size;i++){
        for(int j=i-1;j>=0;j--){
            if(arr[j+1]<arr[j]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return;
}

int main(){
    int size;
    cin>>size;
    int *arr = new int[size];
    for(int i=0;i<size;i++){
        cin>>arr[i];
    }
    

    insertionSort(arr,size);
    for(int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}
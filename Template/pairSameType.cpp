#include<iostream>
using namespace std;

template<typename T>

class Pair{
    T x;
    T y;
    public:
     void setx(T x){
         this->x = x;
     }
     void sety(T y){
         this->y = y;
     }
     T getX(){
         return x;
     }
     T getY(){
         return y;
     }
};
int main(){
    /*
    Pair<int> p1;
    p1.setx(10);
    p1.sety(20);
    cout<<"X = "<<p1.getX()<<" "<<"Y = "<<p1.getY()<<endl;
     */


    /*
    Pair<double> p2;
    p2.setx(23.32);
    p2.sety(32.57);

    cout<<"X = "<<p2.getX()<<" "<<"Y = "<<p2.getY()<<endl;
    */

    Pair<char> p3;
    p3.setx('B');
    p3.sety('A');
    cout<<"X = "<<p3.getX()<<" "<<"Y = "<<p3.getY()<<endl;
    return 0;
}
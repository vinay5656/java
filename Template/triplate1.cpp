#include<iostream>
using namespace std;

template<typename A, typename B, typename C>

class Triplate{
    A x;
    B y;
    C z;
    public:
    void setX(A x){
        this->x = x;
    }

    void setY(B y){
        this->y = y;
    }

    void setZ(C z){
        this->z = z;
    }

    A getX(){
        return x;
    }

    B getY(){
        return y;
    }

    C getZ(){
        return z;
    }
    
};
int main(){
    /*
    Triplate<int, int, int> p1;
    p1.setX(2);
    p1.setY(1);
    p1.setZ(5);
    cout<<"< "<<p1.getX()<<", "<<p1.getY()<<", "<<p1.getZ()<<" >"<<endl;
    */
   Triplate<int, double, char> p1;
   p1.setX(2);
   p1.setY(74.012);
   p1.setZ('V');
   cout<<"< "<<p1.getX()<<", "<<p1.getY()<<", "<<p1.getZ()<<" >"<<endl;

    return 0;

}
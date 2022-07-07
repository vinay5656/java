#include<iostream>
using namespace std;

template<typename T, typename V>
class Pair{
    T x;
    V y;
    public:
    void setX(T x){
        this->x = x;
    }

    void setY(V y){
        this->y = y;
    }

    T getX(){
        return x;
    }

    V getY(){
        return y;
    }
};
int main(){
    Pair<int, double> p1;
    p1.setX(34);
    p1.setY(78.23);
    Pair< Pair<int, double>, char> p2;
    p2.setY('Q');
    p2.setX(p1);

    cout<<"< "<<p2.getX().getX()<<", "<<p2.getX().getY()<<", "<<p2.getY()<<" >"<<endl;
    return 0;

    return 0;
}
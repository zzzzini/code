#include <iostream>
#include <fstream>
using namespace std;

class Power {
    int kick;
    int punch;
public:
    Power(int kick=0, int punch=0) {
        this->kick = kick;
        this->punch = punch;
    }
    void show();
    Power operator + (Power op2);
    Power& operator += (Power op2);
    Power& operator ++ ();
    Power& operator ++ (int x);
};

void Power::show() {
    cout << kick << " " << punch << endl;
}

Power Power::operator + (Power op2) {
    Power tmp;
    tmp.kick = this->kick + op2.kick;
    tmp.punch = this->punch + op2.punch;
    return tmp;
}

Power& Power::operator += (Power op2) {
    kick = kick + op2.kick;
    punch = punch + op2.punch;
    return *this;
}

Power& Power::operator ++ () {
    kick++;
    punch++;
    return *this;
}

Power& Power::operator ++ (int x) {
    Power temp = *this;
    kick++;
    punch++;
    return temp;
}
int main() {
    Power a(3,5), b(4,6), c, d;
    c = a+b;
    a.show();
    b.show();
    c.show();
    d = a+=b;
    d.show();
    a.show();
    b = ++a;
    b.show();
    d = c++;
    d.show();
    c.show();
    
}

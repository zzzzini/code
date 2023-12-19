#include <iostream>
using namespace std;

class Power {
    int kick;
    int punch;
public:
    Power(int kick=0, int punch=0) {
        this->kick = kick; this->punch = punch;
    }
    void show();
    friend Power& operator++(Power& op);
    friend Power operator++(Power&op, int x);
};

void Power::show() {
    cout << "kick=" << kick << ',' << "punch=" << punch << endl;
}

Power& operator++(Power& op) {
    op.kick++;
    op.punch++;
    return op;
}

Power operator++(Power& op, int x) {
    Power tmp = op;
    op.kick++;
    op.punch++;
    return tmp;
}

class Power2 {
    int kick;
    int punch;
public:
    Power2(int kick=0, int punch=0) {
        this->kick = kick; this->punch = punch;
    }
    void show();
    friend Power2& operator--(Power2& op);
    friend Power2 operator--(Power2&op, int x);
};

void Power2::show() {
    cout << "kick=" << kick << ',' << "punch=" << punch << endl;
}

Power2& operator--(Power2& op) {
    op.kick--;
    op.punch--;
    return op;
}

Power2 operator--(Power2& op, int x) {
    Power2 tmp = op;
    op.kick--;
    op.punch--;
    return tmp;
}

int main() {
    Power a(3,5), b;
    b = ++a;
    a.show();
    b.show();
    b = a++;
    a.show();
    b.show();
    
    cout << endl;
    
    Power2 c(3,5), d;
    d = --c;
    c.show();
    d.show();
    d = c--;
    c.show();
    d.show();
}

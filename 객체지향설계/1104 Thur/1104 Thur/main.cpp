#include <iostream>
using namespace std;

void g(int a, int b=0, int c=0, int d=0) {
    cout << a << ' ' << b << ' ' << c << ' ' << d << endl;
}

int main() {
    g(10);
    g(10, 5);
    g(10, 5, 20);
    g(10, 5, 20, 30);
}

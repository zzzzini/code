#include <iostream>
using namespace std;

int g = 20;

int add(int x, int y) {
	return x+y;
}

int main() {
	int a, b, sum;
	cin >> a >> b;
	sum = a + b;
	cout << sum;
	return 0;
}
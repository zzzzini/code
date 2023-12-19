#include <iostream>
using namespace std;

class Shops {
public:
    int money; // 품목에 대한 가격
    int cnt; // 판매 수량
    int dis; // 디스카운트 율
    int sales(); // 판매 금액
    int saleswith(); // 판매이익(세금포함)
    int tax(); // 세금
    int snt(); // 실 판매이익
};
int Shops::sales() {
    return money * cnt;
}
int Shops::saleswith() {
    return money * cnt * dis / 100;
}
int Shops::tax() {
    return money * cnt * dis / 10;
}
int Shops::snt() {
    return (money * cnt * dis / 100) - (money * cnt * dis / 100 / 10);
}

int main() {
    int i = 1;
    int sum = 0; // 합계
    int totsaleswith = 0; // 총판매이익(세금포함)
    int tottax = 0; // 총세금
    int totsnt = 0; // 총 실판매이익
    int avg; // 영업점별 평균 실판매이익
    while (i<=3) {
        Shops shop;
        cout << "품목에 대한 가격 : ";
        cin >> shop.money;
        cout << "판매 수량 : ";
        cin >> shop.cnt;
        cout << "이익률 : ";
        cin >> shop.dis;
        cout << endl;
        
        cout << "영업점(" << i << ")" << endl;
        cout << "** 판매 금액 **" << endl;
        cout << "    - 가격 : " << shop.money << "  수량 : " << shop.cnt << "  판매 금액 : " << shop.sales() << endl;
        cout << "** 판매이익 **" << endl;
        cout << "    - 이익율 : " << shop.dis << "  판매이익(세금포함) : " << shop.saleswith() << endl;
        cout << "** 실 판매이익 **" << endl;
        cout << "    - 세금 : " << shop.tax() << "(10%)"
        << "  실 판매이익 : " << shop.snt() << endl;
        cout << "-----------------------------------------------" << endl;
        sum += shop.saleswith();
        cout << "합     계 : " << sum << endl;
        cout << "----------------------" << endl;
        totsaleswith += shop.saleswith();
        tottax += shop.tax();
        totsnt += shop.snt();
        i += 1;
    }
    avg = totsnt / 3;
    cout << "(1) 총판매이익(세금포함) : " << totsaleswith << endl;
    cout << "(2) 총세금 : " << tottax << endl;
    cout << "(3) 총 실판매이익 : " << totsnt << endl;
    cout << "(4) 영업점별 평균 실판매이익 : " << avg << endl;
}

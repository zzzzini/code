#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int a[5]; // 1분기의 사원 5명의 실적
    int b[5]; // 2분기의 사원 5명의 실적
    int c[5]; // 3분기의 사원 5명의 실적
    int d[5]; // 4분기의 사원 5명의 실적
    int sum[5]; // 개인의 1년 총 실적
    int nsum[4]; // 분기별 총 실적
    int total = 0; // 개인의 1년간 총 실적 총합
    double avg[4]; // 분기 평균
    double totavg; // 총합의 평균
    double ave[4]; // 분기 평균의 비율
    
    for(int i=0; i<5; i++) {
        cout << i+1 <<"번째 사원에 대한 분기별 판매 금액을 입력하세요 (단위 : 원) >> ";
        cin >> a[i];
        cin >> b[i];
        cin >> c[i];
        cin >> d[i];
    }
    for(int i=0; i<5; i++) {
        sum[i] = a[i] + b[i] + c[i] + d[i];
        total += sum[i];
    }
    nsum[0] = a[0] + a[1] + a[2] + a[3] + a[4];
    nsum[1] = b[0] + b[1] + b[2] + b[3] + b[4];
    nsum[2] = c[0] + c[1] + c[2] + c[3] + c[4];
    nsum[3] = d[0] + d[1] + d[2] + d[3] + d[4];
    
    for(int i=0; i<4; i++) {
        avg[i] = (double)nsum[i]/5;
    }
    
    totavg = total / 5;
    
    for(int i=0; i<4; i++) {
        ave[i] = avg[i] / totavg * 100;
    }
    
    cout << fixed;
    cout.precision(2);
    
    cout << "(단위: 1,000원)" << endl;
    cout << "==============================================================" << endl;
    cout << "판매번호  1/4분기     2/4분기      3/4분기      4/4분기      총합" << endl;
    cout << "==============================================================" << endl;
    for(int i=0; i<5; i++){
        cout << "  " << i+1 << "     " << a[i] << "      " << b[i] << "      " << c[i] << "      " << d[i] << "      " << sum[i] << endl;
    }
    cout << "분기총합" << "  " << nsum[0] << "     " << nsum[1] << "     " << nsum[2] << "     " << nsum[3] << "      " << total << endl;
    cout << "==============================================================" << endl;
    cout << "분기평균" << "  " << avg[0] << "   " << avg[1] << "   " << avg[2] << "   " << avg[3] << "   " << totavg << endl;
    cout.precision(1);
    cout << "비율" << "      " << ave[0] << "%      " << ave[1] << "%      " << ave[2] << "%     " << ave[3] << "%      " << "100%" << endl;
    cout << "==============================================================" << endl;
    cout << "100% 조정 작업 고려 : 가장 작은 값은 절단" << endl;
    
    // 이 다음부터는 그래프 틀은 직접 생성한 후, 한 사이즈가 4정도 되는 배열을 생성해서 비율을 저장후, 그에 비례해서 별을 출력
    
    int starnum[4];
    int starnum2[4];
    int tmp;
    int up;
    for(int i=0; i<4; i++){
        starnum[i] = ave[i] / 10;
    }
    for(int i=0; i<4; i++){
        tmp = round(ave[i]-(starnum[i]*10));
        if(tmp >= 5){
            up = 1;
        }
        else {
            up = 0;
        }
        starnum2[i] = starnum[i] + up;
    }
    
    for(int i=0; i<2; i++){
        cout << endl;
    }
    
    for(int i=0; i<4; i++){
        cout << "     " << i+1 << "/4   |   ";
        for(int j=0; j<starnum[i]; j++){
            cout << "*";
        }
        cout << endl;
    }
    
    for(int i=0; i<2; i++){
        cout << endl;
    }
    
    for(int i=0; i<4; i++){
        cout << "     " << i+1 << "/4   |   ";
        for(int j=0; j<starnum2[i]; j++){
            cout << "*";
        }
        cout << endl;
    }
}

#include <iostream>
using namespace std;

int main(){
	int x1,x2,x3,sum = 500;
	cin >> x1 >> x2 >> x3;
	if(abs(x1-x2)+abs(x1-x3) < sum){
		sum = abs(x1-x2)+abs(x1-x3);
	}
	if(abs(x2-x3)+abs(x2-x1) < sum){
		sum = abs(x2-x3)+abs(x2-x1);
	}
	if(abs(x3-x1)+abs(x3-x2) < sum){
		sum = abs(x3-x1)+abs(x3-x2);
	}
	cout << sum;
}

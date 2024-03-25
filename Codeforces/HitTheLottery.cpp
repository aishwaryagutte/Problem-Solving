#include <iostream>
using namespace std;

int main(){
	int n,res = 0;
	cin >> n;
	
	while(n > 0){
		if(n/100 != 0){
			res = res + n/100;
			n = n % 100;
		}else if(n/20 != 0){
			res = res + n/20;
			n = n % 20;
		}else if(n/10 != 0){
			res = res + n/10;
			n = n % 10;
		}else if(n/5 != 0){
			res = res + n/5;
			n = n % 5;
		}else{
			res += n;
			break;
		}
	}
	cout << res;
}

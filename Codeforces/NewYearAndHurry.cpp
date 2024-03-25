#include <iostream>
using namespace std;

int main(){
	int n,k,t = 240,res = 0, tmp = 0;
	cin >> n >> k;
	while(k <= t && n > 0){
		tmp+=5;
		if(k+tmp <= t)
			res++;
		k+=tmp;
		n--;
	}
	cout << res;
}

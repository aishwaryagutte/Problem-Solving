#include <iostream>
using namespace std;

int main(){
	int n,k,res=0;
	cin >> n >> k;
	for(int i = 0;i < k;i++){
		if(n > 0){
			if(n % 10 == 0)
				n = n / 10;
			else
				n--;
		}
	}
	cout << n;
	return 0;
}

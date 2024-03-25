#include <iostream>
using namespace std;

int main(){
	int n,p,tmp,res=0;
	cin >> n;
	cin >> p;
	tmp = p;
	for(int i = 1;i < n;i++){
		cin >> p;
		if(p % 10 == tmp / 10){
			res++;
		}
		tmp = p;
	}
	cout << res+1;
	return 0;
}

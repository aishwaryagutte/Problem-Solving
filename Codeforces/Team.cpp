#include <iostream>
using namespace std;

int main(){
	int n;
	cin >> n;
	static int ans = 0;
	for(int i=0;i<n;i++){
		int a,b,c;
		int res = 0;
		cin  >> a >> b >> c;
		if(a==1){
			res++;
		}
		if(b==1){
			res++;
		}
		if(c==1){
			res++;
		}
		if(res >= 2){
			ans++;
		}
	}
	cout << ans;
	return 0;
}

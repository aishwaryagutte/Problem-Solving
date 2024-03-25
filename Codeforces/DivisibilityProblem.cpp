#include <iostream>
using namespace std;

int main(){
	int t,res = 0;
	cin >> t;
	
	for(int i = 0;i < t;i++){
		int a,b;
		cin >> a  >> b;
		res = a % b;
		if(res != 0){
			res = b - res;
			cout << res << endl;
		}
		else
			cout << 0 << endl;
	}
	
	return 0;
}

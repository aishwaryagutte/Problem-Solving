#include <iostream>
using namespace std;

int main(){
	string x,y,res;
	cin >> x >> y;
	
	for(int i = 0;i < x.length();i++){
		if((x[i] == '0' && y[i] == '0') || (x[i] == '1' && y[i] == '1'))	
			res = res +'0';
		else
			res = res +'1';
	}
	cout << res;
	return 0;
}

#include <iostream>
using namespace std;

int main(){
	int n , res = 0;
	cin >> n;
	res = n/5;
	if(n % 5 != 0)
		cout<<res+1;
	else
		cout<<res;
	return 0;
}

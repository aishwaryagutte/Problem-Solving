#include <iostream>
using namespace std;

int main(){
	long long n;
	cin >> n;
	int cnt = 0;
	while(n > 0){
		if(n % 10 == 4 || n % 10 == 7){
			cnt++;
		}
		n = n / 10;
	}
	//cout<<cnt<<endl;
	if(cnt == 4 || cnt == 7)
		cout << "YES";
	else
		cout << "NO";
	return 0;
}

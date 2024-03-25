#include <iostream>
using namespace std;

int main(){
	int n,i=2;
	cin >> n;
	string s = "I hate";
	
	while(i <= n){
		if(i % 2 != 0)	
			s = s + " that I hate";
		if(i % 2 == 0)	
			s = s + " that I love";
		i++;
	}
	s = s + " it";
	cout << s;
	return 0;
}

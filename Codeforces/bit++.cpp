#include <iostream>
using namespace std;

int main(){
	int n, res = 0;
	cin >> n;
	string s;
	for(int i=0;i<n;i++){
		cin >> s;
		if(s == "X++")
			res++;
		if(s == "++X")
			++res;
		if(s == "--X")
			--res;
		if(s == "X--")
			res--;	
		//cout<<n;
	}
	cout<< res;
	return 0;
}

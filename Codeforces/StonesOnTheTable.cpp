#include <iostream>
using namespace std;

int main(){
	int n; 
	cin >> n;
	int res = 0;
	char ch[n];
	for(int i=0;i<n;i++){
		cin >> ch[i];
	}
	for(int i=0;i<n-1;i++){
		if(ch[i] == ch[i+1])
			res++;
	}
	cout<<res;
	return 0;
}

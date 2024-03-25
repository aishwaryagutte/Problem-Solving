#include <iostream>
using namespace std;

int main(){
	int n,res = 0;
	cin >> n;
	char ch[n];
	for(int i=0;i<n;i++){
		cin >> ch[i];
	}
	for(int i=0;i<n;i++){
		if(ch[i] == 'A')
			res++;
	}
	if(res > (n-res)){
		cout  << "Anton";
	}
	if(res < (n-res))
		cout << "Danik";
	if(res == (n-res))
		cout << "Friendship";	
	
	return 0;
}

#include <iostream>
using namespace std;

int main(){
	int n,t, cnt = 0;
	cin >> n >> t;
	char ch[n];
	
	for(int i = 0; i < n ;i++){
		cin  >> ch[i];
	} 
	
	while(t > 0){
		for(int i = 0; i < n ;i++){
			if(ch[i] == 'B' && ch[i+1] == 'G'){
				ch[i] = 'G';
				ch[i+1] = 'B';
				i++;
			}
		}	 
	t--;
	}
	for(int i = 0;i < n;i++){
		cout << ch[i];
	}
	return 0;
}

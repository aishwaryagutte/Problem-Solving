#include <iostream>
using namespace std;

int main(){
	int a,b;
	cin >> a >> b;
	if(a < b){
		cout << a << " ";
		cout << (b-a)/2;
	}
	else{
		cout << b << " ";
		cout << (a-b)/2;
	}
	
}

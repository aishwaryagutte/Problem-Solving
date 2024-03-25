#include <iostream>
#include <vector>
using namespace std;

int main(){
	int i = 0,res = 0;
	char ch;
	vector <char> v;
	int arr[26] = {0};
	while(true){
		cin >> ch;
		if(ch == '}')
			break;
		v.push_back(ch);
		if(ch >= 97 && ch <= 122){
			arr[ch-97] = ch;
		}
	}
	for(int j = 0;j < 26;j++){
		if(arr[j] != 0){
			res++;
		}
	}
	cout << res;
	return 0;
}

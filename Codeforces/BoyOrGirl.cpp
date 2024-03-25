#include <iostream>
using namespace std;

int main(){
	string s;
	cin >> s;
	int arr[26] = {0};

	for(int i=0;i<s.length();i++){
		int index = s[i] - 'a';
		arr[index]++;
	}

	int cnt = 0;
	for(int i=0;i<26;i++){
		if(arr[i] != 0){
			cnt++;
		}
	}

	if(cnt % 2 == 0)
		cout<<"CHAT WITH HER!";
	else
		cout<<"IGNORE HIM!";
	return 0;
}

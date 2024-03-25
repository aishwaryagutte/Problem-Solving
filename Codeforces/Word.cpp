#include <iostream>
using namespace std;

int main(){
	int tmp = 0;
	string s;
	cin >> s;
	for(int i = 0; i < s.length(); i++){
		if(s[i] >= 97 && s[i] <= 122){
			tmp++;
		}
	}
	if(tmp >= (s.length() - tmp)){
		for(int i = 0; i < s.length(); i++){
			s[i] = tolower(s[i]);
		}
	}
	else{
		for(int i = 0; i < s.length(); i++){
			s[i] = toupper(s[i]);
		}
	}
	cout << s;
	return 0;
}

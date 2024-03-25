#include <iostream>
using namespace std;

int main(){
	int s1,s2,s3,s4,cnt = 0;
	cin >> s1 >> s2 >> s3 >> s4;
	if(s1 == s2 && s1 != 0 && s2 != 0){
		s2 = 0;
		cnt++;
	}
	if(s2 == s3 && s2 != 0 && s3 != 0){
		s3 = 0;
		cnt++;
	}
	if(s3 == s4 && s3 != 0 && s4 != 0){
		s4 = 0;
		cnt++;
	}
	if(s1 == s4 && s1 != 0 && s4 != 0){
		s4 = 0;
		cnt++;
	}
	if(s2 == s4 && s2 != 0 && s4 != 0){
		s4 = 0;
		cnt++;
	}
	if(s1 == s3 && s1 != 0 && s3 != 0){
		s4 = 0;
		cnt++;
	}
	cout << cnt; 
}

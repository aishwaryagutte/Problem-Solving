#include <iostream>
using namespace std;

int main(){
	string s1,s2,s3;
	cin >> s1;
	cin >> s2;
	cin >> s3;
	int arr1[26] = {0};
	int arr2[26] = {0};
	
	for(int i = 0;i < s1.size();i++){
		arr1[s1[i] - 65]++;
	}
	for(int i = 0;i < s2.size();i++){
		arr1[s2[i] - 65]++;
	}
	for(int i = 0;i < s3.size();i++){
		arr2[s3[i] - 65]++;
	}
	for(int i = 0;i < 26;i++){
		if(arr1[i] !=  arr2[i]){
			cout << "NO";
			return 0;
		}
	}
	cout << "YES";
}

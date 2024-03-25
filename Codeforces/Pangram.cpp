#include <iostream>
using namespace std;

int main()
{
	int n;
	cin >> n;
	string s;
	cin >> s;
	int arr[26] = {0};
	for(int i = 0;i < n;i++){
		if(s[i] <= 122 && s[i] >= 97)
			arr[s[i]-97]++;
		if(s[i] <= 90 && s[i] >= 65)
			arr[s[i]+32-97]++;
	}

	for(int i = 0;i < 26;i++){
		if(arr[i] <= 0){
			cout << "NO";
			return 0;
		}
	}
	cout << "YES";
	return 0;
}

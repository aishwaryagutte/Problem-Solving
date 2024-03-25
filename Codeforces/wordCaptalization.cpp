#include <iostream>
using namespace std;

int main()
{
	string s;
	cin >> s;
	char c = toupper(s[0]);
	cout<<c;
	for(int i=1;i<s.length();i++){
		cout<<s[i];
	}
	return 0;
}

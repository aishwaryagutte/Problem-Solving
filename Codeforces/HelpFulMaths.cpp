#include <iostream>
using namespace std;

int main()
{
	string s;
	string res;
	cin >> s;
	int i=0;
	int ct1=0,ct2=0,ct3=0;
	while(i<s.length()){
		if(s[i] == '1')
			ct1++;
		if(s[i] == '2')
			ct2++;
		if(s[i] == '3')
			ct3++;
		i+=2;
	}
	for(int j=0;j<ct1;j++){
		res=res+"1"+"+";
	}
	for(int j=0;j<ct2;j++){
		res=res+"2"+"+";
	}
	for(int j=0;j<ct3;j++){
		res=res+"3"+"+";
	}
	res.pop_back();
	cout<<res;
	return 0;
}

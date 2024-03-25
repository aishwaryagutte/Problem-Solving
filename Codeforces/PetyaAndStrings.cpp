#include <iostream>
using namespace std;

int main(){
	string s1,s2;
	cin >> s1 >> s2;
	for (int x=0; x<s1.length(); x++)
        	s1[x]= tolower(s1[x]);
        	
        for (int x=0; x<s2.length(); x++)
        	s2[x]= tolower(s2[x]);

	//cout<<s1<<"  "<<s2<<" ";
	int res = 0;
	res = s1.compare(s2);
	//cout<< "res is: "<<res;
	if(res == 0)
		cout<< "0";
	if(res < 0)
		cout<< "-1";
	if(res > 0)
		cout<< "1";
	return 0;
}

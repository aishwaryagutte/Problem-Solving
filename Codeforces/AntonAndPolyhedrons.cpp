#include <iostream>
using namespace std;

int main(){
	int n,res = 0;
	cin >> n;
	while(n > 0){
		string s;
		cin >> s;
		if("Tetrahedron" == s)
			res+=4;
		if("Cube" == s)
			res+=6;
		if("Octahedron" == s)
			res+=8;
		if("Dodecahedron" == s)
			res+=12;
		if("Icosahedron" == s)
			res+=20;
		n--;
	}
	cout << res;
	return 0;
}

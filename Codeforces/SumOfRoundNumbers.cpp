#include <iostream>
#include <vector>
using namespace std;

int main(){
	int t;
	cin >> t;
	while(t > 0){
		int no;
		cin >> no;
		int tmp = no, i = 1;
		vector <int> v;
		while(no > 0)
		{
			tmp = no % 10;
			if(tmp != 0){
				v.push_back(tmp*i);
			}
			i*=10;
			no/=10;
		}
		cout << v.size() << endl;
		for(int i = 0;i < v.size();i++)
			cout << v.at(i) <<" ";
		t--;
	}
}

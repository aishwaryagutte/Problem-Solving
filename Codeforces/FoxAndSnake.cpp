#include <iostream>
using namespace std;

int main(){
	int n,m,cnt = 0;
	cin >> n >> m;
	for(int i = 0;i < n;i++){
		if((i + 1) % 4 == 0)
			cnt = 1;
		for(int j = 0;j < m;j++){
			if(i % 2 == 0){
				cout<<"#";
			}
			if(i % 2 != 0 && j < m-1 && cnt == 0){
				cout << ".";
			}else if(i % 2 != 0 && j== m-1 && cnt == 0){
				cout << "#";
			}
			if(i % 2 != 0 && j == 0 && cnt == 1){
				cout << "#";
			}else if(i % 2 != 0 && j< m && cnt == 1){
				cout << ".";
			}
		}
		cout << endl;
		cnt = 0;
	}
}

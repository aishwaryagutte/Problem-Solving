#include <iostream>
using namespace std;

int main(){
	int t;
	cin >> t;
	
	while(t > 0){
		int n,k,res = 1;
		cin >> n >> k;
		int arr[n];
		
		for(int i = 0;i < n;i++){
			cin >> arr[i];
		}
		
		for(int i = 0;i < n;i++){
			res = res * arr[i];
		}
		
		if(2023 % res == 0){
			cout << "YES" << endl;
			
			if(k == 3 && res == 1)
				cout <<"7"<<" "<<"17"<<" "<<"17";
			else{
				cout << 2023 / res ;
				int z = 0;
				while(z < k-1){
					cout << " "<< "1";
					z++;
				}
				cout<<endl;
			}
		}
		else{
			cout << "NO" << endl;
		}
		t--;
	}	
	return 0;
}

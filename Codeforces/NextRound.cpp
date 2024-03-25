#include <iostream>
using namespace std;
int main(){
	int n =0,k = 0;
	cin >> n >> k;
	int arr[n];
	int res = 0;
	for(int i=0;i<n;i++){
		cin >> arr[i];
	}
	int kValue = arr[k - 1];
	for(int i=0;i<n;i++){
		if((arr[i] >= kValue) && arr[i] != 0){
			res++;
		}
	}
	cout << res;
	return 0;
}

#include <iostream>
using namespace std;

int main(){
	int n;
	cin >> n;
	int arr[n+1] = {0};
	int p,q;
	cin >> p;
	int arr1[p];
	for(int i = 0;i < p;i++){
		cin >> arr1[i];
		arr[arr1[i]]++;
	}
	cin >> q;
	int arr2[q];
	for(int i = 0;i < q;i++){
		cin >> arr2[i];
		arr[arr2[i]]++;
	}
	
	for(int i = 1;i <= n;i++){
		if(arr[i] < 1){
			cout << "Oh, my keyboard!";
			return 0;
		}
	}
	cout << "I become the guy.";
	return 0;
}

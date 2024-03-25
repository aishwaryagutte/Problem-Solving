#include <iostream>
using namespace std;

int main(){
	int n,min = 0,max = 0,cnt = 0;
	cin >> n;
	int arr[n];
	for(int i = 0;i < n;i++){
		cin >> arr[i];
	}
	max =  arr[0],min = arr[0];
	//cout << min <<" ";
	for(int i = 1;i < n;i++){
		if(arr[i] > max){
			cnt++;
			max = arr[i];
			//cout << max << " ";
		}
		if(arr[i] < min){
			cnt++;
			min = arr[i];
			//cout << min << " ";
		}
	}
	cout << cnt;
}

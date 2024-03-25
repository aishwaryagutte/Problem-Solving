#include <iostream>
using namespace std;

int main(){
	int n,max = 0,min = 2000,res = 0,x = 0,y = 0;
	cin >> n;
	int arr[n];
	for(int i = 0;i < n;i++){
		cin >> arr[i];
	}
	
	for(int i = 0;i < n;i++){
		if(arr[i] > max && i >= x){
			max = arr[i];
			x = i;
			//cout << max <<" "<<x<<" ";
		}
		if(arr[i] <= min && i >= y){
			min = arr[i];
			y = i;
			//cout << min <<" "<<y<<" ";
		}
	}
	//cout << max << " "<<min<<" "<<x<<" "<<y<<" ";
	if(max == arr[0] && min == arr[n-1])
		cout << 0;
	else{
		if(x < y)
			cout << x + (n - y) - 1;
		else
			cout << x + (n - y) - 2;
	}
}

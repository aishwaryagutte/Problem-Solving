#include <iostream>
using namespace std;

int main(){
	int n,cnt = 0,res = 0;
	cin >> n;
	int arr[n];
	for(int i = 0;i < n;i++)
		cin >> arr[i];
		
	for(int i = 0;i < n;i++){
		if(arr[i] > 0){
			cnt+=arr[i];
		}
		if(arr[i] < 0 && cnt > 0){
			cnt--;
		}else if(arr[i] < 0 && cnt == 0){
			res++;
		}
		//cout << res << " "<<cnt<<" ";
	}
	cout << res;
}

#include<bits/stdc++.h>
using namespace std;

int main(){
	int n;
	float res = 0.0;
	cin >> n;
	int arr[n];
	
	for(int i = 0;i < n;i++){
		cin >> arr[i];
	}
	
	for(int i = 0;i < n;i++){
		res+=arr[i];
	}

	cout<<fixed<<setprecision(12)<<res/n<<endl;
	return 0;
}

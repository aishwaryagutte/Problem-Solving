#include <iostream>
using namespace std;

int main(){
	int account;
	cin >> account;
	if(account > 0){
		cout << account;
		return 0;
	}
	int unitDigit = account % 10;
	int lastButOneDigit = account;
	lastButOneDigit = lastButOneDigit / 10;
	lastButOneDigit = lastButOneDigit % 10;
	
	if(lastButOneDigit < unitDigit){
		account /= 100;
		account = (account * 10) + unitDigit;
		cout << account;
		
	}else{
		cout << account / 10;
	}
	//cout << unitDigit << " " << lastButOneDigit;
}

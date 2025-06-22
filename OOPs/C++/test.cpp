#include<iostream>
#include<string>
#include<vector>
#include<queue>
#define ll long long
using namespace std;

bool solve( ll n )
{
    
    
}
int main()
{
    int t ;
    cin>>t;
    while( t -- )
    {
        ll n ;
        cin>> n;
        string num = to_string( n );
        int currSum = 0;
        for( int i = 0 ; i < num.size() ; i++ )
        {
            currSum += num[ i ] - '0';
        }
        bool x = solve( num , 0 );
        if( x )
        {
            cout<< "YES"<< endl;
        }
        else
        {
            cout<< "NO"<<endl;
        }
    }
    return 0;
}

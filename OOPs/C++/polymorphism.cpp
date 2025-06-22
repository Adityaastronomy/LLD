#include<iostream>

using namespace std;
class Add
{
    public:
    // sum x and y 
    int sum( int x , int y )
    {
        return ( x + y );
    }
    // sum x, y and z
    int sum( int x , int y , int z )
    {
        return ( x + y + z);

    }
    double sum( double x , double y )
    {
        return ( x + y );
    }

};
class Complex
{
    public:
    int real , imag ;
    Complex( )
    {
        real = 0;
        imag = 0;
    }
    Complex( int r , int i )
    {
        real = r;
        imag = i;
    }
    void print()
    {
        cout<<"Imaginary number is = "<< real <<" + i "<< imag << endl;
    }
    Complex operator + (const  Complex & obj )
    {
        Complex ans ;
        ans.real = real + obj.real;
        ans.imag = imag + obj.imag;
        return ans;
    }
    Complex operator - (const  Complex & obj )
    {
        Complex ans ;
        ans.real = real - obj.real;
        ans.imag = imag - obj.imag;
        return ans;
    }
    bool operator == (const  Complex & obj )
    {
        if( real == obj.real && imag == obj.imag )
        {
            return true;
        }
        return false;
    }

};

int main()
{
    // Add a;
    // cout<< a.sum( 1 , 4 )<< endl;
    // cout<< a.sum( 1 , 2, 3 )<< endl;
    // cout<< a.sum( 1.23 , 2.23 )<< endl;
    Complex a( 9 , 8 );
    a.print();
    Complex b( 2 , 3 );
    b.print();
    Complex c = a + b ;
    c.print();
    Complex d = a - b;
    d.print();
    bool equal = ( c == d );
    cout<< equal<<endl;
    return 0;
}

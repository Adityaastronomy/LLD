#include<iostream>
#include"bird.h"
using namespace std;

void birdDoSomething( Bird * b )
{
    b->eat();
    b->fly();
    b->eat();
}
int main()
{
    Bird * bird = new Pigeon();
    birdDoSomething( bird );
    return 0;
}

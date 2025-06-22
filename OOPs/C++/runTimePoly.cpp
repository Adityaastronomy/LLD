#include<iostream>

using namespace std;
class Shape
{
    public:
    virtual void draw()
    {
        cout<< "Generic Drawing "<<endl;
    }
    // void draw()
    // {
    //     cout<< "Generic Drawing"<<endl;
    // }
};
class Circle : public Shape
{
    public:
    void draw() //override
    {
        cout<<"Circle is drawing "<<endl;
    }
};
class Rectangle : public Shape
{
    public:
    void draw() //override
    {
        cout<<"Rectangle is drawing "<<endl;
    }
};
class Triangle : public Shape
{
    public:
    void draw() //override
    {
        cout<<"Triangle is drawing "<<endl;
    }
};

void shapeDrawing( Shape * s )
{
    // for calling the relevant draw() of the parameter passed
    s->draw();  // draw s polymorphic

}
int main()
{
    // Circle c ;
    // Shape * r = new Rectangle();
    // Shape * s = & c;    //upcasting 

    // shapeDrawing( &c );
    // shapeDrawing( r );
    // shapeDrawing( s );
    // Triangle * t = new Triangle();
    // shapeDrawing( t );


    // without using virtual keyword

    Shape * s = new Shape;
    s->draw();

    // upcasting
    Shape * s1 = new Circle();
    s1->draw();

    Circle * c = new Circle();
    c->draw();

    // downcasting
    Shape * s2 = new Shape();
    Circle *c2 = (Circle * )s2 ;
    c2->draw();
    return 0;
}

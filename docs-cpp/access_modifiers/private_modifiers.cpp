#include <iostream>
using namespace std;

class Parent {
    protected:
    int a;

};

class Child : private Parent {

};

class GrandChild : public Child {
    public:
    void fun (int x) {
        a = x;

        cout << a;
    }
};

int main () {
    GrandChild object;
    object.fun(25);
    return 0;
}
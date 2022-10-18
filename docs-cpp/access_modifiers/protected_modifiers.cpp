#include <iostream>
using namespace std;

class Parent {
    protected:
    int a;

};

class Child : protected Parent {
    public:
    void fun (int x) {
        a = x;
        cout << a;
    }
};

int main () {
    Child object;
    object.fun(25);
    return 0;
}
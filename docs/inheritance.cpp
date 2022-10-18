#include <iostream>

using namespace std;

class Parent {
    public:
    int fun () {
        cout << "This is parent";
    }
};

class Child : public Parent {

};

int main () {
    Child object;
    object.fun();
}
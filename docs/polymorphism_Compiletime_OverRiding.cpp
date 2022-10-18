#include <iostream>
using namespace std;

class ComputeSum {
    public:
    int sum(int x, int y) {
        return x + y;
        cout << "This is Parent class's sum";
    }
};

class Child : public ComputeSum {
    public:
    int sum(int a, int b) {
        return a + b;

        cout << "This is child class's sum";
    }
};

int main() {
    Child obj;
    cout << "Sum is " << obj.sum(10, 20) << endl;
    return 0;
}
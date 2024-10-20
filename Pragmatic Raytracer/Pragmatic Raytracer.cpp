#include <iostream>

class tuple {
public:
    float x, y, z, w;
    tuple(float, float, float, float);

    tuple operator+(const tuple& other) const
    {
        tuple result = tuple(this->x + other.x, this->y + other.y, this->z + other.z, this->w + other.w);
        return result;
    }
    tuple operator-(const tuple& other) const
    {
        tuple result = tuple(this->x - other.x, this->y - other.y, this->z - other.z, this->w - other.w);
        return result;
    }
};

tuple::tuple(float x, float y, float z, float w) 
{
    this->x = x;
    this->y = y;
    this->z = z;
    this->w = w;
}

class point : public tuple 
{
public:
    point(float x, float y, float z) : tuple(x, y, z, 0) {}
};


class vector : public tuple {
public:
    vector(float x, float y, float z) : tuple(x, y, z, 1) {}
};


int main()
{
    std::cout << "Hello World!\n";
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file

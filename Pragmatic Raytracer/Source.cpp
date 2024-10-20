#include "Header.h"


void featurePrinter() {
    using namespace std;
    string line;
    ifstream myfile("code/features/tuples.feature");
    if (myfile.is_open())
    {
        while (getline(myfile, line))
        {
            cout << line << '\n';
        }
        myfile.close();
    }

    else cout << "Unable to open file";
}
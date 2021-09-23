#include <iostream>
#include <fstream>

using std::endl;
using std::cout;

int main(){

    std::ifstream file;
    file.open("test.txt");
    if(!file){
        std::cerr<< "Problem opening the file"<<endl;
        return 1;
    }

    std::string line;

    while(std::getline(file, line)){
        cout<<line<<endl;
    }

    file.close();
    return 0;
}
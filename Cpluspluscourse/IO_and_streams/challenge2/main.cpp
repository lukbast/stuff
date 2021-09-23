#include <fstream>
#include <iostream>
#include <unordered_map>
#include <string>
#include <iomanip>

using std::unordered_map;
using std::string;
using std::cout;
using std::endl;
using std::setw;
using std::left;

int evaluate_score(string &key, string &response);
void output_grades(unordered_map<string, int> &grades);

int main(){

    std::ifstream file;
    file.open("responses.txt");

    if(!file){
        std::cerr << "Error opening the file."<<endl;
        return 1;
    }

    string key;
    file>>key;

    unordered_map<string, int> grades;
    string response {};
    string name {};
    while(file >> name){
        if(file >> response){
            grades[name] = evaluate_score(key, response);
        } else {
            file.close();
            std::cerr << "Error in file formating - response for student "<<name<<" is missing"<<endl;
            return 1;
        }
    }

    file.close();
    output_grades(grades);
    return 0;
}


int evaluate_score(string &key, string &response){
    int score {0};
    for (size_t i = 0; i<key.size(); i++){ 
            if(response[i] == key[i]){
                score++;
        }
    }
    return score;
}


void output_grades(unordered_map<string, int> &grades){
    int sum_of_scores {0};
    int num_of_students {0};

    
    cout<<left<<setw(20)<<"Student"<<"Score\n";
    cout<<"=========================\n";

    for(auto res: grades){
        cout<<left<<setw(22)<< res.first<< res.second<<endl;
        sum_of_scores += res.second;
        num_of_students ++;
    }
    cout<<"=========================\n";
    cout<<left<<setw(21)<<"Averge Score"<<((sum_of_scores *1.0)/num_of_students)<<"\n";
}
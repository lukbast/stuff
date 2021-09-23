// Section 19
// Challenge 1
// Formatting output
#include <iostream>
#include <iomanip>
#include <vector>
#include <string>

using std::string;
using std::cout;
using std::endl;
using std::setw;
using std::left;

struct City {
    std::string name;
    long population;
    double cost;
};

// Assume each country has at least 1 city
struct Country {
    std::string name;
    std::vector<City> cities;
};

struct Tours {
    std::string title;
    std::vector<Country> countries;
};

int main()
{
    Tours tours
        { "Tour Ticket Prices from Miami",
            {
                {
                    "Colombia", { 
                        { "Bogota", 8778000, 400.98 },
                        { "Cali", 2401000, 424.12 },
                        { "Medellin", 2464000, 350.98 },
                        { "Cartagena", 972000, 345.34 } 
                    },
                },
                {
                    "Brazil", { 
                        { "Rio De Janiero", 13500000, 567.45 },
                        { "Sao Paulo", 11310000, 975.45 },
                        { "Salvador", 18234000, 855.99 }
                    },
                },
                {
                    "Chile", { 
                        { "Valdivia", 260000, 569.12 }, 
                        { "Santiago", 7040000, 520.00 }
                },
            },
                { "Argentina", { 
                    { "Buenos Aires", 3010000, 723.77 } 
                } 
            },
        }
    };

    // Unformatted display so you can see how to access the vector elements
    cout<<"                        "<< tours.title << endl;
    cout<<"================================================================================"<<endl;
    cout <<setw(20) <<left<<"Country" <<setw(20) <<left<<"City"<<setw(20) <<left<<"Popultation"<<setw(20) <<left<<"Cost"<<endl;
    cout<<"================================================================================"<<endl;
    string cntry {};
    int counter {};
    for(auto country : tours.countries) {   // loop through the countries
        counter = 0;
        for(auto city : country.cities) { 
            cntry = country.name;
            if (counter != 0) cntry = " ";
            cout <<setw(20) <<left <<cntry 
                 <<setw(20) <<left <<city.name
                 <<setw(20) <<left <<city.population
                 <<setw(20) <<left <<city.cost<<endl;
            counter++;

        }
    }

    cout << endl << endl;
    return 0;
}
#include "Movie.h"
#include <iostream>

using std::string;

Movie::Movie(string name, string rating, int watched)
    :name {name},rating{rating}, watched{watched}{
}

Movie::Movie(const Movie &source)
    :Movie{source.name, source.rating, source.watched}{ 
}


Movie::~Movie(){
}

string Movie::get_name() const{
    return this->name;
}

string Movie::get_rating() const{
    return this->rating;
};

int Movie::get_watched() const{
    return this->watched;
}

void Movie::display() const{
    std::cout<< "\""<<this->name<<"\""<<" | "<<this->rating <<" | " <<this->watched<< std::endl;
}

void Movie::increment_wtchd(){
    this->watched ++;
}

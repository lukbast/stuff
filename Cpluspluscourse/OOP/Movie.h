#ifndef __MOVIE_H__
#define __MOVIE_H__
#include <string>
class Movie {
    private:
        std::string name;
        std::string rating;
        int watched;
    public:
    //Constructor
    Movie(std::string name, std::string rating, int watched = 0);

    Movie(const Movie &source);
    //Destructor
    ~Movie();

    std::string get_name() const;
    std::string get_rating() const;

    void increment_wtchd();
    int get_watched() const;
    void display() const;
};
#endif
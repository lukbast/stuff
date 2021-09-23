#include "Movies.h"

using std::string;
using std::vector;

Movies::Movies(){
}

Movies::~Movies(){
}

Movies::Movies(const Movies &source)
    :movies_list{source.movies_list}{
}

Movie Movies::create_movie(string name, string rating, int watched){
    return Movie(name, rating, watched);
}

bool Movies::add_movie(Movie movie_to_add){
    for (const Movie &movie: movies_list){
        if(movie.get_name() == movie_to_add.get_name()){
            return false;
        }
    }
    movies_list.push_back(movie_to_add);
    return true;
}

bool Movies::increment_watched(string name){
   for (Movie &movie: movies_list){
        if(movie.get_name() == name){
            movie.increment_wtchd();
            return true;
        }
    }
    return false;
}

void Movies::display_movies(){
    for (const Movie &movie: movies_list){
        movie.display();
    }
}


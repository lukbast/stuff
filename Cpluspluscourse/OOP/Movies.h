#ifndef __MOVIES_H__
#define __MOVIES_H__
#include <vector>
#include "Movie.h"

using std::string;
using std::vector;


    class Movies{
        private:
            vector<Movie> movies_list;
        public:
            //Constructor
            Movies(); 

            //Copy constructor
            Movies(const Movies &source);

            // Destructor
            ~Movies();

            Movie create_movie(string name, string rating, int watched);
            bool add_movie(Movie movie_to_add);
            bool increment_watched(string name);
            void display_movies();
    };
#endif
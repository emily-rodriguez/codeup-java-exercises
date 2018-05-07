package movies;

import util.Input;


public class MoviesApplication {

    public static Input input = new Input();
    public static Movie[] movies = MoviesArray.findAll();

    public static void showMovie(Movie movie) {
        System.out.println(Movie.getMovie(movie));
    }

    public static void showMovies() {
        for (Movie movie: movies){
            showMovie(movie);
        }
    }

    public static void filterMovies(String category){
        for (Movie movie: movies) {
            if (movie.getCategory().equals(category)){
                showMovie(movie);
            }
            continue;
        }
    }

    public static Movie newMovie(){
        String userInputName = input.getString("Please enter a movie title: ");
        String userInputCategory = input.getString("Please enter a movie genre");
        return new Movie(userInputName, userInputCategory);
    }

//    public static Movie[] addMovie(Movie[] originalArray, Movie newMovieItem){
//        int currentSize = originalArray.length;
//        int newSize = currentSize + 1;
//        Movie[] tempArray = new Movie[ newSize ];
//        for (int i = 0; i < currentSize; i++) {
//            tempArray[i] = originalArray[i];
//        }
//        tempArray[newSize - 1] = newMovieItem;
//        return tempArray;
//    }

    public static int numberOfMovies = movies.length;


    public static void showMenu() {
        do {
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a movie");
            System.out.println();

            int userChoice = input.getInt("Enter your choice: ");

            switch (userChoice) {
                case 0:
                    System.exit(0);
                case 1:
                    showMovies();
                    break;
                case 2:
                    filterMovies("animated");
                    break;
                case 3:
                    filterMovies("drama");
                    break;
                case 4:
                    filterMovies("horror");
                    break;
                case 5:
                    filterMovies("scifi");
                    break;
                case 6:
            }
        } while (true);
    }



    public static void main(String[] args) {
        showMenu();
    }
}

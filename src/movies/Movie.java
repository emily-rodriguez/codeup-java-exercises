package movies;

public class Movie {

    private String name;
    private String category;

    public Movie (String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
        return this.name = name;
    }

    public String getCategory(){
        return category;
    }

    public String setCategory(String category){
        return this.category = category;
    }

    public String filterMovies(String[] array, String userCategory){
        for (String movie : array) {
            if (category.equals(userCategory)) {
                System.out.println(movie);
                return movie;
            }
        } return userCategory;
    }



//    public String[] userInput(int input){
//        if (input == 1){
//            return MoviesArray.findAll();
//        } else if (input == 2){
//            return filterMovies(MoviesArray.findAll(), "animated")
//        }
//    }

}
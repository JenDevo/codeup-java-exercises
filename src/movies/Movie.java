package movies;

public class Movie {

    /*BELOW: Private Fields of name and category*/
    private String name;
    private String category;


    /*Constructor sets both name and category private fields */
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }
}

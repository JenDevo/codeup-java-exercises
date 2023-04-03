package movies;

import java.awt.*;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] arr){
        Scanner userScan  = new Scanner(System.in);

        Movie[] movies = MoviesArray.findAll();
        boolean proceed = true;

        do {
            System.out.println("----------------");
            System.out.println("What would you like to do?" +
                    "\n0 - exit " +
                    "\n1 - view all movies " +
                    "\n2 - view animated genres " +
                    "\n3 - view drama genre " +
                    "\n4 - view horror genre " +
                    "\n5 - view scifi genre");
            System.out.println("----------------");
            int userNumber = userScan.nextInt();

            switch (userNumber){
                case 0:
                    System.out.println("Exiting...");
                    break;

                case 1:
                    System.out.println("All movies: ");

                    for (Movie movie : movies){
                        System.out.printf("'%s' - %s \n", movie.getName(), movie.getCategory());
                    }
                    break;

                case 2:
                    System.out.println("Animated movies");
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("animated")){
                            System.out.printf("'%s' : %s \n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Drama movies");
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("drama")){
                            System.out.printf("'%s' : %s \n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    System.out.println("horror movies");
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("horror")){
                            System.out.printf("'%s' : %s \n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Scifi movies");
                    for (Movie movie : movies){
                        if(movie.getCategory().equals("scifi")){
                            System.out.printf("'%s' : %s \n", movie.getName(), movie.getCategory());
                        }
                    }
            }

        } while (proceed);
    }
}

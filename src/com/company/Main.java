package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
// Create an application which will prompt the user to enter the name of their favorite Movie.
// Add the Movie to an array list. Use a loop to continue adding movies to the array until the
// user presses q or Q.Once the user presses Q then print the list of movies before exiting the program.
    public static void main(String[] args) {
        String answer;
        ArrayList<String> movies = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        movies.add("Star Wars: New Hope");
        movies.add("Transformers 1");
        movies.add("Avengers");
        movies.add("Bumble Bee");
        movies.add("500 Days of Summer");

        System.out.print("Enter a movie: ");
        movies.add(input.nextLine());
        System.out.print("Do you want to add another movie?(q to quit) ");
        answer = input.nextLine();

        while (!answer.equalsIgnoreCase("q")){
            System.out.print("Enter a movie: ");
            movies.add(input.nextLine());
            System.out.print("Do you want to add another movie?(q to quit) ");
            answer = input.nextLine();
        }//end-while

        System.out.printf("All the movies are: %s", movies);
        System.out.println();
        Collections.sort(movies);
        System.out.printf("All the movies sorted are: %s", movies);
        System.out.println();
        int rand = (int)(1+Math.random()*movies.size()-1);
        System.out.printf("How about watching: %s", movies.get(rand));
    }
}

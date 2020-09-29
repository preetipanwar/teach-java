package com.teachjava.miniprograms;

import java.util.Scanner;

public class Movie {
    // Field every movie should hold
        // movieName    - String
        // actors       - [actor1, actor2, actor3]
        // releaseDate  - Date
        // duration     - int       -- duration in minutes

     String actor;
     String director;

    // constructor
    public Movie(String actor, String director){
        this.actor = actor;
        this.director = director;
    }

    // Methods()
        // printMovieName()
        // printActors()
        // printDuration()

    // method
   public void printDetails(){
        System.out.println("Actor name: " + actor);
        System.out.println("Director name: " + director);
    }

    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter actor name: ");
        String actor = input.nextLine();
        System.out.println("Enter director name: ");
        String director = input.nextLine();

        Movie dangal = new Movie(actor, director);
        dangal.printDetails();


        // In Java, variables cannot contain objects, they only references to objects.
//        Movie taarezameenpar = new Movie("taarezameenpar", "aamir");          // --> memory address 00x12123
//        Movie likestartsinthesky = taarezameenpar;                            // --> memory address 00x12123

   }
}

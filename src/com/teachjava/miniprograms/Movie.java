package com.teachjava.miniprograms;

public class Movie {


    // Field every movie should hold
        // movieName    - String
        // actors       - [actor1, actor2, actor3]
        // releaseDate  - Date
        // duration     - int       -- duration in minutes

     String movieName;
     String actor;

    public Movie(String movieName, String actor){
        this.movieName = movieName;
        this.actor = actor;
    }


    // Methods()
        // printMovieName()
        // printActors()
        // printDuration()



    public static void main(String[] args) {



        // In Java, variables cannot contain objects, they only references to objects.
        Movie taarezameenpar = new Movie("taarezameenpar", "aamir"); // --> memory address 00x12123

        Movie likestartsinthesky = taarezameenpar;                                     // --> memory address 00x12123

        taarezameenpar.actor = "sharman joshi";
        System.out.println(taarezameenpar.actor);
        System.out.println(likestartsinthesky.actor);

    }
}



// 1. this keyword
// 2. object reference variable -> Movie class
// 3. object as a parameter -> Account class
// 4. Garbage collection

// 5. finalize vs final -> internet



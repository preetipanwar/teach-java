package com.teachjava.movies;

public class Movie {

        // properties
        String actor;
        String director;
        int duration;

        // constructor is just a function
        Movie(String actor, String director, int duration){
            this.actor      = actor;
            this.director   = director;
            this.duration   = duration;
        }

        // method
        public int increaseDuration(){
            return this.duration + 1;
        }

        public void printActorName(){
            System.out.println(this.actor);
        }

        public void printDirectorName(){
            System.out.println(this.director);
        }


    public static void main(String[] args) {
        // create objects
        Movie sultan = new Movie("salman", "kashyap", 3);
        Movie dangal = new Movie("Aamir", "nitesh", 3);
        Movie raatAkeliHai = new Movie("nawaz", "kashyap", 2);

        // print dangals actor
        sultan.printActorName();
        dangal.printActorName();

        // print director
        sultan.printDirectorName();
        dangal.printDirectorName();

        System.out.println(raatAkeliHai.increaseDuration());
        System.out.println(sultan.increaseDuration());
    }
}


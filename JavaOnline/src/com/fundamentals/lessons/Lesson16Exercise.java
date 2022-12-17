package com.fundamentals.lessons;

public class Lesson16Exercise {
    public enum MovieGenre{ HORROR_FILMS, ACTION, WAR_DRAMA, COMEDY, CRIME}
    public void showMovies(){
        System.out.println(MovieGenre.WAR_DRAMA);
    }
    public void myFavoriteMovieGenre(MovieGenre famous){
        String message = "My famous movie genre is ";
        switch (famous){
            case HORROR_FILMS:
                message += "Horror films";
                break;
            case ACTION:
                message += "action movies";
                break;
            case WAR_DRAMA:
                message += "war drama movies ";
                break;
            case COMEDY:
                message += "comedy movies";
                break;
                default:
                message += "crime";
                break;

        }
        System.out.println(message);

    }
}

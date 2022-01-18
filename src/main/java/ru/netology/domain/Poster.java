package ru.netology.domain;

public class Poster {
    private int id;
    private String MovieName;
    private String MovieGenre;

    public Poster(int id, String movieName, String movieGenre) {
        this.id = id;
        MovieName = movieName;
        MovieGenre = movieGenre;
    }
}
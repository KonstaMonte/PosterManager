package ru.netology.manager;

import org.junit.jupiter.api.Test;

import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    @Test
    public void displayLastTenMovies() {
        PosterManager manager = new PosterManager(10);

        Poster first = new Poster(1, "Бладшот", "боевик");
        Poster second = new Poster(2, "Вперед", "мультфильм");
        Poster third = new Poster(3, "Отель Белград", "комедия");
        Poster fourth = new Poster(4, "Джентельмены", "боевик");
        Poster fifth = new Poster(5, "Человек-неведимка", "ужасы");
        Poster sixth = new Poster(6, "Тролли", "мультфильм");
        Poster seventh = new Poster(7, "Номер один", "комедия");
        Poster eighth = new Poster(8,"Дюна", "фантастика");
        Poster ninth = new Poster(9,"Довод ", "боевик");
        Poster tenth = new Poster(10,"Дьявол в деталях", "триллер");
        Poster eleventh = new Poster(11,"Никто", "боевик");
        Poster twelve = new Poster(12,"Матрица", "фантастика");

        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);
        manager.addMovie(twelve);

        manager.getAllMovie();

        Poster[] actual = manager.getAllMovie();
        Poster[] expected = new Poster[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};


        assertArrayEquals(expected, actual);
    }

    @Test
    public void displayLastMoviesLessTen() {
        PosterManager manager = new PosterManager();

        Poster first = new Poster(1, "Бладшот", "боевик");
        Poster second = new Poster(2, "Вперед", "мультфильм");
        Poster third = new Poster(3, "Отель Белград", "комедия");
        Poster fourth = new Poster(4, "Джентельмены", "боевик");


        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);

        manager.getAllMovie();

        Poster[] actual = manager.getAllMovie();
        Poster[] expected = new Poster[]{fourth, third, second, first};


        assertArrayEquals(expected, actual);
    }

    @Test
    public void displayThreeMovies() {
        PosterManager manager = new PosterManager(3);

        Poster first = new Poster(1, "Бладшот", "боевик");
        Poster second = new Poster(2, "Вперед", "мультфильм");
        Poster third = new Poster(3, "Отель Белград", "комедия");
        Poster fourth = new Poster(4, "Джентельмены", "боевик");
        Poster fifth = new Poster(5, "Человек-неведимка", "ужасы");
        Poster sixth = new Poster(6, "Тролли", "мультфильм");
        Poster seventh = new Poster(7, "Номер один", "комедия");
        Poster eighth = new Poster(8,"Дюна", "фантастика");
        Poster ninth = new Poster(9,"Довод ", "боевик");
        Poster tenth = new Poster(10,"Дьявол в деталях", "триллер");
        Poster eleventh = new Poster(11,"Никто", "боевик");
        Poster twelve = new Poster(12,"Матрица", "фантастика");

        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);
        manager.addMovie(twelve);

        manager.getAllMovie();

        Poster[] actual = manager.getAllMovie();
        Poster[] expected = new Poster[]{twelve, eleventh, tenth};

        assertArrayEquals(expected, actual);
    }
}
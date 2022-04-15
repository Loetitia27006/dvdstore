package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class MovieController {

    @Autowired
  private  MovieServiceInterface movieService;



    public void addUsingConsole() {
        System.out.println("Quel est le titre du film ?");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        System.out.println("Quel est le genre du film ?");
        String genre = scanner.nextLine();

        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
    }

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }
}


package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.FileMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;

public class App {
    public static void main(String[] args) {
        FileMovieRepository movieRepository = new FileMovieRepository();
        DefaultMovieService defaultMovieService = new DefaultMovieService();

        //Injection du repository dans le service
        defaultMovieService.setMovieRepository(movieRepository);

        MovieController movieController = new MovieController();

        //Injection du service dans le controller
        movieController.setMovieService(defaultMovieService);
        movieController.addUsingConsole();
    }
}

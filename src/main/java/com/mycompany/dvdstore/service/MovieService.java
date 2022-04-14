package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;

public class MovieService {
    private GoLiveMovieRepository movieRepository;

    public void registerMovie(Movie movie) {
    movieRepository.add(movie);
    }

    public GoLiveMovieRepository getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(GoLiveMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
}

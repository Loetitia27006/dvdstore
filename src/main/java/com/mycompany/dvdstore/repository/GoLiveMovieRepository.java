package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;

public class GoLiveMovieRepository implements MovieRepositoryInterface{
    public void add(Movie movie) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("C:\\temp\\movies.txt", true);
            fileWriter.write(movie.getTitle() + ";" + movie.getGenre() + "\n");
            fileWriter.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Le film " + movie.getTitle() + " a été ajouté ");
    }
}

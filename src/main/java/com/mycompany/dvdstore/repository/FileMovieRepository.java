package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileMovieRepository implements MovieRepositoryInterface{
    private File file;

    public void add(Movie movie) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(movie.getTitle() + ";" + movie.getGenre() + "\n");
            fileWriter.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Le film " + movie.getTitle() + " a été ajouté ");
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}

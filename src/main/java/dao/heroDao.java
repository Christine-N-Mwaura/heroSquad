package dao;

import models.Individual_Hero;
import java.util.List;

public interface heroDao {
    //list
    List<Individual_Hero>getAll();

    //CREATE
    void add(Individual_Hero hero);

    //READ
    Individual_Hero findById(int id);

    //UPDATE
    void update(int id, String name,int Age);

    //DELETE
    void deleteById(int id);

    //DELETE ALL HEROES
    void clearAllHeroes();

}

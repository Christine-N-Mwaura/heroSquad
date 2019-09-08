package dao;

import models.Individual_Hero;
import org.sql2o.*;
import java.util.List;

;
public class Sql2oHeroDao implements heroDao{

    private final Sql2o sql2o;
    public Sql2oHeroDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public List<Individual_Hero> getAll() {
        return null;
    }

    @Override
    public void add(Individual_Hero hero) {
        String sql = "INSERT INTO heroes (name) VALUES (:name)";
        try(Connection conn = sql2o.open()){
            int id = (int) conn.createQuery(sql,true)
                    .bind(hero)
                    .executeUpdate()
                    .getKey();
            hero.setId(id);

        }catch (Sql2oException ex){
            System.out.println(ex);
        }

    }

    @Override
    public Individual_Hero findById(int id) {
        return null;
    }

    @Override
    public void update(int id, String name, int Age) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAllHeroes() {

    }



}

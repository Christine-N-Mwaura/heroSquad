package models;

import java.util.List;
import java.util.ArrayList;
public class Individual_Hero {

    private String mName;
    private int mAge;
    private String mSpecialPower;
    private String mWeakness;
    private int mId;
    private static List<Individual_Hero> heroes = new ArrayList<Individual_Hero>();



    public Individual_Hero(String name, int Age,String specialPower, String weakness) {
        mName = name;
        mAge = Age;
        mSpecialPower = specialPower;
        mWeakness = weakness;
        heroes.add(this);
        mId = heroes.size();
    }



    public String getName() {
        return mName;
    }

    public int getAge() {
        return mAge;
    }
    public String getSpecialPower() {
        return mSpecialPower;
    }

    public String getWeakness() {
        return mWeakness;
    }
    public int getId() {
        return mId;
    }
    public static List<Individual_Hero> all(){
        return heroes;
    }
    public static void clear(){
        heroes.clear();
    }
    public static Individual_Hero findById(int id) {
        return heroes.get(id - 1);
    }
}

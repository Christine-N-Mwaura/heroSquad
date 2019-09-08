package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String mSquadName;
    private int mMaxSize;
    private String mSquadCause;
    private static List<Squad> instances = new ArrayList<Squad>();
    private int mId;
//    private List<Hero>myHeroes;


    public Squad(String squadName, int maxSize, String squadCause) {
        this.mSquadName = squadName;
        this.mMaxSize = maxSize;
        this.mSquadCause = squadCause;
        instances.add(this);
        this.mId= instances.size();
    }

    public int getId() {
        return mId;
    }

    public String getSquadName() {
        return mSquadName;

    }

    public int getMaxSize() {
        return mMaxSize;
    }

    public String getSquadCause() {
        return mSquadCause;
    }

    public static Squad findById(int id){
        return instances.get(id - 1);
    }

    public static List <Squad> all(){
        return instances;
    }
    public static void clear(){
        instances.clear();
    }
}
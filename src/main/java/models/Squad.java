package models;

import java.util.Objects;

public class Squad {
    private String squadName;
    private int maxSize;
    private String squadCause;
    private int id;


    public Squad (String squadName, int maxSize, String squadCause){
      this.squadName = squadName;
      this.maxSize = maxSize;
      this.squadCause= squadCause;
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public void setSquadCause(String squadCause) {
        this.squadCause = squadCause;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getId() {
        return id;
    }

    public String getSquadCause() {
        return squadCause;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Squad)) return false;
        Squad mySquad = (Squad) o;
        return Objects.equals(maxSize,mySquad.maxSize)  &&
                Objects.equals(id,mySquad.id ) &&
                Objects.equals(squadName,mySquad.squadName)&&
                Objects.equals(squadCause,mySquad.squadCause);
    }
    @Override
    public  int hashCode() {
        return Objects.hash(squadName,maxSize,squadCause,id);
    }

}

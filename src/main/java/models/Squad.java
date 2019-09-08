package models;

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

}

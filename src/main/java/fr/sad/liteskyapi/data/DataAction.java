package fr.sad.liteskyapi.data;

public class DataAction {

    private String type, subType;
    private int goal;

    public DataAction(String type, int goal){
        this.type = type;
        this.goal = goal;
        this.subType = null;
    }

    public DataAction(String type, String subType, int goal){
        this(type, goal);
        this.subType = subType;
    }

    public int getGoal() {
        return goal;
    }

    public String getType() {
        return type;
    }

    public String getSubType() {
        return subType;
    }
}

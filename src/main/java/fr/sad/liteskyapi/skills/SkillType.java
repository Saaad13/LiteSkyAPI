package fr.sad.liteskyapi.skills;

import java.util.Arrays;

public enum  SkillType {

    HUNTER(0, "Hunter"),
    MINER(1, "Miner"),
    FARMER(2, "Farmer"),
    ;

    private final int id;
    private final String name;

    SkillType(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static SkillType getSkill(int id){
        return Arrays.stream(values()).filter(skillType -> skillType.getId() == id).findFirst().orElseThrow(() -> new NullPointerException("Undefined skill with id " + id));
    }
}

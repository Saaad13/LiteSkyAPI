package fr.sad.liteskyapi.skills;

import java.util.Set;

public class Skill {

    private int progression;
    private Set<SkillAction> skillActions;

    public Skill(int progression, Set<SkillAction> skillActions){
        this.progression = progression;
        this.skillActions = skillActions;
    }

    public int getProgression() {
        return progression;
    }

    public Set<SkillAction> getSkillActions() {
        return skillActions;
    }
}

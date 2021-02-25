package fr.sad.liteskyapi.skills;

import fr.sad.liteskyapi.data.DataAction;
import fr.sad.liteskyapi.data.DataReward;

public class SkillAction {

    private DataAction skillDataAction;
    private DataReward skillDataReward;

    public SkillAction(DataAction skillDataAction, DataReward skillDataReward) {
        this.skillDataAction = skillDataAction;
        this.skillDataReward = skillDataReward;
    }

    public DataAction getSkillDataAction() {
        return skillDataAction;
    }

    public DataReward getSkillDataReward() {
        return skillDataReward;
    }

}

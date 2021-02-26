package fr.sad.liteskyapi.npc.quests;

import fr.sad.liteskyapi.data.DataAction;
import fr.sad.liteskyapi.data.DataReward;

public class Quest {

    private DataAction dataAction;
    private DataReward dataReward;

    public Quest(DataAction dataAction, DataReward dataReward){
        this.dataAction = dataAction;
        this.dataReward = dataReward;
    }

    public DataAction getDataAction() {
        return dataAction;
    }

    public DataReward getDataReward() {
        return dataReward;
    }
}

package fr.sad.liteskyapi.npc;

import fr.sad.liteskyapi.npc.quests.Quest;
import net.citizensnpcs.api.npc.NPC;

public interface NPCQuest {

    int getId();

    NPC getNPC();

    Quest getQuest();

    int getTalkingReach();

    String[] getStartMessages();

    String[] getEndMessages();

}

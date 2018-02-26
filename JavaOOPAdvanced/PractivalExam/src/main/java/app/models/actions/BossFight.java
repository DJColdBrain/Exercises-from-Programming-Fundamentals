package app.models.actions;

import app.contracts.Action;
import app.contracts.Hero;
import app.contracts.Targetable;
import app.models.Config;
import app.models.participants.Boss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BossFight implements Action {

    private List<Targetable> people;

    @Override
    public String executeAction(List<Targetable> participants) {
        people = new ArrayList<>();
        for (Targetable participant : participants) {
            people.add(participant);
        }



        String error = "There should be at least 1 participant for boss fight!";

        StringBuilder sb = new StringBuilder();

        if (people.size() < 1){
            return error;
        }

        Targetable boss = null;
        if (people.get(0) instanceof Boss){
            boss = people.get(0);
        }
        people.remove(boss);
        if (boss == null){
            return "Invalid boss.";
        }

        List<Targetable> heroes = people;

        Targetable killer = null;

        while (boss.isAlive() && heroes.size() >= 1){
            for (Targetable hero : heroes) {
                if (!hero.isAlive()){
                    continue;
                }
                    hero.attack(boss);
                if (boss.isAlive()){
                   boss.attack(hero);
                }else{
                    killer = hero;
                    break;
                }
            }
        }

        for (int i = 0; i < people.size(); i++) {
            if (!people.get(i).isAlive()){
                people.remove(i);
                i--;
            }
        }

        if (boss.isAlive()){
            sb.append(String.format("Boss has slain them all!", System.lineSeparator()));
        }else{
            sb.append(String.format("Boss has been slain by: %s", System.lineSeparator()));
            heroes.remove(killer);
            killer.receiveReward(Config.BOSS_INDIVIDUAL_REWARD);
            Hero z = (Hero) killer;
            sb.append(String.format("  Name: %s | Class: %s\n" +
                            "  Health: %.2f | Damage: %.2f\n" +
                            "  %d STR | %d DEX | %d INT | %.2f Gold", z.getName(),
                    z.getClass().getSimpleName(),
                    z.getHealth(),z.getDamage(),
                    z.getStrength(), z.getDexterity(), z.getIntelligence(), z.getGold()));
            for (Targetable participant : heroes.stream().sorted( (a,b)-> a.getName().compareTo(b.getName())).collect(Collectors.toList())) {
                participant.receiveReward(Config.BOSS_INDIVIDUAL_REWARD);
                if (!participant.equals(killer)){
                    participant.levelUp();
                }
                Hero h = (Hero) participant;
                sb.append(String.format("\n  Name: %s | Class: %s\n" +
                        "  Health: %.2f | Damage: %.2f\n" +
                        "  %d STR | %d DEX | %d INT | %.2f Gold", h.getName(),
                        h.getClass().getSimpleName(),
                        h.getHealth(),h.getDamage(),
                        h.getStrength(), h.getDexterity(), h.getIntelligence(), h.getGold()));
            }
        }


        return sb.toString();
    }
}

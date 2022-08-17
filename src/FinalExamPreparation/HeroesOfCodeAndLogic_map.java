package FinalExamPreparation;

import java.util.*;


public class HeroesOfCodeAndLogic_map {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> heroHP = new TreeMap<>();
        Map<String, Integer> heroMP = new TreeMap<>();

        int numberOfHeroes = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfHeroes; i++) {
            String [] hero = scan.nextLine().split(" ");
            String heroName = hero[0];
            int HP = Integer.parseInt(hero[1]);;
            int MP = Integer.parseInt(hero[2]);
            if (HP<=100 && MP<=200){
            heroHP.put(heroName, HP);
            heroMP.put(heroName, MP);}
        }
        String input = scan.nextLine();
        while(!input.equals("End")){
            String [] command = input.split(" - ");
            String action = command[0];
            String heroName = command[1];

            if(action.equals("CastSpell")){
                int MPNeeded = Integer.parseInt(command[2]);
                String spellName = command[3];
                int MPCurrent= heroMP.get(heroName);
                if(MPNeeded <= MPCurrent){
                    int MPLeft = MPCurrent-MPNeeded;
                    heroMP.put(heroName,MPLeft);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, MPLeft);
                }else{
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }
            }else if(action.equals("TakeDamage")){
                int damage = Integer.parseInt(command[2]);
                String attacker = command[3];
                int HPCurrent = heroHP.get(heroName);
                int HPAfterAttack = HPCurrent - damage;
                if(HPAfterAttack>0){
                    heroHP.put(heroName, HPAfterAttack);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                            heroName, damage, attacker, HPAfterAttack );
                }else{
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    heroHP.remove(heroName);
                    heroMP.remove(heroName);
                }

            }else if(action.equals("Recharge")){
                int amountMP = Integer.parseInt(command[2]);
                int currentMP = heroMP.get(heroName);
                int rechargedMP = currentMP + amountMP;
                if(rechargedMP<200){
                    heroMP.put(heroName, rechargedMP);
                    System.out.printf("%s recharged for %d MP!%n", heroName, amountMP);
                }else{
                    rechargedMP = 200 - currentMP;
                    heroMP.put(heroName, 200);
                    System.out.printf("%s recharged for %s MP!%n", heroName, rechargedMP);
                }

            }else if(action.equals("Heal")){
                int amountHP = Integer.parseInt(command[2]);
                int currentHP = heroHP.get(heroName);
                int rechargedHP = amountHP+currentHP;
                if(rechargedHP<100){
                    heroHP.put(heroName, rechargedHP);
                    System.out.printf("%s healed for %d HP!%n", heroName, amountHP);
                }else{
                    int rechargedHPP = 100 - currentHP;
                    heroHP.put(heroName, 100);
                    System.out.printf("%s healed for %d HP!%n", heroName, rechargedHPP);
                }

                }
            input = scan.nextLine();
            }

        heroHP.entrySet().stream()
                .sorted((left, right)->right.getValue().compareTo(left.getValue())) //-------->sortirane po descending HP, s TreeMap sme sortirali imenata po azbuchen
                .forEach(hero -> {
                    System.out.println(hero.getKey()); //----> vzimame KEY ot Map heroHP
                    System.out.println("  HP: " + hero.getValue()); //------> vzimame VALUE ot map heroHP
                    System.out.println("  MP: " + heroMP.get(hero.getKey())); //---------> vzimame VALUE na KEY ot Map HeroMP
                });

        }

    }

/* Sorting by Key String and Value Integer - same map
Input:

4
Adela 90 150
SirMullich 70 40
Ivor 1 111
Tyris 94 61
Heal - SirMullich - 50
Recharge - Adela - 100
CastSpell - Tyris - 1000 - Fireball
TakeDamage - Tyris - 99 - Fireball
TakeDamage - Ivor - 3 - Mosquito
End

Output

SirMullich healed for 30 HP!
Adela recharged for 50 MP!
Tyris does not have enough MP to cast Fireball!
Tyris has been killed by Fireball!
Ivor has been killed by Mosquito!
SirMullich
  HP: 100
  MP: 40
Adela
  HP: 90
  MP: 200

*/

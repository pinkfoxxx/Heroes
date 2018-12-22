package com.company.Model;

import com.company.Model.Characters.GameCharacter;

import java.util.Scanner;

public class GameManager {

    private static GameCharacter c1;
    private static GameCharacter c2;

    public static void gameMenu(){
        Scanner scanner = new Scanner(System.in);
        String restart;
        do{
            startGame();
            do {
                System.out.println("\nRestart game? : "
                        + "\n1 - Yes"
                        + "\n2 - No");
                restart = scanner.nextLine();
            } while (!(restart.equals("1")||restart.equals("2")));
        } while(restart.equals("1"));
    }

    public static void startGame(){
        System.out.println("Game started :");

        c1 = CharacterFactory.pickHero();
        c2 = CharacterFactory.createCharacter();
        c2.setEnemy(true);

        fight(c1,c2);
    }

    public static void fight(GameCharacter c1, GameCharacter c2) {
         System.out.println("Your Hero -  " + c1);
         System.out.println("Enemy Hero  - " + c2);


         System.out.println("\nThe Fight started!!!");
         while (c1.isAlive() && c2.isAlive()) {

                 System.out.println("\n\n" + getName(c1) + " kick " + getName(c2) + " :");
                 c1.kick(c2);

             if (!c2.isAlive()||!c1.isAlive()) break;
                 System.out.println("\n\n" + getName(c2) + " kick " + getName(c1) + " :");
                 c2.kick(c1);

         }
             System.out.println("\nThe Fight is over!!!"
                     + "\n\nWinner - " + (c1.isAlive() ? getName(c1) : getName(c2)));

     }

   public static String getName(GameCharacter c){
        String tmp = c.getClass().getSimpleName() + "(" + c.getHp() + ")";
        return c.equals(c1) ? "Your " + tmp : "Enemy " + tmp;
    }
}

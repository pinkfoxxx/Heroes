package com.company.Model;

import com.company.Model.Characters.*;

import java.util.Scanner;

public class CharacterFactory {

    public static GameCharacter pickHero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1 - Pick hero from the list"
                        + "\n2 - Pick random hero");
        String menuNumber;
        do {
            menuNumber = scanner.next();
        } while (!(menuNumber.equals("1") || menuNumber.equals("2")));

        if(menuNumber.equals("1")) {
            System.out.println("1 - Hobbit"
                    + "\n2 - Elf"
                    + "\n3 - King"
                    + "\n4 - Knight");
            String heroNumber;
            do {
                heroNumber = scanner.next();
            } while (!(heroNumber.equals("1") || heroNumber.equals("2")
                    || heroNumber.equals("3") || heroNumber.equals("4")));

            return createCharacter(Integer.parseInt(heroNumber));
        } else {
            return createCharacter();
        }
    }

    //Random character
    static GameCharacter createCharacter(){
        int k = 1+(int) (Math.random() * 4);

        if(k==1) return new Hobbit();
        else if(k==2) return new Elf();
        else if(k==3) return new King();
        else if(k==4) return new Knight();

        return new GameCharacter();
    }

    //Non-Random character
    static GameCharacter createCharacter(int k){

        if(k==1) return new Hobbit();
        else if(k==2) return new Elf();
        else if(k==3) return new King();
        else if(k==4){
            return new Knight();
        }

        return new GameCharacter();
    }
}

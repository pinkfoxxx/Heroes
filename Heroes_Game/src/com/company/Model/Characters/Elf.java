package com.company.Model.Characters;


import com.company.Model.GameManager;


public class Elf extends GameCharacter {

    public Elf(){
        super.hp = 10;
        super.power=10;
    }

    @Override
    public void kick(GameCharacter c){

        int tmpHp = c.getHp();
        int tmpPower = c.getPower();

        if(power>c.getPower()){
            c.setHp(0);
            System.out.println(GameManager.getName(c) + ": -" + (tmpHp-c.getHp()) + "hp");
       } else {
            if (power != 0) {
                c.setPower(c.getPower() - 1);
                System.out.println(GameManager.getName(c) + ": -" + (tmpPower-c.getPower()) + "pw");
                System.out.println(c);
            } else {
                System.out.println("Oh no... I have no power....");
            }
        }

    }

    @Override
    public String toString() {
        return GameManager.getName(this) + "{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}

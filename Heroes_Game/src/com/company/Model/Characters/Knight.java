package com.company.Model.Characters;


import com.company.Model.GameManager;


public class Knight extends GameCharacter {

    public Knight(){
        super.hp = (int)(2+Math.random()*10);
        super.power=(int)(2+Math.random()*10);
    }

    @Override
    public void kick(GameCharacter c){

        int tmpHp = c.getHp();

        if(c.getHp()-power>0) {
            c.setHp(c.getHp() - power);
        } else {
            c.setHp(0);
        }

        System.out.println(GameManager.getName(c) + ": -" + (tmpHp-c.getHp()) + "hp");
    }

    @Override
    public String toString() {
        return "Knight{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}

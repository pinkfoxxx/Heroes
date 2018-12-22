package com.company.Model.Characters;

import com.company.Model.GameManager;

public class King extends GameCharacter {

    public King(){
        super.hp = (int)(5+Math.random()*10);
        super.power=(int)(5+Math.random()*10);
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
        return "King{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}

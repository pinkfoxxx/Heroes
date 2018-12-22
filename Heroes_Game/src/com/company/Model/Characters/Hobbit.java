package com.company.Model.Characters;

import com.company.Model.GameManager;


public class Hobbit extends GameCharacter {

    public Hobbit(){
        super.hp = 3;
        super.power=0;

    }

    @Override
    public void kick(GameCharacter c){
        String brokenPart="";
        if(hp==3) brokenPart = "I broke my arm...";
        if(hp==2) brokenPart = "I broke my neck...";
        if(hp==1) brokenPart = "I am dying...";

        System.out.println("Oh, God.... *crying* ... "+ brokenPart
                        + "f*cking " + c.getClass().getSimpleName());
        hp = hp-1;

        System.out.println(GameManager.getName(this) + " -1hp");
        System.out.println(GameManager.getName(c) + " -0hp");
    }

    @Override
    public String toString() {
        return "Hobbit{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}

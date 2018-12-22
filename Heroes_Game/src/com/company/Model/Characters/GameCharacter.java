package com.company.Model.Characters;

 public class GameCharacter {
    int power;
    int hp;
    boolean isEnemy=false;

     public int getPower() {
         return power;
     }

     public void setPower(int power) { this.power = power; }

     public int getHp() { return hp;}

     public void setHp(int hp) {
         this.hp = hp;
     }

     public boolean isEnemy() { return isEnemy;}

     public void setEnemy(boolean enemy) {
         isEnemy = enemy;
     }

     public void kick(GameCharacter c){}

     public boolean isAlive() {
        return hp > 0;
    }

}

package com.company;
public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(250);
        boss.setDamage(70);
        boss.setWeapon(new Weapon("Easel grenade launchers","AGS-17"));
        System.out.println("Жизнь" + boss.getHealth() +  " " + " Урон" + boss.getDamage() + "Тип оружия " +   boss.weapon.getName()  + " " +  "название " +
                boss.weapon.getTybe());
    }
}
package com.sippar.pattern.behavioral.templateMethod;

public class App {
    public static void main(String[] args) {
        AerialAttack aerialAttack = new AerialAttack();
        aerialAttack.setEnemyHasAlliances(true);
        aerialAttack.setEnemyNuclear(true);
        aerialAttack.templateMethod();
        System.out.println("\nGot more troops");
        aerialAttack.setTroops(200);
        aerialAttack.templateMethod();
        System.out.println("\nTerrestrial incoming");
        TerrestrialAtack terrestrialAtack = new TerrestrialAtack();
        terrestrialAtack.setEnemyHasAlliances(true);
        terrestrialAtack.setEnemyNuclear(true);
        terrestrialAtack.templateMethod();
        System.out.println("\nEnemy lost alliance");
        terrestrialAtack.setEnemyHasAlliances(false);
        terrestrialAtack.templateMethod();
    }
}

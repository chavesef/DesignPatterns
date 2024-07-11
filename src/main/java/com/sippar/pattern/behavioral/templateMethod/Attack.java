package com.sippar.pattern.behavioral.templateMethod;

public abstract class Attack {
    private double damage;
    private int troops;
    private boolean enemyNuclear;
    private boolean enemyHasAlliances;

    public void templateMethod(){
        System.out.println("Attacking " + this.getClass().getSimpleName());
        gatherTroops();
        if(verifyEnemyCondition()){
            if (this instanceof AerialAttack && this.getTroops() > 300){
                performAttack();
            }
            else{
                retreat();
            }
        }else {
            if (this instanceof TerrestrialAtack && this.getTroops()>1500){
                performAttack();
            }else if (this instanceof TerrestrialAtack && this.getTroops()<=1000){
                retreat();
            }else if (this instanceof AerialAttack){
                performAttack();
            }
        }

    }

    public abstract void gatherTroops();
    public abstract boolean verifyEnemyCondition();

    public void performAttack(){
        System.out.println("Performing attack with " + this.getTroops() + " troops");
    }
    public void retreat(){
        System.out.println("Run, Forrest, run!!");
    }

    public double trainTroops(){
        damage += 10;
        return damage;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getTroops() {
        return troops;
    }

    public void setTroops(int troops) {
        this.troops = troops;
    }

    public boolean isEnemyNuclear() {
        return enemyNuclear;
    }

    public void setEnemyNuclear(boolean enemyNuclear) {
        this.enemyNuclear = enemyNuclear;
    }

    public boolean hasEnemyAlliances() {
        return enemyHasAlliances;
    }

    public void setEnemyHasAlliances(boolean enemyHasAlliances) {
        this.enemyHasAlliances = enemyHasAlliances;
    }
}

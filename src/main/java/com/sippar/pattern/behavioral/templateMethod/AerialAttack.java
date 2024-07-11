package com.sippar.pattern.behavioral.templateMethod;

public class AerialAttack extends Attack{

    @Override
    public void gatherTroops() {
        int troops = getTroops();
        setTroops(troops+250);
    }

    @Override
    public boolean verifyEnemyCondition() {
        return isEnemyNuclear() || hasEnemyAlliances();
    }
}

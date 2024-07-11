package com.sippar.pattern.behavioral.templateMethod;

public class TerrestrialAtack extends Attack{

    @Override
    public void gatherTroops() {
        int troops = getTroops();
        setTroops(troops+1000);
    }

    @Override
    public boolean verifyEnemyCondition() {
        return isEnemyNuclear() && hasEnemyAlliances();
    }
}

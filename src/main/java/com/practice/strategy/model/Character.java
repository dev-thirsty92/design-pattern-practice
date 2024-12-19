package com.practice.strategy.model;

import com.practice.strategy.behavior.WeaponBehavior;

public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public Weapon fight (){
        if(weaponBehavior == null){
            return null;
        }
        return weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

}

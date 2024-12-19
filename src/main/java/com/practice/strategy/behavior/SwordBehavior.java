package com.practice.strategy.behavior;

import com.practice.strategy.model.Weapon;

public class SwordBehavior implements WeaponBehavior{

    @Override
    public Weapon useWeapon() {
        return Weapon.SWORD;
    }

}

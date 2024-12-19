package com.practice.strategy.behavior;

import com.practice.strategy.model.Weapon;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public Weapon useWeapon() {
        return Weapon.KNIFE;
    }

}

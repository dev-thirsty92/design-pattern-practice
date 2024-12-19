package com.practice.strategy.behavior;

import com.practice.strategy.model.Weapon;

public class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public Weapon useWeapon() {
        return Weapon.BOW_AND_ARROW;
    }

}

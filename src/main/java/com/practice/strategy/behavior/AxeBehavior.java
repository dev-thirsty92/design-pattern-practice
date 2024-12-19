package com.practice.strategy.behavior;

import com.practice.strategy.model.Weapon;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public Weapon useWeapon() {
        return Weapon.AXE;
    }

}

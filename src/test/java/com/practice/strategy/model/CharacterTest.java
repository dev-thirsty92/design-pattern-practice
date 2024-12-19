package com.practice.strategy.model;

import com.practice.strategy.behavior.AxeBehavior;
import com.practice.strategy.behavior.KnifeBehavior;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class CharacterTest {

    @Test
    @DisplayName("WeaponBehavior 설정을 하지 않고 싸우면 null 반환한다.")
    void king_test() {
        King king = new King();
        assertNull(king.fight());
    }

    @Test
    @DisplayName("KnifeBehavior 설정을 하면 싸우면 KNIFE 반환한다.")
    void king_set_weapon() {
        King king = new King();
        king.setWeaponBehavior(new KnifeBehavior());
        assertEquals(Weapon.KNIFE, king.fight());
    }

    @Test
    @DisplayName("WeaponBehavior는 동적으로 설정이 가능하다.")
    void king_switch_weapon() {
        King king = new King();
        king.setWeaponBehavior(new KnifeBehavior());
        log.info("{}", king.fight());

        king.setWeaponBehavior(new AxeBehavior());
        assertEquals(Weapon.AXE, king.fight());
    }
}
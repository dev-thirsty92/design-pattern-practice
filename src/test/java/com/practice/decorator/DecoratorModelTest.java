package com.practice.decorator;

import com.practice.decorator.model.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorModelTest {

    @Test
    void DarkRoastTest() {
        Beverage darkRoast = new DarkRoast();
        assertEquals("darkRoast", darkRoast.getDescription());
        assertEquals(0.99, darkRoast.cost());
    }

    @Test
    void HouseBlendTest() {
        Beverage houseBlend = new HouseBlend();
        assertEquals("houseBlend", houseBlend.getDescription());
        assertEquals(0.89, houseBlend.cost());
    }

    @Test
    void DecafTest() {
        Beverage decaf = new Decaf();
        assertEquals("decaf", decaf.getDescription());
        assertEquals(1.05, decaf.cost());
    }

    @Test
    void EspressoTest() {
        Beverage espresso = new Espresso();
        assertEquals("espresso", espresso.getDescription());
        assertEquals(1.99, espresso.cost());
    }


    @Test
    @DisplayName("우유를 추가해본다")
    void addCondimentTest1() {
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);

        assertEquals("darkRoast" + ", milk", beverage.getDescription());
        assertEquals(0.99 + 0.10, beverage.cost());
    }

    @Test
    @DisplayName("다크로스트에 모카 2샷 + 휘핑크림 1 추가")
    void addCondimentTest2() {
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);
        beverage = new Whip(beverage);

        assertEquals("darkRoast" + ", milk" + ", milk" + ", whip", beverage.getDescription());
        assertEquals(0.99 + 0.10 + 0.10 + 0.10, beverage.cost());
    }

   @Test
    @DisplayName("하우스블렌드에 두유1, 모카1, 휘핑크림1 추가")
    void addCondimentTest3() {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        assertEquals("houseBlend" + ", soy" + ", mocha" + ", whip", beverage.getDescription());
        assertEquals(0.89 + 0.15 + 0.20 + 0.10, beverage.cost());
    }


}

package ru.itmo;
import pokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Deino p1 = new Deino("Дейно", 1);
        Zapdos p2 = new Zapdos("Зап-Зап", 1);
        Glaceon p3 = new Glaceon("Глас", 1);
        Zweilous p4 = new Zweilous("Звей", 1);
        Eevee p5 = new Eevee("Киви", 1);
        Hydreigon p6 = new Hydreigon("Хидро", 1);
        b.addAlly(p6);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p1);
        b.go();
    }
}
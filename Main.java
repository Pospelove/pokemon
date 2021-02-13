package lab2;

import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] arguments) {
        Battle b = new Battle();
        b.addAlly(new Kecleon("Arseniy", 1));
        b.addAlly(new Rufflet("Polina", 2));
        b.addAlly(new Valejski("Pavel", 3));
        b.addFoe(new Sewaddle("Lenya", 1));
        b.addFoe(new Swadloon("Dilara", 2));
        b.addFoe(new Leavanny("Tonya", 3));
        b.go();
    }
}
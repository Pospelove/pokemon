/*
javac -cp Pokemon.jar *.java
jar cfm MyJar.jar Manifest.txt *.class
java -jar MyJar.jar
*/

import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] arguments) {
        Battle b = new Battle();
        b.addAlly(new Azumarill("Arseniy", 1));
        b.addAlly(new Marill("Polina", 2));
        b.addAlly(new Baltoy("Pavel", 3));
        b.addFoe(new Victini("Lenya", 1));
        b.addFoe(new Azurill("Dilara", 2));
        b.addFoe(new Claydol("Tonya", 3));
        b.go();
    }
}

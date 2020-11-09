import ru.ifmo.se.pokemon.*;

public class Baltoy extends Pokemon {
    public Baltoy(String name, int level) {
        super(name, level);
        addMove(new Moves.Psybeam());
        addMove(new Moves.DazzlingGleam());
        addMove(new Moves.Bulldoze());
    }
}

import ru.ifmo.se.pokemon.*;

public class Claydol extends Pokemon {
    public Claydol(String name, int level) {
        super(name, level);
        addMove(new Moves.Psybeam());
        addMove(new Moves.DazzlingGleam());
        addMove(new Moves.Bulldoze());
        addMove(new Moves.StoneEdge());
    }
}

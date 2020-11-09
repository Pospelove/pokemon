import ru.ifmo.se.pokemon.*;

public class Azurill extends Pokemon {
    public Azurill(String name, int level) {
        super(name, level);
        addMove(new Moves.WorkUp());
        addMove(new Moves.IceBeam());
    }
}

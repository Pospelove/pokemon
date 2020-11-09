import ru.ifmo.se.pokemon.*;

public class Azumarill extends Pokemon {
    public Azumarill(String name, int level) {
        super(name, level);
        addMove(new Moves.WorkUp());
        addMove(new Moves.IceBeam());
        addMove(new Moves.MuddyWater());
        addMove(new Moves.Confide());
    }
}

import ru.ifmo.se.pokemon.*;

public class Marill extends Pokemon {
    public Marill(String name, int level) {
        super(name, level);
        addMove(new Moves.WorkUp());
        addMove(new Moves.IceBeam());
        addMove(new Moves.MuddyWater());
    }
}

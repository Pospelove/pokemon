import ru.ifmo.se.pokemon.*;

public class Victini extends Pokemon {
    public Victini(String name, int level) {
        super(name, level);
        addMove(new Moves.FocusBlast());
        addMove(new Moves.WildCharge(this));
        addMove(new Moves.EnergyBall());
        addMove(new Moves.Overheat());
    }
}

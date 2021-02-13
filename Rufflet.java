package lab2;

import ru.ifmo.se.pokemon.*;

public class Rufflet extends Valejski  {
    public Rufflet(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setMove(new SteelWing(), new AirSlash(), new Slash());
        setStats(85, 115, 80, 105, 80, 50);
    }
     class Slash extends PhysicalMove {
        public Slash() {
            super(Type.NORMAL, 70, 100);
        }

        protected void applyOppEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.SPECIAL_DEFENSE, -1));
        }

        protected String describe() {
            return "применяет Slash";
        }
    }
}

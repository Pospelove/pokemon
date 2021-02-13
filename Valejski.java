import ru.ifmo.se.pokemon.*;

public class Valejski extends Pokemon {
    public Valejski(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setMove(new SteelWing(), new AirSlash());
        setStats(85, 115, 80, 105, 80, 50);
    }
    class SteelWing extends PhysicalMove {
        public SteelWing() {
            super(Type.STEEL, 70, 90);
        }

        protected void applyOppEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.SPECIAL_DEFENSE, -1));
        }

        protected String describe() {
            return "применяет SteelWing";
        }
    }
    class AirSlash extends SpecialMove {
        public  AirSlash() {
            super(Type.FLYING, 75, 95);
        }

        protected String describe() {
            return "применяет AirSlash";
        }
    }

}

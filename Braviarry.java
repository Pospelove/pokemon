import ru.ifmo.se.pokemon.*;

public class Braviarry extends Rufflet {
    public Braviarry(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setMove(new SteelWing(), new AirSlash(), new Slash(), new Superpower());
        setStats(85, 115, 80, 105, 80, 50);
    }
     class Superpower extends PhysicalMove {
        public Superpower() {
            super(Type.FIGHTING, 120, 100);
        }

        protected void applyOppEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().turns(-1).stat(Stat.SPECIAL_DEFENSE, -1));
        }

        protected String describe() {
            return "применяет Superpower";
        }
    }

    }


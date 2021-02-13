import ru.ifmo.se.pokemon.*;

public class Leavanny extends Swadloon {
    public Leavanny(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setMove(new Rest(), new Confide(), new GrassWhistle(), new Tackle());
        setStats(85, 115, 80, 105, 80, 50);
    }

     class Tackle extends PhysicalMove {
        public Tackle() {
            super(Type.GROUND, 40, 100);
        }

        protected void applyOppEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.SPEED, -1));
        }

        protected String describe() {
            return "применяет Tackle";
        }
    }

}

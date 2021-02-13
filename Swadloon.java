import ru.ifmo.se.pokemon.*;

public class Swadloon extends Sewaddle {
    public Swadloon(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setMove(new Rest(), new Confide(), new GrassWhistle());
        setStats(85, 115, 80, 105, 80, 50);
    }

    class GrassWhistle extends StatusMove {
        public GrassWhistle() {
            super(Type.GRASS, 0, 55);
        }

        protected void applyOppEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().turns(-1).stat(Stat.SPECIAL_ATTACK, -1));
        }

        protected String describe() {
            return "применяет GrassWhistle";
        }
    }
}
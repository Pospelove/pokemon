import ru.ifmo.se.pokemon.*;

public class Kecleon extends Pokemon {
    public Kecleon(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setMove(new NastyPlot(), new ShadowBall(), new Facade(), new Screech());
        setStats(85, 115, 80, 105, 80, 50);

    }
     class NastyPlot extends StatusMove {
        public NastyPlot() {
            super(Type.DARK, 0, 0);
        }

        protected void applySelfEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().turns(-1).stat(Stat.ATTACK, 1));
            pokemon.addEffect(new Effect().turns(-1).stat(Stat.SPECIAL_ATTACK, 1));
        }

        protected String describe() {
            return "применяет NastyPlot";
        }
    }

     class ShadowBall extends SpecialMove {
        public ShadowBall() {
            super(Type.GHOST, 80, 100);
        }

        protected void applyOppEffects(Pokemon pokemon) {
            if (Math.random() < 0.1) {
                Effect.confuse(pokemon);
            }
        }

        protected String describe() {
            return "применяет ShadowBall";
        }
    }
     class Facade extends PhysicalMove {
        public Facade() {
            super(Type.NORMAL, 70, 100);
        }

        protected void applyOppEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.SPEED, -1));
        }

        protected String describe() {
            return "применяет Facade";
        }
    }
     class Screech extends StatusMove {
        public Screech() {
            super(Type.NORMAL, 0, 85);
        }

        protected void applyOppEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().turns(-1).stat(Stat.SPECIAL_ATTACK, -1));
        }

        protected String describe() {
            return "применяет Screech";
        }
    }
}

package lab2;

import ru.ifmo.se.pokemon.*;

public class Sewaddle extends Pokemon {
    public Sewaddle(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setMove(new Rest(), new Confide());
        setStats(85,115,80, 105, 80, 50);
    }
     class Rest extends StatusMove {
        public Rest() {
            super(Type.PSYCHIC, 0, 0);
        }

        protected void applyOppEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().turns(-1).stat(Stat.SPECIAL_ATTACK, -1));
        }

        protected String describe() {
            return "применяет Rest";
        }
    }
    class Confide extends StatusMove {
        public Confide() {
            super(Type.NORMAL, 0, 0);
        }

        protected void applyOppEffects(Pokemon pokemon) {
            pokemon.addEffect(new Effect().turns(-1).stat(Stat.SPECIAL_ATTACK, -1));
        }

        protected String describe() {
            return "применяет Confide";
        }
    }





}
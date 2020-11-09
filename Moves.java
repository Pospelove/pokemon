import ru.ifmo.se.pokemon.*;

public class Moves {
  public static class Psybeam extends SpecialMove {
      public Psybeam() {
          super(Type.PSYCHIC, 65, 100);
      }

      protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1) {
          Effect.confuse(pokemon);
        }
      }

      protected String describe() {
          return "применяет Psybeam";
      }
  }

  public static class DazzlingGleam extends SpecialMove {
      public  DazzlingGleam() {
          super(Type.FAIRY, 80, 100);
      }

      protected String describe() {
          return "применяет DazzlingGleam";
      }
  }

  public static class Bulldoze extends PhysicalMove {
      public Bulldoze() {
          super(Type.GROUND, 90, 100);
      }

      protected void applyOppEffects(Pokemon pokemon) {
          pokemon.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.SPEED, -1));
      }

      protected String describe() {
          return "применяет Bulldoze";
      }
  }

  public static class FocusBlast extends SpecialMove {
      public FocusBlast() {
          super(Type.FIGHTING, 120, 70);
      }

      protected void applyOppEffects(Pokemon pokemon) {
          pokemon.addEffect(new Effect().turns(-1).stat(Stat.SPECIAL_DEFENSE, -1));
      }

      protected String describe() {
          return "применяет FocusBlast";
      }
  }

  public static class WildCharge extends PhysicalMove {
      public WildCharge(Pokemon owner) {
          super(Type.ELECTRIC, 90, 100);
          this.owner = owner;
      }

      protected String describe() {
          return "применяет WildCharge";
      }

      protected void applyOppDamage(Pokemon def, double damage) {
          super.applyOppDamage(def, damage);
          super.applySelfDamage(this.owner, damage * 0.25);
      }

      private Pokemon owner;
  }

  public static class EnergyBall extends PhysicalMove {
      public EnergyBall() {
          super(Type.GRASS, 90, 100);
      }

      protected void applyOppEffects(Pokemon pokemon) {
          pokemon.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.SPECIAL_DEFENSE, -1));
      }

      protected String describe() {
          return "применяет EnergyBall";
      }
  }

  public static class Overheat extends SpecialMove {
      public Overheat() {
          super(Type.FIRE, 130, 90);
      }

      protected void applySelfEffects(Pokemon pokemon) {
          pokemon.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.SPECIAL_ATTACK, -2));
      }

      protected String describe() {
          return "применяет Overheat";
      }
  }

  public static class StoneEdge extends PhysicalMove {
      public StoneEdge() {
          super(Type.ROCK, 100, 80);
      }

      protected void applyOppEffects(Pokemon pokemon) {
          pokemon.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.SPEED, -1));
      }

      protected double calcCriticalHit(Pokemon att, Pokemon def) {
        double criticalHitDamage = super.calcCriticalHit(att, def);
        if (criticalHitDamage > 1) {
          criticalHitDamage *= 4;
        }
        return criticalHitDamage;
      }

      protected String describe() {
          return "применяет StoneEdge";
      }
  }

  public static class WorkUp extends StatusMove {
      public WorkUp() {
          super(Type.NORMAL, 0, 0);
      }

      protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().turns(-1).stat(Stat.ATTACK, 1));
        pokemon.addEffect(new Effect().turns(-1).stat(Stat.SPECIAL_ATTACK, 1));
      }

      protected String describe() {
          return "применяет WorkUp";
      }
  }

  public static class IceBeam extends SpecialMove {
      public IceBeam() {
          super(Type.ICE, 90, 100);
      }

      protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1) {
          Effect.freeze(pokemon);
        }
      }

      protected String describe() {
          return "применяет IceBeam";
      }
  }

  public static class MuddyWater extends SpecialMove {
      public MuddyWater() {
          super(Type.FIRE, 90, 85);
      }

      protected void applyOppEffects(Pokemon pokemon) {
          pokemon.addEffect(new Effect().chance(0.3).turns(-1).stat(Stat.ACCURACY, -1));
      }

      protected String describe() {
          return "применяет MuddyWater";
      }
  }

  public static class Confide extends StatusMove {
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

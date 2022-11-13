package moves.zapdos;

import ru.ifmo.se.pokemon.*;

public class ThunderShock extends SpecialMove {
    public ThunderShock(double power, double acc) {
        super(Type.ELECTRIC, power, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.1).condition(Status.PARALYZE);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}

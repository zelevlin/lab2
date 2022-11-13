package moves.zapdos;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(double power, double acc) {
        super(Type.ELECTRIC, power, acc);

    }


    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect e = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, +1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}

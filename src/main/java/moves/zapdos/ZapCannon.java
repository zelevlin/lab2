package moves.zapdos;

import ru.ifmo.se.pokemon.*;

public class ZapCannon extends SpecialMove {
    public ZapCannon(double power, double acc) {
        super(Type.ELECTRIC, power, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().condition(Status.PARALYZE);
        p.addEffect(e);
        if(p.getCondition() == Status.PARALYZE){
            Effect d = new Effect().attack(0.75).stat(Stat.SPEED, -(int) (p.getStat(Stat.SPEED)/2));
            p.addEffect(d);
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}

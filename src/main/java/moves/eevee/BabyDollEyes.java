package moves.eevee;

import ru.ifmo.se.pokemon.*;

public class BabyDollEyes extends StatusMove {
    public BabyDollEyes(double power, double acc) {
        super(Type.FAIRY, power, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.ATTACK, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}

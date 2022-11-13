package moves.deino;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(double power, double acc) {
        super(Type.PSYCHIC, power, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().turns(2).condition(Status.SLEEP).stat(Stat.HP,52);
        p.setCondition(e);

    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}

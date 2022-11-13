package moves.eevee;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(double power, double acc) {
        super(Type.NORMAL, power, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        if(p.getCondition()== Status.BURN ||p.getCondition()== Status.POISON
        ||p.getCondition()== Status.PARALYZE){
            Effect e = new Effect().stat(Stat.ATTACK,+70);
            p.addEffect(e);
        }
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}

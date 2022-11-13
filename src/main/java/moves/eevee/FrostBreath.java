package moves.eevee;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FrostBreath extends SpecialMove {
    public FrostBreath(double power, double acc) {
        super(Type.ICE, power, acc);

    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 90d/60d;
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}

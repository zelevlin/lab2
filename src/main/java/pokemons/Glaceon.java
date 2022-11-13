package pokemons;

import moves.eevee.FrostBreath;
import ru.ifmo.se.pokemon.Type;

public class Glaceon extends Eevee{

    public Glaceon(String name, int level) {
        super(name, level);

        super.setType(Type.ICE);
        super.setStats(65,60,110,130,95,65);

        FrostBreath frostBreath = new FrostBreath(60,90);
        super.addMove(frostBreath);
    }
}

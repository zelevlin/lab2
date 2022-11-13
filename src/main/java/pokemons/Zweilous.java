package pokemons;

import moves.deino.DoubleHit;

public class Zweilous extends Deino{

    public Zweilous(String name, int level) {
        super(name, level);
        super.setStats(72,85,70,65,70,58);

        DoubleHit doubleHit = new DoubleHit(35,90);
        super.addMove(doubleHit);

    }
}

package pokemons;

import moves.deino.Headbutt;

public class Hydreigon extends Zweilous{

    public Hydreigon(String name, int level) {
        super(name, level);

        super.setStats(92,105,90,125,90,98);

        Headbutt headbutt = new Headbutt(70, 100);
        super.addMove(headbutt);
    }
}

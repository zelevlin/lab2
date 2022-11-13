package pokemons;

import moves.eevee.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eevee extends Pokemon {
    public Eevee(String name, int level){
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(55,55,50,45,65,55);

        QuickAttack quickAttack= new QuickAttack(40, 100);
        Facade facade = new Facade(70,100);
        BabyDollEyes babyDollEyes = new BabyDollEyes(0, 100);
        super.setMove(quickAttack, facade);
    }
}

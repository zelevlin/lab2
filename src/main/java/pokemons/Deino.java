package pokemons;

import moves.deino.Rest;
import moves.deino.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Deino extends Pokemon {
    public Deino(String name, int level){
        super(name, level);

        super.setType(Type.DARK, Type.DRAGON);
        super.setStats(52,65,50,45,50,38);
        Swagger swagger = new Swagger(0,85);
        Rest rest = new Rest(0,100);
        super.setMove(swagger,rest);
    }
}

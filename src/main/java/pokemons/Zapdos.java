package pokemons;

import moves.zapdos.ChargeBeam;
import moves.zapdos.Swagger;
import moves.zapdos.ThunderShock;
import moves.zapdos.ZapCannon;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zapdos extends Pokemon {
    public Zapdos(String name, int level){
        super(name,level);

        super.setType(Type.ELECTRIC, Type.FLYING);
        super.setStats(90, 90, 85, 125, 90, 100);

        ChargeBeam chargeBeam = new ChargeBeam(50, 90);
        ZapCannon zapCannon = new ZapCannon(120, 50);
        ThunderShock thunderShock = new ThunderShock(40, 100);
        Swagger swagger = new Swagger(0,85);
        super.setMove(chargeBeam, zapCannon, thunderShock, swagger);
    }
}

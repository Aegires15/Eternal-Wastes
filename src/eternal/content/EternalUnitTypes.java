package eternal.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.entities.units.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

public class EternalUnitTypes{
  public static UnitType frame;
  public static void load(){
    frame = new TankUnitType("frame"){{
      constructor = TankUnit::create;
      speed = 2;
      hitSize = 9f;
      hovering = false;
        health = 180;
        weapons.add(new Weapon("eternal-wastes-frame-weapon"){{
        reload = 55f;
          mirror = false;
          x = 0f;
          y = 0f;
          rotate = true;
          shootSound = Sounds.shootAltLong;
          bullet = new MissileBulletType(2.5f, 30){{
            width = 8f;
              height = 11f;
            speed = 1.65f;
            lifetime = 80f;
            trailColor = Pal.unitBack;
          }};
        }});
    }};
    theta = new ErekirUnitType("theta"){{
      constructor = FlyingUnit::create;
      speed = 4;
      hitSize = 9f;
      flying = true;
        health = 250;
        weapons.add(new Weapon("none"){{
        reload = 60f;
          mirror = false;
          x = 0f;
          y = 0f;
          rotate = true;
          shootSound = Sounds.shootAltLong;
          bullet = new BasicBulletType(2.5f, 30){{
            width = 8f;
              height = 11f;
            buildingDamageMultiplier = 0.01f;
            speed = 1.65f;
            lifetime = 80f;
            trailColor = Pal.unitBack;
          }};
        }});
    }};
  }
}

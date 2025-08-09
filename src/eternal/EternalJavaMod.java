package eternal;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import eternal.content.*;

public class EternalJavaMod extends Mod{

    public EternalJavaMod(){
    }

    @Override
    public void loadContent(){
        EternalUnitTypes.load();
        EternalPlanets.load();
    }

}

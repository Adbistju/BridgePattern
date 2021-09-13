package adbistju.system.models;

import adbistju.system.models.basemodels.Organism;

public class Cyborg extends Organism {
    public Cyborg(String name) {
        super.name = name;
        super.isSatiety = false;
        super.isSleep = false;
    }
}

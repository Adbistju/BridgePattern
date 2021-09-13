package adbistju.system.models;

import adbistju.system.models.basemodels.Organism;

public class Cat extends Organism {

    public Cat(String name) {
        super.name = name;
        super.isSatiety = false;
        super.isSleep = false;
    }
}

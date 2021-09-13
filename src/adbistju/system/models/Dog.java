package adbistju.system.models;

import adbistju.system.models.basemodels.Organism;

public class Dog extends Organism {

    public Dog(String name) {
        super.name = name;
        super.isSatiety = false;
        super.isSleep = false;
    }
}


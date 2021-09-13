package adbistju.system;

import adbistju.system.models.Cat;
import adbistju.system.models.Cyborg;
import adbistju.system.models.Dog;
import adbistju.system.models.commands.NervousSystem;
import adbistju.system.models.commands.SuperNervousSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        Cat cat = new Cat("MEOW");
        NervousSystem catComander = new NervousSystem(cat);
        catComander.jump();
        catComander.run();
        catComander.goToSleep();
        catComander.wakeUp();
        catComander.toEat();
        catComander.toEat();

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        Cyborg cyborg = new Cyborg("Klark");
        SuperNervousSystem cyborgNervous = new SuperNervousSystem(cyborg);
        cyborgNervous.jump();
        cyborgNervous.toEat();
        cyborgNervous.xRayVision();
        System.out.println("---------------------------------------------");

        Dog dog = new Dog("ball");
        SuperNervousSystem dogNervousSystem = new SuperNervousSystem(dog);
        dogNervousSystem.xRayVision();
        dogNervousSystem.talk();

    }
}

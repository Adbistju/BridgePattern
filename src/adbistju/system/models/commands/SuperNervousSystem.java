package adbistju.system.models.commands;

import adbistju.system.models.basemodels.Organism;

public class SuperNervousSystem extends NervousSystem implements SuperCommander{
    Organism organism;

    public SuperNervousSystem(Organism organism) {
        super(organism);
        this.organism = organism;
    }

    @Override
    public void jump() {
        System.out.println(organism.getName() + " is " + "super jump");
    }

    @Override
    public void run() {
        System.out.println(organism.getName() + " is " + "super run");
    }

    @Override
    public void walk() {
        System.out.println(organism.getName() + " is " + "super walk");
    }

    @Override
    public void talk() {
        System.out.println(organism.getName() + " is " + "talk");
    }


    @Override
    public boolean goToSleep() {
        if (!organism.isSleep()){
            organism.setSleep(true);
            System.out.println(organism.getName() + " is off ");
        } else {
            System.out.println("reboot");
        }
        return organism.isSleep();
    }

    @Override
    public boolean wakeUp() {
        if (organism.isSleep()){
            organism.setSleep(false);
            System.out.println(organism.getName() + " is onn ");
        } else {
            System.out.println("reboot");
        }
        return organism.isSleep();
    }

    @Override
    public boolean toEat() {
        if(!organism.isSatiety()){
            System.out.println(organism.getName() + " charging batteries");
            organism.setSatiety(true);
        } else {
            System.out.println(organism.getName() + " cyborg charging batteries");
        }
        return true;
    }

    public Organism getOrganism() {
        return organism;
    }

    @Override
    public void xRayVision() {
        System.out.println(organism.getName()+ " is " + "x-ray vision");
        organism.setSatiety(false);
    }

    @Override
    public void hideAway() {
        System.out.println(organism.getName()+ " is " + "hide away");
        organism.setSatiety(false);
    }
}

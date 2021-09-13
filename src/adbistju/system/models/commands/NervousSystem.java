package adbistju.system.models.commands;

import adbistju.system.models.basemodels.Organism;

public class NervousSystem implements Commander{
    Organism organism;

    public NervousSystem(Organism organism) {
        this.organism = organism;
    }

    @Override
    public void jump() {
        System.out.println(organism.getName() + " is " + "jump");
        organism.setSatiety(false);
    }

    @Override
    public void run() {
        System.out.println(organism.getName() + " is " + "run");
        organism.setSatiety(false);
    }

    @Override
    public void walk() {
        System.out.println(organism.getName() + " is " + "walk");
        organism.setSatiety(false);
    }

    @Override
    public void talk() {
        System.out.println(organism.getName() + " is " + "talk");
    }


    @Override
    public boolean goToSleep() {
        if (!organism.isSleep()){
            organism.setSleep(true);
            System.out.println(organism.getName() + " is sleep ");
        } else {
            System.out.println("I `am already sleep");
        }
        return organism.isSleep();
    }

    @Override
    public boolean wakeUp() {
        if (organism.isSleep()){
            organism.setSleep(false);
            System.out.println(organism.getName() + " is wake up ");
        } else {
            System.out.println("I don't sleep anymore");
        }
        return organism.isSleep();
    }

    @Override
    public boolean toEat() {
        if(!organism.isSatiety()){
            System.out.println(organism.getName() + " is " + "eat");
            organism.setSatiety(true);
        } else {
            System.out.println(organism.getName() + " don`t want to " + "eat");
        }
        return true;
    }

    public Organism getOrganism() {
        return organism;
    }
}

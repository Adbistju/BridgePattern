package adbistju.system.models.commands;

public interface Commander {
    void jump();
    void run();
    void walk();
    void talk();

    boolean goToSleep();
    boolean wakeUp();
    boolean toEat();
}

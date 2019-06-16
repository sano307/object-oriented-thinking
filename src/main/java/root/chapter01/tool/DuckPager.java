package root.chapter01.tool;

import root.chapter01.behavior.quack.QuackBehavior;

public class DuckPager {

    private QuackBehavior quackBehavior;

    public DuckPager(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void sound() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

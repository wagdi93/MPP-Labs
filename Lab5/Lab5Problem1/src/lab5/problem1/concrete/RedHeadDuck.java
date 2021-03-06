package lab5.problem1.concrete;

import lab5.problem1.abstractclasses.Duck;
import lab5.problem1.interfaces.FlyBehaviour;
import lab5.problem1.interfaces.QuackBehavior;

public class RedHeadDuck extends Duck {

	public RedHeadDuck(FlyBehaviour fly,QuackBehavior quack) {
		setFlyBehaviour(fly);
		setQuackBehavior(quack);
	}
	
	@Override
	public void display() {
		System.out.println("display");

	}

}

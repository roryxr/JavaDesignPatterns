public abstract class Duck
{
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public abstract void display();
	public Duck(){}
	public void performFly(){
		flyBehavior.fly();
	}
	public void performQuack(){
		quackBehavior.quack();
	}
	public void swim(){
		System.out.println("swim...");
	}

	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
}

public class MiniDuck extends Duck
{
	public MiniDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new MuteQuack();
	}

	public void display(){
		System.out.println("I'm a MiniDuck!!");
	}
}

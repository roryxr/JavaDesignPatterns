class MiniDuckTest{
	public static void main(String[] args){
		Duck d = new MiniDuck();
		d.performFly();
		d.performQuack();
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}

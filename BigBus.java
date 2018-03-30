/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Homework 4
 */

class BigBus extends Vehicle
{
	public BigBus(Engine e)
	{
		super(e);
		super.weightInKilos = 3000;
	}
		
	public void drive()
	{
		System.out.println("\nThe big bus is driving");
		int horsepower = engine.go();
		reportOnSpeed(horsepower);
	}
}
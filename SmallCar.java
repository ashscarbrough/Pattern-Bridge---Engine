/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Homework 4
 */

class SmallCar extends Vehicle
{
	public SmallCar(Engine e)
	{
		super(e);
		super.weightInKilos = 600;
	}

	public void drive()
	{
		System.out.println("\nThe small car is driving");
		int horsepower = engine.go();
		reportOnSpeed(horsepower);
	}
}
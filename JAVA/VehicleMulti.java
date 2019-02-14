abstract class Vehicle
{
	Double milage;
	Double fuelCapacity;
	String fuelType;            //Diesel(80) Petrol(191) CNG(8) Electric(2)
	int seatingCapacity;        //4 Seater(13) 5 Seater(268)
	abstract String brand; //Maruti Hyundai Honda Toyota Tata Mahindra Ford BMW Mercedes Volkswagen Audi Fiat Mitsubishi Renault Porsche Ferrari Bugatti Isuzu Lamborghini Maserati Rolls-Royce
	abstract String gearTransmission;	//Automatic(60) Manual(221)
	abstract String bodyColor;          //Black SilverGrey White Blue 
	
	abstract public void display()
	{
		System.out.println("Brand Name: \t" + brand);
        System.out.println("Number of tyres: \t" + tyreCount);
        System.out.println("Type of vehicle: \t" + vehicleType);
		System.out.println("Transmission(Automatic/Manual): \t" + Transmission);
		System.out.println("Base Color Varient: \t" + color);
		System.out.println("Milage given: \t" + milage);
		System.out.println("Fuel Capacity: \t" + fuelCapacity);
		System.out.println("Fuel type: \t" + fuelType);
		System.out.println("Engine CC: \t" + engineCC);
		System.out.println("Base Price: \t" + price);
	}
}

class CarVendor extends Vehicle
{
	CarVendor(brand)
	
}
class CarCategory extends Vendor
{
	//vehicleType...................Hatchback Sedan SUV MUV Luxury
	//Transmission..................Automatic() Manual()
}

class CarVarient extends vendor
{
	String bodyColor;
	long price;
	Double mileage;
	
}
class Multilevel
{
	public static void main(String args[])
	{
		
	}
}
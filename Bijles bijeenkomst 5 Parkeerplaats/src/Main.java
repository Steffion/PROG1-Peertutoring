
public class Main {
	
	public static void main(String[] args) {
		Garage garage = new Garage("De blauwe P");
		
		garage.parkAuto(new Auto("KD-86-JD", "Opel"));
		garage.parkAuto(new Auto("83-86-JD", "Peugot"));
		garage.parkAuto(new Auto("LS-DK-34", "Volvo"));
		garage.parkAuto(new Auto("KD-86-JD", "Tesla"));
		garage.parkAuto(new Auto("28-KDJ-6", "Volkswagen"));
		garage.parkAuto(new Auto("62-REW-8", "SloOpel :')"));
		garage.parkAuto(new Auto("AA-38-ED", "Renaut"));

		garage.printGarage();
	}
	
}

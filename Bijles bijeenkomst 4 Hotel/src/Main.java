
public class Main {
	
	public static void main(String[] args) {
		Hotel hotel = new Hotel("Van der valk", 3);
		
		Klant henk = new Klant("Henk van der Stuur", 5);
		Klant tieneke = new Klant("Tieneke van Schaag", 1);
		
		Kamer familieKamer = new Kamer(2, "Familie Kamer");
		Kamer suite = new Kamer(97, "Suite");
		
		Reservering reservering1 = new Reservering(henk, 1);
		reservering1.addKamer(familieKamer);
		
		Reservering reservering2 = new Reservering(tieneke, 1);
		reservering2.addKamer(suite);
		
		hotel.addReservering(reservering1);
		hotel.addReservering(reservering2);
		
		hotel.printHotel();
	}
	
}

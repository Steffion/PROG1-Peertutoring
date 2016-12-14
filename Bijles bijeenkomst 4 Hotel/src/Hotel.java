
public class Hotel {
	private String			hotel;
	private Reservering[]	reserveringen;

	public Hotel(String hotel, int aantalReserveringen) {
		super();
		this.hotel = hotel;
		this.reserveringen = new Reservering[aantalReserveringen];
	}

	public void addReservering(Reservering reservering) {
		int counter = 0;
		
		while (counter < reserveringen.length) {
			if (reserveringen[counter] == null) {
				reserveringen[counter] = reservering;
				break;
			}
			
			counter++;
		}
	}
	
	public void printHotel() {
		System.out.println("Hotel: " + hotel + " met de reserveringen:");
		
		int counter = 0;

		while (counter < reserveringen.length) {
			if (reserveringen[counter] != null) {
				reserveringen[counter].printReservering();
			}

			counter++;
		}
	}

	public String getHotel() {
		return hotel;
	}

	public Reservering[] getReserveringen() {
		return reserveringen;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public void setReserveringen(Reservering[] reserveringen) {
		this.reserveringen = reserveringen;
	}
}

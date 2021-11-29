public class Boat extends Vehicule {
	
	public Boat(String brandName,int kilometers,int horsePowered,int price) {
		super(brandName,kilometers,horsePowered,price);
	}
	
	public String doSomethingWithMyBoat() {
		
		return "This Boat "  + this.getBrandName() + " , cost " + this.getPrice() + " he haves " + this.getKm() + " he developed " + this.gethorsePowered() + " horses Power ";				
	}
	
}
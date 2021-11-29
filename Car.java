public class Car extends Vehicule {
	
	public Car(String brandName,int kilometers,int horsePowered,int price) {
		super(brandName,kilometers,horsePowered,price);
	}
	
	public String doSomethingWithMyCar() {
		
		return "This Car "  + this.getBrandName() + " ,cost " + this.getPrice() + " he haves " + this.getKm() + " he developed " +
				this.gethorsePowered() + " horse Power";				
	}
	
}
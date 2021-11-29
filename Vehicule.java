public abstract class Vehicule{
	
	// Attributs
	String brandName;
	int kilometers;
	int horsePowered;
	int price;	
	
	// Constructors 
	
	public Vehicule(String brandName, int kilometers, int horsePowered, int price) {
		this.brandName = brandName;
		this.kilometers = kilometers;
		this.horsePowered = horsePowered;
		this.price = price;
	}
	
	// Getter 
	
	public String getBrandName() {
		return this.brandName;
	}
	
	public double getKm() {
		return this.kilometers;
	}
	
	public double gethorsePowered() {
		return this.horsePowered;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	// Setter 
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public void setKm() {
		this.kilometers = kilometers;
	}
	
	public void sethorsePowered() {
		this.horsePowered = horsePowered;
	}
	
	public void setPrice() {
		this.price = price;
	}
}
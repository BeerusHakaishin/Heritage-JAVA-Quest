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
	
	public int getKm() {
		return this.kilometers;
	}
	
	public int gethorsePowered() {
		return this.horsePowered;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	// Setter 
	
	public void setBrandName() {
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
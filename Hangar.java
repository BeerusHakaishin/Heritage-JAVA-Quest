class Hangar {
	
	public static void main(String[] args) {
		Boat Zodiac = new Boat("Zodiac", 10000, 345, 55000);
		Car Nissan = new Car("Nissan Skyline", 1000, 445, 5000);
		
		System.out.println(Zodiac.doSomethingWithMyBoat());
		System.out.println(Nissan.doSomethingWithMyCar());
	}
	
}
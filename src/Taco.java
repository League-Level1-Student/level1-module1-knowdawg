


public class Taco {
	
	public static void main(String[] args) {
		
	Taco taco = new Taco("meat", "sauce");
		
	}

	private String meat;
	private String sauce;
	
	
public Taco(String meat, String sause) {
		
		this.meat = meat;
		this.sauce = sause;
		
	}
	
	
	public void getMeat() {
			
		System.out.println(meat);
		
}
	
	public void getSouce() {
		
		System.out.println(sauce);
		
	}
	
	
	
}

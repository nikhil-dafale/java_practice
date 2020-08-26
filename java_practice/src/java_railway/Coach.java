package java_railway;

public enum Coach {
	TIER1("1A"),
	TIER2("2A"),
	TIER3("3A"),
	SLEEPER,
	GENERAL;
	
	//default constructor for no values
		private Coach() {
			
		}
		
	//property to access value of enum
	private String coach;
	
	//parameterized constructor for properties with values
	private Coach(String coach) {
		this.coach=coach;
	}

	//getter method for coach to access values	
	public String getCoach() {
		return coach;
	}
	
	
}

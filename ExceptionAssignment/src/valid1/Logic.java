package valid1;

public class Logic {
	
	public boolean isAgeValid (int age) throws AgeInvalid {
		
		if(age <= 0) {
			throw new AgeInvalid("Age cannot be 0 or a negative number.");
		}
		
		if(age < 18 || age > 50) {
			throw new AgeInvalid("Users with age between 18 and 50 are only allowed.");
		}
		
		return true;
		
	}
	
	public boolean isContactValid (String contact) {
		
		if(!contact.matches("\\+1-[0-9]{10}")) {
			throw new ContactInvalid("Entered contact number: "+ contact + " is invalid.");
		}
		
		return true;
	}

}

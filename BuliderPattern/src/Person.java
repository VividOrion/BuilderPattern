
public class Person {
	String eating,sleeping;
	String studying,walking;
	public Person(InnerPersonClass p) {
		this.eating = p.eating;
		this.sleeping =p. sleeping;
		this.studying = p.studying;
		this.walking = p.walking;
	}
	
	@Override
	public String toString() {
		return "Person eating=" + eating + ", sleeping=" + sleeping + ", studying=" + studying + ", walking=" + walking
				;
	}

	public static class InnerPersonClass{
		String eating,sleeping;
		String studying,walking;
		public InnerPersonClass(String eating, String sleeping) {
			super();
			this.eating = eating;
			this.sleeping = sleeping;
		}
		public InnerPersonClass setStudying(String studying)
		{
			this.studying=studying;
			return this;
		}
		public InnerPersonClass setWSalking(String walking)
		{
			this.walking=walking;
			return this;
		}
		public Person build() {
			return new Person(this);
		}
	}
}


public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person.InnerPersonClass("All the time..", "I Love it").setStudying("sometimes").build();
		System.out.println(p);
	}

}

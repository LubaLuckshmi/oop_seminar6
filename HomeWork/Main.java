public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		new Reporter(user).report();
		new Persister(user).save();
	}
}
public class Persister implements Saveable{
	private UserAbstract userAbstract;

	public Persister(UserAbstract userAbstract){
		this.userAbstract = userAbstract;
	}
	
	public void save(){
		System.out.println("Save user: " + userAbstract.getName());
	}
}



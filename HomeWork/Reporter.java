public class Reporter implements Reportable{
    private UserAbstract userAbstract;

    public Reporter(UserAbstract userAbstract) {
        this.userAbstract = userAbstract;
    }
    @Override
    public void report() {
        System.out.println("Report for user: " + userAbstract.getName());
    }
}

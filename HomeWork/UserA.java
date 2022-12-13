public class UserA extends User implements Reportable {

    public UserA(String name) {
        super(name);
    }

    public void save() {
        persister.save();
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + getName());
    }
}

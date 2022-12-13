public class UserA extends User {

    public UserA(String name) {
        super(name);
    }

    public void save() {
        persister.save();
    }
}

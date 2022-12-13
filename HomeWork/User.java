public abstract class User {
    private String name;
    Persister persister = new Persister(this);

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
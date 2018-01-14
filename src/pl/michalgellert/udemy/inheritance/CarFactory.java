package pl.michalgellert.udemy.inheritance;

public class CarFactory extends Factory {

    private String name;

    @Override
    public void checkState() {
        super.checkState();
        System.out.println("checkStateInCarFactory");
    }

    public void testDrive() {
        System.out.println("testDrive");
    }

    @Override
    public void destroy() {
        System.out.println("carDestroy");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CarFactory)
            return ((CarFactory) obj).getName().equals(this.getName());
        else
            return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

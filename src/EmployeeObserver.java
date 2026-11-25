public class EmployeeObserver implements Observer{
    private final String name;

    public EmployeeObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " notifikován: " + status);
    }
}

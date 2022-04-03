public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Register register = new Register();
        register.createRegisteredDrivers();
        register.showRegisteredDrivers();
        register.showAverageAgePerson();
        register.showAverageAgeCar();
        register.showAverageCarMileage();
    }
}

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Register {
    ArrayList<Person> personList = new ArrayList<>();
    ArrayList<Car> carList = new ArrayList<>();
    ArrayList<Integer> personAgeList = new ArrayList<>();
    ArrayList<Integer> carAgeList = new ArrayList<>();
    ArrayList<Integer> carMileageList = new ArrayList<>();
    Calendar calendar = Calendar.getInstance();

    public void createRegisteredDrivers() {
        Person person1 = new Person("John Johnson", 1967);
        Person person2 = new Person("Maya Norris", 1978);
        Person person3 = new Person("Joseph Anderson", 1992);
        Person person4 = new Person("Bill Mayor", 1968);
        personList.addAll(List.of(new Person[]{person1,person2,person3,person4}));

        Car car1 = new Car.Personal("Tesla", "Model-X", 2021, 1140, "16.03.2019", person1);
        Car car2 = new Car.Truck("Mercedes", "Mercedes-Benz X-Class", 1989, 2621, "05.09.2015",person2);
        Car car3 = new Car.Van("Volkswagen", "Transporter Sportline", 2005, 5607, "23.05.1021", person3);
        Car car4 = new Car.Truck("Ford", "F-Series", 2000, 2140, "30.11.2020", person4);
        Car car5 = new Car.Personal("Toyota", "Rav4", 1979, 4302, "14.08.2019", person3);
        carList.addAll(List.of(new Car[]{car1, car2, car3, car4, car5}));

        personAgeList.addAll(List.of
                (calendar.get(Calendar.YEAR) - person1.getYearOfBirth(),
                (calendar.get(Calendar.YEAR) - person2.getYearOfBirth()),
                (calendar.get(Calendar.YEAR) - person3.getYearOfBirth()),
                (calendar.get(Calendar.YEAR) - person4.getYearOfBirth()))
        );

        carAgeList.addAll(List.of((Calendar.YEAR) - car1.getProductionYear(),
                (calendar.get(Calendar.YEAR) - car1.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car2.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car3.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car4.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car5.getProductionYear()))
        );

        carMileageList.addAll(List.of(car1.getMileage(),
                car2.getMileage(),
                car3.getMileage(),
                car4.getMileage(),
                car5.getMileage())
        );

    }
        public void showRegisteredDrivers() {
            for (Person person : personList) {
                person.show();
                for(Car car : carList) {
                    if(car.getOwner() == person.getId()) {
                        car.show();
                    }
                }
            }
        }

        public void showAverageAgePerson() {
            int averageAgePerson = (int) personAgeList.stream()
                    .mapToInt(d -> d)
                    .average()
                    .orElse(-1);
            System.out.println("Average age of persons: " + averageAgePerson);
        }

        public void showAverageAgeCar() {
            int averageAgeCar = (int) carAgeList.stream()
                    .mapToInt(d -> d)
                    .average()
                    .orElse(-1);
            System.out.println("Average age of cars: " + averageAgeCar);
        }

    public void showAverageCarMileage() {
        int averageCarMileage = (int) carMileageList.stream()
                .mapToInt(d -> d)
                .average()
                .orElse(-1);
        System.out.println("Average mileage of cars: " + averageCarMileage);
    }
}

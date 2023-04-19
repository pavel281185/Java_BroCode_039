public class Main {
    public static void main(String[] args) {
        // Encapsulation
        Car car = new Car("Chevrolet", "Camaro",2022);
        System.out.println(car.getMake());
        System.out.println(car.getYear());
        car.setYear(2000);
        System.out.println(car.getYear());
    }
}
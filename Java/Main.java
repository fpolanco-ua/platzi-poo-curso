package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX car= new UberX("AMQ111",new Account("Andres","7408546546"),"Wolvo","asul");
        car.passenger=1;
        car.printDataCar();
/*
        Car car2= new Car("AMQ222",new Account("Andres","7408546546"));
        car2.passenger=2;
        car2.printDataCar();*/
    }
}
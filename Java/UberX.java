package Java;

class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Account driver,String brand,String model){
        super(license, driver);//para llamar al construcctor de Car
        this.brand = brand;
        this.model = model;
    }
}
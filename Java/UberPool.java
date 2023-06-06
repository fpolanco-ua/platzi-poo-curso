package Java;

public class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, Account driver,String brand,String model){
        super(license, driver);//para llamar al construcctor de Car
        this.brand = brand;
        this.model = model;
    }
    
}

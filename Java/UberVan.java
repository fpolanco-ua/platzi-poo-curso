package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {

    Map<String, Map<String,Integer>> typeCarAcccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver,Map<String, Map<String,Integer>> typeCarAcccepted,ArrayList<String> seatsMaterial){
        super(license, driver);//para llamar al construcctor de Car
        this.typeCarAcccepted = typeCarAcccepted;
        this.seatsMaterial = seatsMaterial;
    }
}

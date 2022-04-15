package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(String status){
        //Logging
        //Authentication
        //Sanitize the data
        System.out.println("Checkout Method from ShoppingCart called "+status);
    }

    public int quantity(){
        return 10;
    }
}

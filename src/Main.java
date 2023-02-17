import com.sena.objects.Order;
import com.sena.objects.Product;
import com.sena.objects.Vehiculo;
import  com.sena.objects.User;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//        String placa = "123456";
//        Vehiculo v = new Vehiculo("1adec");
//        Vehiculo v2 = new Vehiculo("543fgh");
//
//        Vehiculo v3 = new Vehiculo("2edsafc", "$$", "sebastian", "lamborgini", "negro", 212002020);
//
//        System.out.println(v3.getPlaca());
//        System.out.println(v.getPlaca());
//        System.out.println(v2.getPlaca());
//        System.out.println("Getting quantity of cars: " + Vehiculo.cars);
//
//        User user = new User("sm@sfcsdcx", "123456");

        User comunUser = new User("smsdsd@gmial.com", "123456");
        User completeSigninUser = new User("sebas", "sm9349168@gmai.com", "12345678910", "3023492663", "your heart");

        System.out.println("Comun user: " + comunUser.getEmail());
        System.out.println("Register User: " + completeSigninUser.getTelPhone());
        System.out.println("Register User: " + completeSigninUser.getEmail());
        System.out.println("Register User: " + completeSigninUser.getName());
        System.out.println("Register User: " + completeSigninUser.getDirection());

        Product comunProduct = new Product("hoodie", 2.0265F, "123456");
        Product completeProduct = new Product("netboock", 1.0032F, 5, "Beautiful computer that has all you need", "sdfcsdvcx");

        System.out.println("Comun Product: " + comunProduct.getCode());
        System.out.println("Comun Product: " + comunProduct.getName());
        System.out.println("Comun Product: " + comunProduct.getPrice());

        System.out.println("Complete Product: " + completeProduct.getName());
        System.out.println("Complete Product: " + completeProduct.getPrice());
        System.out.println("Complete Product: " + completeProduct.getCode());
        System.out.println("Complete Product: " + completeProduct.getDescription());
        System.out.println("Complete Product: " + completeProduct.getQuantity());

        System.out.println("Adding a code or product to an user: " + completeSigninUser.getProductsOfCart());
        System.out.println("Adding a code or product to an user 2: " + completeSigninUser.setProductToCart(completeProduct));
        System.out.println("Getting the products saved like a cart" + completeSigninUser.getProductsOfCart());

    }
}

//Constructor: Permite crear un objeto, sin datos o con datos
/*

Sintaxis:

public [nombre de la clase] (variable_local) {
    this.[variable global] = variable_local
}
 */
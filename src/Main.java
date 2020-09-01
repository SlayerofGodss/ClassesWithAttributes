public class Main {

    public static void main(String[] args) {
Product product = new Product(1,"Laptop","Casper Exacalibur",8700,2,"Siyah");
//product.set_name("Diyarın Excaliburu");
//product.setId(1);
//product.set_description("Excalibur Game Book");
//product.set_stockAmound(1);
//product.set_renk("Siyah");
//product.set_kod("Game Book");
//product.set_price(8700);



ProductManager productManager  = new ProductManager();
productManager.Add(product);




    }
}

public class Product {

    public Product(int id, String name, String description, double price, int stockAmound, String renk){
        System.out.println("Yapıcı Blok Çalıştı");
        this._id = id;
        this._name = name;
        this._description = description;
        this._price = price;
        this._stockAmound = stockAmound;
        
    }

    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmound;
    private String _renk;
    private String _kod;

    public Product(){


    }

    //getter
    public int getId() {
        return _id;
    }

    //setter
    public void setId(int id) {
        _id = id;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        _price = price;
    }

    public String get_name() {
        return _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        _description = description;
    }

    public int get_stockAmound() {
        return _stockAmound;
    }

    public void set_stockAmound(int stockAmound) {
        _stockAmound = stockAmound;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String renk) {
        _renk = renk;
    }

    public String get_kod() {
        return _kod;
    }

    public void set_kod(String kod) {
        _kod = kod;
    }



    public void set_name(String name){
        _name  = name;
    }


}

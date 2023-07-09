public class Toy {
    String name;
    String code;
    int price;
    int stock;

    public Toy(String name, String code, int price, int stock){
        this.name = name;
        this.code = code;
        this.price = price;
        this.stock = stock;
    }

    public String getCode() {
        return code;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }
    
}

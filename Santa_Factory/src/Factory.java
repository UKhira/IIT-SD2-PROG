import java.util.List;
import java.util.ArrayList;

public class Factory {

    private List<Toy> toys;

    public Factory(){
        toys = new ArrayList<>();
    }

    public void addToy(String name, String code,  int price, int stock){
        Toy toy = new Toy(name, code, price, stock);
        toys.add(toy);
    }

    public void updateStock(){
        for (Toy toy: toys){
            if(toy.getCode().equals(code)){
                toy.setStock(stock);
                return;
            }
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Container <T> {
    
    private List<T> items;
//constructor
    public Container(){
        items = new ArrayList<>();
    }
//getter
    public List<T> getItems() {
        return items;
    }
//setter
    public void addItem(T item) {
        items.add(item);
    }

}

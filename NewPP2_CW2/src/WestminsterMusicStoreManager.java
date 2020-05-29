import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WestminsterMusicStoreManager implements StoreManager{

    public static final int MAX_SIZE =1000;
    private List<MusicItem> itemlist = new ArrayList<MusicItem>();
    private List<MusicItem> solditem = new ArrayList<MusicItem>();

    @Override
    public void addItem(MusicItem item) {
        if (itemlist.size() < MAX_SIZE) {
            itemlist.add(item);
        } else {
            System.out.println("Maximum size is obtained!!!");
        }
    }

    @Override
    public void deleteItem(String itemID) {
        boolean found = false;

        for(MusicItem item: itemlist){
            if (item.getItemID().equals(itemID)){
                itemlist.remove(item);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Item not found!!!");
        }
    }

    @Override
    public void print() {
        for (MusicItem item : itemlist){
            System.out.println(item);
        }

    }

    @Override
    public void sort() {
        Collections.sort(itemlist);
        Collections.sort(itemlist, new IDComparator());

    }

    @Override
    public void buy(String itemID) {
        solditem.clear();
        Scanner sc = new Scanner();

    }

    @Override
    public void generateReport() {

    }
}

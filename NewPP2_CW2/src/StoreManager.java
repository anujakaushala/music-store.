public interface StoreManager {
    void addItem(MusicItem item);
    void deleteItem(String itemID);
    void print();
    void sort();
    void buy(String itemID);
    void generateReport();


}

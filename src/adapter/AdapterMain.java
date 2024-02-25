package adapter;

// Client class
public class AdapterMain {
    public static void main(String[] args) {
        // Using the adapter to make Adaptee work with Target interface
        FriendCellPhone adaptee = new FriendCellPhone();
        CellPhone adapter = new CellPhoneAdapter(adaptee);
        adapter.call();
    }
}

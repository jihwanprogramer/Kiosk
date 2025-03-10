import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final String categoryName;
    private final List<MenuItem> menuItems;

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void viewMenu() {
        System.out.println("[ " + categoryName + " MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.println(i + 1+". "+item.getName() + " | ₩ "+item.getPrice()+ " | "+ item.getContent());
        }
        System.out.println("0. 뒤로가기");
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public String getCategoryName() {
        return categoryName;
    }
}

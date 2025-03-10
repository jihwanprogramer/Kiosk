import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menuItemList;
    String category;

    public Menu(String category) {
        this.category = category;
        this.menuItemList = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItemList.add(item);
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public String getCategoryName() {
        return category;
    }

    public void viewMenu() {
        for (MenuItem menu : menuItemList) {
            System.out.println((menuItemList.indexOf(menu) + 1) + ". " + menu.getName() + "|₩ " + menu.getPrice() + " |" + menu.getContent());
        }
        System.out.println("0. 뒤로가기");
    }
}

import java.util.ArrayList;
import java.util.List;

public class Menu {
    String category;
    List<MenuItem> menuItemList;


    //Menu 생성자
    public Menu(String category) {
        this.category = category;
        this.menuItemList = new ArrayList<>();
    }

    //Menuitem 을 menuItemList 에 추가하는 메소드
    public void addMenuItem(MenuItem item) {
        menuItemList.add(item);
    }

    //카테고리 이름 추출
    public String getCategoryName() {
        return category;
    }

    //메뉴 보여주기
    public void viewMenu() {
        System.out.println("[ " + category + " MENU ]");
        for (MenuItem m : menuItemList) {
            System.out.println(menuItemList.indexOf(m) + 1 + ". " + m.getName() + " | ₩ " + m.getPrice() + " | " + m.getContent());
        }
        System.out.println("0. 뒤로가기");
    }

    //MenuItem 리스트 추출
    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }
}

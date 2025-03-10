import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Kiosk {
    List<Menu> mainMenu;

    public Kiosk() {
        mainMenu = new ArrayList<>();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        Menu burgerMenu = new Menu("BURGERS");
        Menu drinkMenu = new Menu("DRINKING");
        Menu dessertMenu = new Menu("DESSERT");

        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        mainMenu.add(burgerMenu);

        drinkMenu.addMenuItem(new MenuItem("cider", 1.0, "사이다"));
        drinkMenu.addMenuItem(new MenuItem("vanilla shake", 2.0, "바닐라 쉐이크"));
        drinkMenu.addMenuItem(new MenuItem("cola", 1.0, "콜라"));
        mainMenu.add(drinkMenu);

        dessertMenu.addMenuItem(new MenuItem("Potato Fries", 1.5, "감자튀김"));
        dessertMenu.addMenuItem(new MenuItem("Shake Shake Chicken", 3.0, "쉑쉑치킨"));
        mainMenu.add(dessertMenu);

        int categoryChoice;

        do {
            System.out.println("[ MAIN MENU ]");
            for (Menu m : mainMenu) {
                System.out.println((mainMenu.indexOf(m) + 1) + ". " + m.getCategoryName());
            }
            System.out.println("0. 종료");
            categoryChoice = sc.nextInt();

            if (categoryChoice > 0 && categoryChoice <= mainMenu.size()) {
                Menu selectMenu = mainMenu.get(categoryChoice - 1);
                System.out.println("[ " + selectMenu.getCategoryName() + " MENU ]");
                selectMenu.viewMenu();
                System.out.println("메뉴를 선택하세요");
                int itemChoice = sc.nextInt();
                if (itemChoice == 0) {
                    continue;
                }
                MenuItem choiceItem = selectMenu.getMenuItemList().get(itemChoice - 1);
                System.out.println(" 선택한 메뉴:" + choiceItem.getName() + "|₩ " + choiceItem.getPrice() + " |" + choiceItem.getContent());
            }
        }
        while (categoryChoice != 0);

        sc.close();
    }


}

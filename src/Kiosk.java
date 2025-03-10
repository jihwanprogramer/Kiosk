import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> mainMenu;

    public Kiosk() {
        mainMenu = new ArrayList<>();
    }

    // Kiosk 에 메뉴 추가 메소드
    public void addMenu(Menu menu) {
        mainMenu.add(menu);
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int categoryChoice;

        do {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < mainMenu.size(); i++) {
                System.out.println((i + 1) + ". " + mainMenu.get(i).getCategoryName());
            }
            System.out.println("0. 종료");
            categoryChoice = sc.nextInt();

            if (categoryChoice > 0 && categoryChoice <= mainMenu.size()) {
                Menu selectedMenu = mainMenu.get(categoryChoice - 1);
                selectedMenu.viewMenu();

                System.out.println("메뉴를 선택하세요");
                int itemChoice = sc.nextInt();

                if (itemChoice > 0 && itemChoice <= selectedMenu.getMenuItems().size()) {
                    MenuItem chosenItem = selectedMenu.getMenuItems().get(itemChoice - 1);
                    System.out.println("선택한 메뉴:"+chosenItem.getName() + " | ₩ "+chosenItem.getPrice()+ " | "+ chosenItem.getContent());
                } else if(itemChoice == 0) {
                     continue;
                }
                else{
                        System.out.println("올바르지 않은 선택입니다.");
                }


            }
        } while (categoryChoice != 0);

        sc.close();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> mainMenu;
    private final List<Menu> orderMenu;

    //Kiosk 생성자
    public Kiosk() {
        mainMenu = new ArrayList<>();
        orderMenu = new ArrayList<>();
    }

    //mainMenu 추가
    public void addMainMenu(Menu menu) {
        mainMenu.add(menu);
    }

    //orderMenu 추가
    public void addOrderMenu(Menu menu) {
        orderMenu.add(menu);
    }

    //Kiosk 시작
    public void start() {
        Scanner sc = new Scanner(System.in);
        int categoryChoice;
        int cartChoice;
        int orderChoice;
        Cart cart = new Cart();

        do {
            System.out.println("[ MAIN MENU ]");
            for (Menu m : mainMenu) {
                System.out.println((mainMenu.indexOf(m) + 1) + ". " + m.getCategoryName());
            }
            System.out.println("0. 종료");



            if (!cart.getCartList().isEmpty()) {
                System.out.println("[ ORDER MENU ]");
                if (orderMenu.isEmpty()) {
                    addOrderMenu(new Menu("Orders"));
                    addOrderMenu(new Menu("Cancel"));
                }
            } else {
                orderMenu.clear();
            }



            for (Menu m : orderMenu) {
                System.out.println((orderMenu.indexOf(m) + mainMenu.size() + 1) + ". " + m.getCategoryName());
            }

            categoryChoice = sc.nextInt();

            if (categoryChoice > 0 && categoryChoice <= mainMenu.size()) {
                Menu choiceMenu = mainMenu.get(categoryChoice - 1);
                choiceMenu.viewMenu();

                System.out.println("메뉴를 선택하세요");
                int itemChoice = sc.nextInt();

                if (itemChoice > 0 && itemChoice <= choiceMenu.getMenuItemList().size()) {
                    MenuItem choseItem = choiceMenu.getMenuItemList().get(itemChoice - 1);
                    System.out.println("선택한 메뉴:" + choseItem.getName() + " | ₩ " + choseItem.getPrice() + " | " + choseItem.getContent());
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1.확인      2취소");
                    cartChoice = sc.nextInt();
                    if (cartChoice == 1) {
                        cart.addCartList(choseItem);
                        System.out.println(choseItem.getName() + " 이 장바구니에 추가되었습니다.");
                    } else {
                        continue;
                    }
                } else if (itemChoice == 0) {
                    continue;
                }
            } else if (categoryChoice > mainMenu.size() && categoryChoice <= orderMenu.size() + mainMenu.size()) {
                cart.viewCart();
                orderChoice = sc.nextInt();

                if (orderChoice == 1) {
                    System.out.println("주문 되었습니다. 금액은 ₩" + cart.getTotalPrice() + " 입니다");
                    cart.clearCart();
                } else if (orderChoice == 2) {
                    continue;
                }
            }
        } while (categoryChoice != 0);

        sc.close();
    }
}

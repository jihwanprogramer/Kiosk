import java.util.ArrayList;
import java.util.List;

public class Kiosk {
    List<MenuItem> menuItemList = new ArrayList<>();
    int index = 1;
    public void ViewMenu(){
        MenuItem shackBurger = new MenuItem("ShackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem SmokeShack = new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem Cheeseburger = new MenuItem("Cheeseburger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem Hamburger = new MenuItem("Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거");

        menuItemList.add(shackBurger);
        menuItemList.add(SmokeShack);
        menuItemList.add(Cheeseburger);
        menuItemList.add(Hamburger);

        System.out.println("[ SHAKE SHACK MENU ]");
        for(MenuItem menu:menuItemList){
            System.out.println(index + ". " + menu.getName() + "|₩ " + menu.getPrice() + " |" + menu.getContent());
            index++;
        }
        System.out.println("0. 종료");
    }

}

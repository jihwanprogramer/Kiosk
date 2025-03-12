public class Main {
    public static void main(String[] args) {
        Menu burgerMenu = new Menu("BURGERS"); // 버거 메뉴 생성
        Menu drinkMenu = new Menu("DRINKING"); // 음료 메뉴 생성
        Menu dessertMenu = new Menu("DESSERT"); // 디저트 메뉴 생성

        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        drinkMenu.addMenuItem(new MenuItem("Cider", 1.0, "사이다"));
        drinkMenu.addMenuItem(new MenuItem("Vanilla Shake", 2.0, "바닐라 쉐이크"));
        drinkMenu.addMenuItem(new MenuItem("Cola", 1.0, "콜라"));

        dessertMenu.addMenuItem(new MenuItem("Potato Fries", 1.5, "감자튀김"));
        dessertMenu.addMenuItem(new MenuItem("Shake Shake Chicken", 3.0, "쉑쉑치킨"));

        Kiosk kiosk = new Kiosk();
        kiosk.addMainMenu(burgerMenu);
        kiosk.addMainMenu(drinkMenu);
        kiosk.addMainMenu(dessertMenu);

        kiosk.start();
    }
}

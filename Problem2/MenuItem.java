package Problem2;

public enum MenuItem {
    BURGER(80),
    FRIES(50),
    DRINK(30);

    private final int price;
    MenuItem(int price) { this.price = price; }
    public int getPrice() { return price; }
}


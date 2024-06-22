public class ShoppingCart {
    private double total;
    private int itemCount;

    public ShoppingCart() {
        total = 0.0;
        itemCount = 0;
    }

    public void addItem(double price) {
        try {
            if (price < 0 || price > 1000) {
                throw new IllegalArgumentException("Price must be between $0 and $1,000.");
            }
            total += price;
            itemCount++;
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding item: " + e.getMessage());
        }
    }

    public double calculateTotalPrice() {
        try {
            if (itemCount == 0) {
                throw new ArithmeticException("Cannot calculate total price: the cart is empty.");
            }
            return total;
        } catch (ArithmeticException e) {
            System.out.println("Error calculating total price: " + e.getMessage());
            return 0.0;
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(500);    
        cart.addItem(-10);   
        cart.addItem(2000);

        System.out.println("Total price: $" + cart.calculateTotalPrice());

        ShoppingCart emptyCart = new ShoppingCart();
        System.out.println("Total price: $" + emptyCart.calculateTotalPrice()); 
    }
}

public class LinearSearch {
    public static Product search(Product[] products, String productName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }
}

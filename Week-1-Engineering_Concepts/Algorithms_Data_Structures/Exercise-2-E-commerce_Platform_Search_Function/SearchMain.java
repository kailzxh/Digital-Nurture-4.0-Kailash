public class SearchMain {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Shoes", "Footwear"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Watch", "Accessories"),
                new Product(104, "Phone", "Electronics")
        };

        // Linear Search Test
        Product foundLinear = LinearSearch.search(products, "Watch");
        System.out.println("Linear Search Found: " + (foundLinear != null ? foundLinear : "Not Found"));

        // Binary Search Test
        Product foundBinary = BinarySearch.search(products, "Watch");
        System.out.println("Binary Search Found: " + (foundBinary != null ? foundBinary : "Not Found"));
    }
}

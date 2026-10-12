class Edible {

    // Static nested class Fruit
    static class Fruit {

        // Static method
        static void fruitDetails() {
            System.out.println("Fruit Details: Apple, Mango, Banana");
        }

        // Non-static method
        void fruitPackaging() {
            System.out.println("Fruit Packaging: Fruits are packed in boxes.");
        }
    }

    // Static nested class Vegetable
    static class Vegetable {

        // Static method
        static void vegetableDetails() {
            System.out.println("Vegetable Details: Potato, Tomato, Carrot");
        }

        // Non-static method
        
    }

    public static void main(String[] args) {

        // Calling static methods directly using class name
        Fruit.fruitDetails();
        Vegetable.vegetableDetails();

        // Creating objects for non-static methods
        Fruit f = new Fruit();
        f.fruitPackaging();

        Vegetable v = new Vegetable();
        v.vegetablePackaging();
    }
}

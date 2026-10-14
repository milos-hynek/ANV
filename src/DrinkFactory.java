

public class DrinkFactory {
    public static Drink createDrink(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Enter type of drink");
        }

        switch (type.trim().toLowerCase()) {
            case "tea":
                return new Tea();
            case "coffee":
                return new Coffee();
            default:
                throw new IllegalArgumentException("Unknown type of drink: " + type);
        }
    }
}

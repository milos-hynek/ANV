public class CafeConfig {
    private static CafeConfig instance; // singleton instance
    private final String cafeBarName = "Kavárna TUL - A"; // constant name of coffee bar
    private CafeConfig() {} // singleton need private constructor
    public static CafeConfig getInstance() { // method for singleton access
        if (instance == null) { // instance doesnt exist?
            instance = new CafeConfig(); // create it!
        }
        return instance; // and finally return existing instance of this singleton
    }
    public String getCafeName() { // return private constant name of coffee bar
        return cafeBarName;
    }
}
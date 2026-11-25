public class CustomDrinkBuilder {

    // Základní nápoj (např. "coffee" nebo "tea")
    private String base;

    // Příznaky pro jednotlivé přídavky
    private boolean milk;
    private boolean sugar;
    private boolean caramel;

    // Privátní konstruktor, který přebírá data z Builderu
    private CustomDrinkBuilder(Builder builder) {
        this.base = builder.base;
        this.milk = builder.milk;
        this.sugar = builder.sugar;
        this.caramel = builder.caramel;
    }

    // Metoda toString() pro hezké výpisy dle zadání
    @Override
    public String toString() {
        return DrinkFactory.createDrink(base).serve()
                + (milk ? " S mlékem." : "")
                + (sugar ? " S cukrem." : "")
                + (caramel ? "S karamelem." : "");
    }

    // Vnořená třída Builder
    public static class Builder {
        private String base;
        private boolean milk = false;
        private boolean sugar = false;
        private boolean caramel = false;

        // Konstruktor builderu vyžaduje základ nápoje
        public Builder(String base) {
            this.base = base;
        }

        public Builder milk() {
            this.milk = true;
            return this; // vrací aktuální instanci builderu pro řetězení metod
        }

        public Builder sugar() {
            this.sugar = true;
            return this;
        }

        public Builder caramel() {
            this.caramel = true;
            return this;
        }

        // Metoda build vytvoří finální instanci CustomDrink
        public CustomDrinkBuilder build() {
            return new CustomDrinkBuilder(this);
        }
    }
}

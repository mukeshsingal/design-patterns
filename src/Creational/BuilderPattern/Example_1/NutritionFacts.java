package Creational.BuilderPattern.Example_1;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int iron;
    private final int carbohydrate;

    public NutritionFacts(Builder builder) {
        servings = builder.servings;
        servingSize = builder.servingSize;

        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        iron = builder.iron;
        carbohydrate = builder.carbohydrate;
    }

    public static class Builder {
        private int servingSize;
        private int servings;

        /*Optional will be initialized with default values */
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int iron = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder iron(int val) {
            iron = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

}

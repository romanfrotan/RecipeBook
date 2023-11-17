import java.util.ArrayList;

    public class Recipe {

        private String recipeName;
        private int cookTime;
        private ArrayList<String> ingredients;

        public Recipe(String recipeName, int cookTime) {
            this.recipeName = recipeName;
            this.cookTime = cookTime;
            this.ingredients = new ArrayList<>();
        }

        @Override
        public String toString() {
            return this.recipeName + " time to cook: " + this.cookTime;
        }

        public String getRecipeName() {
            return recipeName;
        }

        public int getCookTime() {
            return cookTime;
        }

        public void addIngredients(String ingredient) {
            this.ingredients.add(ingredient);
        }

        public ArrayList<String> getIngredients() {
            return ingredients;
        }



}

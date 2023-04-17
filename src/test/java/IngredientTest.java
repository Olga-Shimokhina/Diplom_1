import praktikum.Ingredient;
import praktikum.IngredientType;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTest {
    private final float price;
    private final String name;
    private final IngredientType type;
    public IngredientTest(IngredientType type, String name, float price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    @Parameterized.Parameters(name = " {index} -> Type: {0}, Name: {1}, Price: {2} ")
    public static Object[][] dataForTest() {
        return new Object[][]{
                {SAUCE, "hot sauce", 100},
                {SAUCE, "sour cream", 0.01f},
                {SAUCE, "chili sauce", 300},
                {FILLING, "cutlet", 100},
                {SAUCE, "galaxy sauce", -100},
                {FILLING, "sausage", 300},
                {FILLING, null, 200},
                {null, "sausage", 300},
        };
    }
    @Test
    public void getTypeReturnTrueType() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Тип ингредиента с ошибкой", type, ingredient.getType());
    }
    @Test
    public void getNameReturnTrueName() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Название с ошибкой", name, ingredient.getName());
    }
    @Test
    public void getPriceReturnTruePrice() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Цена с ошибкой", price, ingredient.getPrice(), 0.0001f);
    }
}

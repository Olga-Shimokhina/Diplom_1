import praktikum.IngredientType;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class IngredientTypeTest {
    @Test
    public void fillingNotNull() {
        assertNotNull("В ингредиентах начинки не указаны", IngredientType.valueOf("FILLING"));
    }
    @Test
    public void sauceNotNull() {
        assertNotNull("В ингредиентах соусы не указаны", IngredientType.valueOf("SAUCE"));
    }
}

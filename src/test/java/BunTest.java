import praktikum.Bun;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {
    private final String name;
    private final float price;
    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }
    @Parameterized.Parameters(name = "Bun {index} -> Name: {0}, Price: {1} ")
    public static Object[][] dataForTest() {
        return new Object[][]{
                {"black bun", 100},
                {"white bun", 200},
                {"red bun", 300},
                {"", 300},
                {"qwertyqwertyqwertyqwertyqwertyqwerty", 200},
                {null, 100},
                {"!№;%?*(_#@)", 200},
                {"black bun", -100},
                {"black bun", 0},
                {"black bun", 0.01f},
                {"black bun", 999999999},
                {"neon bun", 300},
        };
    }
    @Test
    public void getNameReturnValidName() {
        Bun bun = new Bun(name, price);
        assertEquals(name, bun.getName());
    }
    @Test
    public void getPriceReturnValidPrice() {
        Bun bun = new Bun(name, price);
        assertEquals("Цена возвращается с ошибкой", price, bun.getPrice(), 0.0f);
    }
}

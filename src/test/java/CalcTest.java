import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcTest{
    private Calc calc;
    @BeforeAll
    static void beforeAll() {
// Здесь могут быть глобальные операции инициализации
    }

    @AfterAll
    static void afterAll() {
// Здесь могут быть глобальные операции завершения
    }

    @BeforeEach
    void setUp() {
        calc = new Calc();
    }

    @AfterEach
    void tearDown() {
        calc = null;
    }
    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 101})
    @DisplayName("Проверка процентов")
    void calculatingDiscount(int percent) {
        int purchaseAmount = 1000;
        assertThrows(ArithmeticException.class, () -> calc.calculateDiscount(purchaseAmount, percent));
    }
    @Test
    @DisplayName("Проверка суммы денег")
    void calculatingDiscount() {
        int purchaseAmount = -1;
        int purchasePercent = 50;
        assertThrows(ArithmeticException.class, () -> calc.calculateDiscount(purchaseAmount, purchasePercent));
        assertThrows(ArithmeticException.class, () -> calc.calculateDiscount(Integer.MAX_VALUE + 1,
                purchasePercent));
    }










}
package hw2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MotorcycleTest {
    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        this.motorcycle = new Motorcycle("Honda", "NC 750X", 2015);
    }

    @AfterEach
    void tearDown() {
        this.motorcycle = null;
    }
    @Test
    @DisplayName("Motorcycle создается с 2-мя колесами")
    void numberWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    //     - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    @DisplayName("Motorcycle развивает скорость 75 в режиме тестового вождения")
    void speedMotoTest () {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    @DisplayName("Эмуляция движения транспорта")
    void parkTest () {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}

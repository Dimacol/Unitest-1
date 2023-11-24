package hw2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        this.car = new Car("Lada", "Vesta", 2023);
    }

    @AfterEach
    void tearDown() {
        this.car = null;
    }
    @Test
    @DisplayName("Экземпляр объекта Car также является экземпляром транспортного средства")
    void carVehicleTest(){
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    @DisplayName("Car создается с 4-мя колесами")
    void numberWheels() {
        assertEquals(4, car.getNumWheels());
    }
    @Test
    @DisplayName("Car развивает скорость 60 в режиме тестового вождения")
    void speedCarTest () {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }
    @Test
    @DisplayName("Эмуляция движения транспорта")
    void parkCarTest () {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
}
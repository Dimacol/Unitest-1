package hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparisonListTest {
    @Test
    @DisplayName("Тест метода сравнения списков compareLists")
    void testCompareLists() {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lst2 = Arrays.asList(6, 7, 8, 9, 10);
        ComparisonList comparer = new ComparisonList(lst1, lst2);
        String result = comparer.compareLists();
        Assertions.assertEquals("Второй список имеет большее среднее значение", result);
    }

    // проверяем, что при сравнении списков с отрицательными элементами метод
    // compareLists() возвращает "Первый список имеет большее среднее значение".
    @Test
    @DisplayName("Сравнение списков с отрицательными элементами")
    void testCompareNegativeLists() {
        List<Integer> lst1 = Arrays.asList(-5, -2, -3);
        List<Integer> lst2 = Arrays.asList(-1, -4, -6);
        ComparisonList comparer = new ComparisonList(lst1, lst2);
        String result = comparer.compareLists();
        Assertions.assertEquals("Первый список имеет большее среднее значение", result);
    }

    @SuppressWarnings("checkstyle:MagicNumber")
    @Test
    @DisplayName("Вычисления среднего значения списка")
    void testCalculateAverage() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        ComparisonList comparer = new ComparisonList(null, null);
        double result = ComparisonList.getAverage(lst);
        Assertions.assertEquals(3.0, result);
    }

    // проверяем, что при сравнении пустых списков метод
    // compareLists() возвращает "Средние значения равны".
    @Test
    @DisplayName("Сравнение пустых списков")
    void testCompareEmptyLists() {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        ComparisonList comparer = new ComparisonList(lst1, lst2);
        String result = comparer.compareLists();
        Assertions.assertEquals("Средние значения равны", result);
    }


    // проверяем, что при сравнении списка с пустым списком метод compareLists()
    // возвращает "Первый список имеет большее среднее значение".
    @Test
    @DisplayName("Сравнение списка с пустым списком")
    void testCompareListWithEmptyList() {
        List<Integer> lst1 = Arrays.asList(1, 2, 3);
        List<Integer> lst2 = new ArrayList<>();
        ComparisonList comparer = new ComparisonList(lst1, lst2);
        String result = comparer.compareLists();
        Assertions.assertEquals("Первый список имеет большее среднее значение", result);
    }
}


package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.RestService;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")

    public void numberOfMonthsOfRest(int income, int expenses, int threshold, int expected) {
        RestService service = new RestService();

        // подготавливаем данные:
       // int income = 100_000;
        // int expenses = 60_000;
        //int threshold = 150_000;
        //int expected = 2;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}

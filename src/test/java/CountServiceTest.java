import org.example.CountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CountServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/count.csv")
    public void CountingTheMonthsOfRest(int expected, int income, int expenses, int threshold) {
        CountService service = new CountService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

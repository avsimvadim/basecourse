package week1;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task13Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task13.main(new String[]{"120", "256"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Круг уместится в квадрат"));
    }

    @Test
    public void main2() throws Exception {

        Task13.main(new String[]{"495", "200"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Квадрат уместится в круг"));
    }

    @Test
    public void main3() throws Exception {

        Task13.main(new String[]{"205", "200"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Фигуры не вмещаются друг в друга"));
    }


}
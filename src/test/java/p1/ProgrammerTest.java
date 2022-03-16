package p1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ProgrammerTest {

    @Test
    void shouldPrintIWantToLearnJava() {
        final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        Programmer.main(null);
        assertThat("I want to learn java").isEqualTo(outputStreamCaptor.toString().trim());
    }

}
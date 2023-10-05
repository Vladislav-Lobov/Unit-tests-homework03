package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class MainHWTest {


    @BeforeEach

    @Test
    public void evenNumberTest(){
        MainHW mainHW = new MainHW();
        assertThat(mainHW.evenOddNumber(4));
    }

    @Test
    public void oddNumberTest(){
        MainHW mainHW = new MainHW();
        assertThat(mainHW.evenOddNumber(3));
    }

    //входит в интервал
    @Test
    public  void numberInIntervalTest() {
        MainHW mainHW = new MainHW();
        assertThat(mainHW.numberInInterval(50));
    }

    //меньше интервала
    @Test
    public void numberLessInterval() {
        MainHW mainHW = new MainHW();
        assertThat(mainHW.numberInInterval(1) == false);
    }

//
}

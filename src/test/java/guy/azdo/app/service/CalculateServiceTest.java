package guy.azdo.app.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculateServiceTest {

    @Autowired
    ICalculateService calculateService;


    @Test
    public void loadAutowired(){
        assertThat(calculateService).isNotNull();
    }

    @Test
    public void add() {
        Integer a = 5;
        Integer b = 10;

        assertThat(calculateService.add(a,b)).isEqualTo(15);
    }

    @Test
    public void sub() {
        Integer a = 5;
        Integer b = 10;

        assertThat(calculateService.sub(a,b)).isEqualTo(-5);
    }

    @Test
    public void mul() {
        Integer a = 5;
        Integer b = 10;

        assertThat(calculateService.mul(a,b)).isEqualTo(50);
    }

    @Test
    public void dev() {
        Integer a = 5;
        Integer b = 10;

        assertThat(calculateService.div(a,b)).isEqualTo(0);
    }
}

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Michal Matloka
 */
public class HelloAssertJ {

    @Test
    public void shouldDoSth() {
        //given
        final Greeter greeter = new Greeter();
        final String name = "Kirk";
        final String result = "Hello Kirk";

        // when
        final String greeting = greeter.sayHello(name);

        // then
        assertThat(greeting).isEqualTo(result);
    }
}

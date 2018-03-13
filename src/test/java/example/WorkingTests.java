package example;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@SpringBootTest
@ExtendWith(SpringExtension.class)
class WorkingTests {

    @MockBean
    ServiceB serviceB;
    @Autowired
    ServiceA cut;

    @Test
    void mockWasInvokedOnce() {
        cut.foo();
        verify(serviceB, times(1)).bar();
    }

    @Test
    void mockWasInvokedTwice() {
        cut.foo();
        cut.foo();
        verify(serviceB, times(2)).bar();
    }

}

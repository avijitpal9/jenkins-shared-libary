import com.lesfurets.jenkins.unit.*
import org.junit.jupiter.api.*

import static org.junit.jupiter.api.Assertions.assertEquals
import static com.lesfurets.jenkins.unit.MethodCall.callArgsToString

public class sayHelloTest extends BasePipelineTest {
    def sayHello
    @Override
    @BeforeEach
    void setUp() {
        super.setUp()
        // sayHello = loadScript('vars/sayHello.groovy')
    }

    @Test
    void validateSayHello() {
        loadScript('vars/sayHello.groovy').call()
        // sayHello('Avijit')
        // printCallStack()
        println(helper.callStack.findAll{ call -> call.methodName == 'echo'}.any{ call -> callArgsToString(call).contains('Hello, Dave') })
        assertEquals(true, helper.callStack.findAll{ call -> call.methodName == 'echo'}.any{ call -> callArgsToString(call).contains('Hello, Dave') })
        // assertEquals(4, 4)      
        assertJobStatusSuccess()
    }
}

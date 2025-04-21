import com.lesfurets.jenkins.unit.*
import org.junit.jupiter.api.*

public class sayHelloTest extends BasePipelineTest {
    def sayHello
    @Override
    @BeforeEach
    void setUp() {
        super.setUp()
        sayHello = loadScript('vars/sayHello.groovy')
    }

    @Test
    void validateSayHello() {
        // loadScript('vars/sayHello.groovy').execute()
        sayHello('Avijit')
        printCallStack()
        assertJobStatusSuccess()
    }
}

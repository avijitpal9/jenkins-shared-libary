import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.jupiter.api.*

public class sayHelloTest extends BasePipelineTest {
    @Override
    @BeforeEach
    void setUp() {
        super.setUp()
    }

    @Test
    void printHello() {
        loadScript('tests/jenkinsfiles/sayHello/sample.jenkins').execute()
        printCallStack()
        assertJobStatusSuccess()
    }
}

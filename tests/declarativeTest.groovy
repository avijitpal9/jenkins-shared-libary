import com.lesfurets.jenkins.unit.declarative.*
import org.junit.jupiter.api.*

public class decalrativeTest extends DeclarativePipelineTest {
    @Override
    @BeforeEach
    void setUp() {
        super.setUp()
    }

    @Test
    void validateDeclarative() {
        runScript('tests/jenkinsfiles/sayHello/Jenkinsfile')
        printCallStack()
        assertJobStatusSuccess()
    }
}

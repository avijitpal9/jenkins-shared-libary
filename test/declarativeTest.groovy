import com.lesfurets.jenkins.unit.declarative.*
import org.junit.jupiter.api.*

public class decalrativeTest extends DeclarativePipelineTest {
    @Override
    @BeforeEach
    void setUp() {
        super.setUp()
    }

    @Test
    void validateDeclarativePipeline() {
        runScript('test/jenkinsfiles/declarativePipeline1.jenkins')
        printCallStack()
        assertJobStatusSuccess()
    }
}

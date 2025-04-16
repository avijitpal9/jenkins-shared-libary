import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.jupiter.api.*

public class sampleTest extends BasePipelineTest {
    @Override
    @BeforeEach
    void setUp() {
        super.setUp()
    }

    @Test
    void validateSample() {
        loadScript('tests/jenkinsfiles/sayHello/sample.jenkins').execute()
        printCallStack()
        assertJobStatusSuccess()
    }
}

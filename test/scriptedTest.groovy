import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.jupiter.api.*

public class scriptedTest extends BasePipelineTest {
    @Override
    @BeforeEach
    void setUp() {
        super.setUp()
    }

    @Test
    void validateScriptedPipeline() {
        loadScript('test/jenkinsfiles/scriptedPipeline1.jenkins').execute()
        printCallStack()
        assertJobStatusSuccess()
    }
}

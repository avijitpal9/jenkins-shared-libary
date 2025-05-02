import com.lesfurets.jenkins.unit.*
import org.junit.jupiter.api.*

import static org.junit.jupiter.api.Assertions.assertEquals
import static com.lesfurets.jenkins.unit.MethodCall.callArgsToString

class addNumTest extends BasePipelineTest {
    def add_num
    
    @Override
    @BeforeEach
    void setUp() {
        super.setUp()
        add_num=loadScript('vars/addNum.groovy')
    }

    @Test
    void addNumSuccess() {
        printCallStack()
        assertEquals(3, add_num(1,2))
    }
}

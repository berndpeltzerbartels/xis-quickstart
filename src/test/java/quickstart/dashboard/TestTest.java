package quickstart.dashboard;

import one.xis.context.IntegrationTestContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Integration test for TestPage
 *
 * @generated
 */
class TestTest {

    private IntegrationTestContext context;

    @BeforeEach
    void setUp() {
        context = IntegrationTestContext.builder()
                .withSingleton(TestPage.class)
                .build();
    }

    @Test
    void test() {
        // Edit url if you need path variables or query parameters
        var result = context.openPage("/test.html");
        var document = result.getDocument();

        assertThat(document).isNotNull();
        // TODO: Add more assertions
    }
}

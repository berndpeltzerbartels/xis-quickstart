package quickstart.dashboard;

import one.xis.context.IntegrationTestContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Integration test for Dashboard
 * @generated
 */
class DashboardTest {

    private IntegrationTestContext context;

    @BeforeEach
    void setUp() {
        context = IntegrationTestContext.builder()
            .withSingleton(Dashboard.class)
            .build();
    }

    @Test
    void testPageLoads() {
        var result = context.openPage(Dashboard.class);
        var document = result.getDocument();

        assertThat(document).isNotNull();
        // TODO: Add more assertions
    }
}

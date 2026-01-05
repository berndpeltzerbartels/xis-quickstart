package quickstart.helloworld;

import one.xis.context.IntegrationTestContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloWorldTest {

    private IntegrationTestContext context;

    @BeforeEach
    void init() {
        context = IntegrationTestContext.builder()
                .withBasePackageClass(HelloWorldService.class)
                .build();
    }

    @Test
    void showGreeting() {
        var result = context.openPage("/hello-world.html");

        var document = result.getDocument();
        assertThat(document.getElementByTagName("title")).isNotNull();
        assertThat(document.getElementByTagName("h1")).isNotNull();

        var titleElement = document.getElementByTagName("title");
        var h1Element = document.getElementByTagName("h1");

        assertThat(titleElement.getInnerText()).isEqualTo("Hello, World!");
        assertThat(h1Element.getInnerText()).isEqualTo("Hello, World!");

    }
}
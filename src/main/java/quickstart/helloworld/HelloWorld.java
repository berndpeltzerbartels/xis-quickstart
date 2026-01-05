package quickstart.helloworld;

import one.xis.ModelData;
import one.xis.Page;

@Page("/hello-world.html")
class HelloWorld {

    @ModelData
    String greeting() {
        return "Hello, World!";
    }
}

package com.github.daggerok;

import kotlin.NotImplementedError;
import org.junit.jupiter.api.Test;

class SrcTestKotlinJunit5JupiterJavaTest {
  @Test void test_junit_5_jupiter_java_test_class_execution_from_kotlin_test_sources_location() {
    throw new NotImplementedError(
        "For some reasons this JUnit 5 Jupiter java test in src/test/kotlin not going to be executed" +
            "with 'mvn test' command! But be aware, it should fail on test execution in idea IDE!"
    );
  }
}

package com.github.daggerok;

import kotlin.NotImplementedError;
import org.junit.Test;

public class SrcTestKotlinJUnit4VintageJavaTest {
  @Test public void test_junit_4_vintage_java_test_class_execution_from_kotlin_test_sources_location() {
    throw new NotImplementedError(
        "For some reasons this JUnit 4 Vintage java test in src/test/kotlin not going to be executed" +
            "with 'mvn test' command! But be aware, it should fail on test execution in idea IDE!"
    );
  }
}

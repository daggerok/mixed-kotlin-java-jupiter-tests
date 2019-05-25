package com.github.daggerok

import org.junit.jupiter.api.Test
import java.util.logging.Logger

internal class SrcTestJavaJunit5JupiterKotlinTest {
  @Test internal fun `test junit 5 jupiter kotlin test class execution from java test sources location`() {
    Logger.getLogger(javaClass.name).info(
        """
          |junit 5 jupiter kotlin test has been executed from src/test/java sources folder!
          |""".trimMargin()
    )
  }
}

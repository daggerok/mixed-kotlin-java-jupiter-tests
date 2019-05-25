package com.github.daggerok

import org.junit.Test
import java.util.logging.Logger

class SrcTestKotlinJunit4VintageKotlinTest {
  @Test fun `test junit 4 vintage kotlin test class execution from kotlin test sources location`() {
    Logger.getLogger(javaClass.name).info(
        """
          |junit 4 vintage kotlin test has been executed from src/test/kotlin sources folder!
          |""".trimMargin()
    )
  }
}

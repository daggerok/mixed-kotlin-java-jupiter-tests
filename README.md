# mixed-kotlin-java-jupiter-tests [![Build Status](https://travis-ci.org/daggerok/mixed-kotlin-java-jupiter-tests.svg?branch=master)](https://travis-ci.org/daggerok/mixed-kotlin-java-jupiter-tests)
My JUnit 5 Jupiter investigation process of problem how to successfully run JUnit 5 Jupiter and JUnit 4 Vintage tests together in mixed Java + Kotlin maven multi-module projects

<!--
```bash
./mvnw clean ; ./mvnw test -U ; ./mvnw versions:display-property-updates
```
-->

```bash
./mvnw test
```

`+` means: tests are going to be executed
`-` means: for some reasons test are not going to be executed with provided configuration...

```
src/
  test/
    java/
      **/*JUnit4VintageJavaTest.java  +
      **/*JUnit4VintageKotlinTest.kt  +
      **/*JUnit5JupiterJavaTest.java  +
      **/*JUnit5JupiterKotlinTest.kt  +
    kotlin/
      **/*JUnit4VintageJavaTest.java  -
      **/*JUnit4VintageKotlinTest.kt  +
      **/*JUnit5JupiterJavaTest.java  -
      **/*JUnit5JupiterKotlinTest.kt  +
```

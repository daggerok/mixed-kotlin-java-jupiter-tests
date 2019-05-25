# mixed-kotlin-java-jupiter-tests [![Build Status](https://travis-ci.org/daggerok/mixed-kotlin-java-jupiter-tests.svg?branch=master)](https://travis-ci.org/daggerok/mixed-kotlin-java-jupiter-tests)
My JUnit 5 Jupiter investigation process of problem how to successfully run JUnit 5 Jupiter and JUnit 4 Vintage tests together in mixed Java + Kotlin maven projects

<!--
```bash
./mvnw clean ; ./mvnw test -U ; ./mvnw versions:display-property-updates
```
-->

```bash
./mvnw test
```

`+` means: tests are going to be executed
`-` means: for some reasons test are not going to be executed...

```
src/
  test/
    java/
      **/*KotlinJUnit4VintageTest.kt  +
      **/*JavaJUnit4VintageTest.java  +
      **/*KotlinJUnit5JupiterTest.kt  +
      **/*JavaJUnit5JupiterTest.java  +
    kotlin/
      **/*JavaJUnit4VintageTest.java  -
      **/*KotlinJUnit4VintageTest.kt  +
      **/*JavaJUnit5JupiterTest.java  -
      **/*KotlinJUnit5JupiterTest.kt  +
```

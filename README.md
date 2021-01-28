# IntCache (b0.1)

[![GitHub issues](https://img.shields.io/github/issues/illuminator3/IntCache)](https://github.com/illuminator3/IntCache/issues) [![GitHub forks](https://img.shields.io/github/forks/illuminator3/IntCache)](https://github.com/illuminator3/IntCache/network) [![GitHub stars](https://img.shields.io/github/stars/illuminator3/IntCache)](https://github.com/illuminator3/IntCache/stargazers) [![GitHub license](https://img.shields.io/github/license/illuminator3/IntCache)](https://github.com/illuminator3/IntCache/blob/master/LICENSE) ![dependencies](https://img.shields.io/badge/dependencies-none-orange) ![Hits](https://hitcounter.pythonanywhere.com/count/tag.svg?url=https%3A%2F%2Fgithub.com%2Filluminator3%2FIntCache) [![](https://jitpack.io/v/illuminator3/IntCache.svg)](https://jitpack.io/#illuminator3/IntCache)

This is just a fun project of mine inspired by [this codegolf](https://codegolf.stackexchange.com/questions/28786/write-a-program-that-makes-2-2-5/28818).

## Building

Building the project is really easy. First you'll have to clone the repository: ``git clone https://github.com/illuminator3/IntCache`` after that's done building the project can be done by running ``gradle build ``.

## Dependency installation

### Maven

Add the jitpack repository:

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

Find the correct commit version (e.g. 7c52229960) (can also be found [here](https://jitpack.io/#illuminator3/IntCache)). Use it as the dependency version:

```xml
<dependency>
    <groupId>com.github.illuminator3</groupId>
    <artifactId>IntCache</artifactId>
    <version>[version]</version>
</dependency>
```

---

### Gradle
Register the jitpack repository:

```groovy
maven { url 'https://jitpack.io' }
```

Find the version [here](https://jitpack.io/#illuminator3/IntCache) and add the dependency:

```groovy
implementation 'com.github.illuminator3:IntCache:<version>'
```

## Contribution

You can contribute by creating an [issue](https://github.com/illuminator3/IntCache/issues/new) or [pull request](https://github.com/illuminator3/IntCache/compare). Please keep the code clean and readable. All contributed code must be in the already present code format.

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](https://github.com/illuminator3/IntCache/blob/master/LICENSE) file for details
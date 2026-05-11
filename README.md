# Flex Checkout Android SDK

## Installation

Add JitPack to your `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

Then add the dependency to your `build.gradle.kts`:

```kotlin
dependencies {
    implementation("com.github.flexapp:flex-checkout-android:1.1.1")
}
```

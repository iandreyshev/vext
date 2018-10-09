# View extensions
[![](https://jitpack.io/v/iandreyshev/Vext.svg)](https://jitpack.io/#iandreyshev/Vext) [![license](https://img.shields.io/badge/license-MIT-blue.svg)](https://opensource.org/licenses/MIT)

Library with helper functions for UI layer in Android applications.
*Full **Kotlin** support (library based on extension functions)*

## Gradle Setup
Add jitpack.io repository in project level build.gradle:

```gradle
repositories {
    ...
    maven { url 'https://jitpack.io' }
}
```

Add the dependencies in module level build.gradle:

```gradle
dependencies {
    implementation "com.github.iandreyshev:vext:$vext_version"
}
```

## Code examples

### 1. Update single view visibility
```kotlin
textView.gone()
textView.visible()
textView.invisible()

textView.goneIf(true)
textView.goneIfOrVisible(true)
```
### 2. Update collections of view
```kotlin
visibleAll(textView, buttonView)
listOf(textView, buttonView).visibleAll()
```
### 3. Create LiveData objects
```kotlin
val myLiveData: LiveData<MyClass> = liveDataOf()
val myMutableLiveData: MutableLiveData<MyClass> = mutableLiveDataOf()

// You can create live data with default value
val myLiveData = liveDataOf(MyClass())
val myMutableLiveData = mutableLiveDataOf(MyClass())
```

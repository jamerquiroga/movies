object Releases {
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Config {
    const val applicationId = "com.jquiroga.movies"
}

object SdkVersions {
    const val compileSdk = 30
    const val minSdk = 23
    const val targetSdk = 30
}

object DebugSigning {
    const val keyAlias = "key.alias.debug"
    const val keyPassword = "key.password.debug"
    const val storeFile = "store.file.debug"
    const val storePassword = "store.password.debug"
}

object ReleaseSigning {
    const val keyAlias = "key.alias.release"
    const val keyPassword = "key.password.release"
    const val storeFile = "store.file.release"
    const val storePassword = "store.password.release"
}

object ToolsVersions {
    const val buildTools = "30.0.2"
}

object KotlinLibraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlinSerializationJson =
            "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinSerializationJson}"
}

object AndroidxLibraries {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val lifecycleViewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModel}"
    const val lifecycleExtensions =
            "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleExtensions}"
    const val activity = "androidx.activity:activity-ktx:${Versions.activity}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
}

object AndroidxTestLibraries {
    const val testExtJunit = "androidx.test.ext:junit:${Versions.testExtJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val navigationTest = "androidx.navigation:navigation-testing:${Versions.navigation}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit}"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesTest}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val kluent = "org.amshove.kluent:kluent-android:${Versions.kluent}"
}

object Google {
    const val material = "com.google.android.material:material:${Versions.material}"
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
}

object GradleDependencies {
    const val buildGradle = "com.android.tools.build:gradle:${Versions.buildGradle}"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinSerialization =
            "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlinSerialization}"
    const val hiltGradle = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
}

object NetworkLibraries {
    const val kotlinSerializationConverter =
            "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.kotlinSerializationConverter}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val loggingInterceptor =
            "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
}

object JavaLibraries {
    const val javaInject = "javax.inject:javax.inject:${Versions.javaInject}"
}

object Glide {
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
}

object Versions {
    const val kotlin = "1.4.31"
    const val coreKtx = "1.5.0"
    const val appCompat = "1.3.0"
    const val constraintLayout = "2.0.4"
    const val testExtJunit = "1.1.2"
    const val espressoCore = "3.3.0"
    const val junit = "4.+"
    const val material = "1.3.0"
    const val buildGradle = "4.1.1"
    const val kotlinSerialization = "1.4.31"
    const val kotlinSerializationJson = "1.2.1"
    const val kotlinSerializationConverter = "0.8.0"
    const val retrofit = "2.9.0"
    const val loggingInterceptor = "4.9.1"
    const val lifecycleViewModel = "2.3.1"
    const val lifecycleExtensions = "2.2.0"
    const val hilt = "2.35"
    const val javaInject = "1"
    const val activity = "1.2.3"
    const val glide = "4.12.0"
    const val coroutinesTest = "1.3.5"
    const val mockk = "1.9.3"
    const val kluent = "1.61"
    const val navigation = "2.3.5"
}
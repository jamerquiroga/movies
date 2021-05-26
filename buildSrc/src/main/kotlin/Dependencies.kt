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

object ToolsVersions {
    const val buildTools = "30.0.2"
}

object KotlinLibraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
}

object AndroidxLibraries {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
}

object AndroidxTestLibraries {
    const val testExtJunit = "androidx.test.ext:junit:${Versions.testExtJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit}"
}

object Google {
    const val material = "com.google.android.material:material:${Versions.material}"
}

object GradleDependencies {
    const val buildGradle = "com.android.tools.build:gradle:${Versions.buildGradle}"
    val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
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
}
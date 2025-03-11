plugins {
    id("com.android.library")
}

android {
    namespace = "com.stericson.RootTools"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        targetSdk = 34
        version = project.version.toString()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.github.Stericson:RootShell:1.6")
}

plugins {
    id("com.android.library")
    id("maven-publish")
}

group = "com.stericson"
version = "1.0.0"

android {
    namespace = "com.stericson.RootTools"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        targetSdk = 34
        version = project.version.toString()
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            consumerProguardFiles("proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
    }

    publishing {
        singleVariant("release")
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.github.naveensingh:RootShell:bc7e5d398e")
}

publishing.publications {
    create<MavenPublication>("release") {
        afterEvaluate {
            from(components["release"])
        }
    }
}

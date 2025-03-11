plugins {
    id("com.android.library") version "8.6.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.25" apply false
}

tasks.register<Delete>("clean") {
    delete(layout.buildDirectory)
}

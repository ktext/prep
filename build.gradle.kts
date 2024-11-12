import buildscripts.spotlessInKotlin

allprojects {
    group = "io.github.ktext.prep"

    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
}

subprojects {
    spotlessInKotlin()
}

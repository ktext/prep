plugins {
    `kotlin-dsl-base`
    alias(libs.plugins.spotless)
}

dependencies { implementation(libs.spotless.plugin.gradle) }

repositories {
    google()
    mavenCentral()
}

spotless {
    kotlin {
        ktfmt().googleStyle().configure {
            it.setBlockIndent(4)
            it.setContinuationIndent(4)
        }
    }

    kotlinGradle {
        target("*.gradle.kts")
        ktfmt().googleStyle().configure {
            it.setBlockIndent(4)
            it.setContinuationIndent(4)
        }
    }
}

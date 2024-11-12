import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    alias(libs.plugins.kotlin.plugin.serialization)
    id(libs.plugins.kotlin.multiplatform.get().pluginId)
}

val javaVersion = libs.versions.java.get().toInt()

kotlin {
    @OptIn(ExperimentalKotlinGradlePluginApi::class)
    compilerOptions { freeCompilerArgs.add("-Xexpect-actual-classes") }

    jvm()

    sourceSets {
        commonMain.dependencies { implementation(libs.kotlinx.serialization.core) }
        commonTest.dependencies {}
    }

    jvmToolchain { languageVersion.set(JavaLanguageVersion.of(javaVersion)) }
}

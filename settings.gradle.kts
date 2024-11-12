rootProject.name = "prep"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(
    ":prep-core",
)

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

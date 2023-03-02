listOf(pluginManagement.repositories, dependencyResolutionManagement.repositories).forEach {
    it.apply {
        maven {
            url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
        }
        mavenCentral()
    }
}

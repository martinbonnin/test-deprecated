import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm").version("1.8.20-RC-243")
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
    }
}

java.toolchain.languageVersion.set(JavaLanguageVersion.of(17))
tasks.withType<JavaCompile> {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
}
tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        allWarningsAsErrors = true
    }
}
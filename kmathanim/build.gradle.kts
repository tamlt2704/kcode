import sun.jvmstat.monitor.MonitoredVmUtil.mainClass

plugins {
    kotlin("jvm") version "2.3.0"
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenCentral()
    maven { url = uri("https://repo1.maven.org/maven2") }
    maven { url = uri("https://mvnrepository.com/repos/central") }
    maven { url = uri("https://maven.dcm4che.org") }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.davidgutierrezrubio:JMathAnim:0.9.12")
    implementation("xuggle:xuggle-xuggler:5.4")
    implementation("org.openjfx:javafx-base:17.0.2")
    implementation("org.openjfx:javafx-controls:17.0.2")
    implementation("org.openjfx:javafx-fxml:17.0.2")
    implementation("org.openjfx:javafx-swing:17.0.2")
}

application {
    mainClass.set("MainKt")
}

javafx {
    version = "17.0.2"
    modules = listOf("javafx.controls", "javafx.fxml", "javafx.swing", "javafx.graphics", "javafx.base")
}

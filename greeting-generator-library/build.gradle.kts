java.sourceCompatibility = JavaVersion.VERSION_11

plugins {
    kotlin("jvm") version "1.6.20"
}

group "greeting"
version "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}
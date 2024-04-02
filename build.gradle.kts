plugins {
    id("java")
}

group = "dev.evokerking"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.javacord:javacord:3.8.0")
}

tasks.test {
    useJUnitPlatform()
}
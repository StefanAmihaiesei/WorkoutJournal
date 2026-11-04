plugins {
    java
    id("org.springframework.boot") version "4.1.2"
}
group = "ro.stefan"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

repositories {
    mavenCentral()
}
dependencies {
    implementation(platform(
        "org.springframework.boot:spring-boot-dependencies:4.1.2"
    ))

    implementation("org.springframework.boot:spring-boot-starter-webmvc")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("org.postgresql:postgresql")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
tasks.test {
    useJUnitPlatform()
}
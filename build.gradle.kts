import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.serialization") version "1.6.21"
}

group = "gr.draive"
version = "0.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.grpc:grpc-kotlin-stub:1.3.0")
    implementation("com.ensarsarajcic.kotlinx:serialization-msgpack:0.5.1")

    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

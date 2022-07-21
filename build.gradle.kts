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
    // https://github.com/stampery/msgpack-rpc-java
    implementation("com.github.stampery:stampery-client:1.0")
    // https://mvnrepository.com/artifact/io.grpc/grpc-netty
    implementation("io.grpc:grpc-netty:1.48.0")


    testImplementation(kotlin("test"))
    // https://mvnrepository.com/artifact/org.mockito/mockito-core
    testImplementation("org.mockito:mockito-core:4.6.1")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val consul_version: String by project
val kotlinx_json_version: String by project

plugins {
    application
    kotlin("jvm") version "1.6.10"
}

group = "org.openmbee.mms5.plugins"
version = "0.0.1"

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-auth:$ktor_version")
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("com.orbitz.consul:consul-client:$consul_version")
    implementation("io.ktor:ktor-jackson:1.6.7")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinx_json_version")


    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}

plugins {
    base
    `build-scan`
    kotlin("jvm") version "1.2.31"
}

buildScan {
    setLicenseAgreementUrl("https://gradle.com/terms-of-service")
    setLicenseAgree("yes")
    publishAlways()
}

buildscript {
    // dokka requires a repository from which to download dokka-fatjar on demand
    configure(listOf(repositories, project.repositories)) {
        jcenter()
        maven { url = uri("http://maven.aliyun.com/nexus/content/groups/public/") }
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
    }
}

repositories {
    mavenLocal()
    maven { url = uri("http://maven.aliyun.com/nexus/content/groups/public/") }
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib", "1.2.31")) //   dependency "org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.31"
    testImplementation("junit:junit:4.12")
}


plugins {
    java
    `java-library`
    `maven-publish`
    signing
    id("io.github.boolivar.sonatype-portal-publish") version "0.1.0"
}

group = "de.xjustizcore.io"
// Prioritize PROJECT_VERSION env var, otherwise keep existing (e.g. from -Pversion), otherwise default
version = System.getenv("PROJECT_VERSION") ?: if (version == "unspecified") "0.0.1-SNAPSHOT" else version

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
    withJavadocJar()
    withSourcesJar()
}

repositories {
    mavenCentral()
}

dependencies {
    // Jackson for JSON serialization
    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.0")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.17.0")
    
    // Jackson XML for XML serialization
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.17.0")
    
    // Jakarta XML Binding (JAXB) API for XML annotations
    implementation("jakarta.xml.bind:jakarta.xml.bind-api:4.0.2")
    runtimeOnly("org.glassfish.jaxb:jaxb-runtime:4.0.5")
    
    // Bean Validation
    implementation("jakarta.validation:jakarta.validation-api:3.1.0")
    
    // Nullable annotations
    implementation("org.jetbrains:annotations:24.1.0")
    
    // Testing
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            
            groupId = "de.xjustizcore.io"
            artifactId = "xjustiz-core"
            
            pom {
                name.set("X.Justiz Core")
                description.set("Java SDK for X.Justiz Core document transmission messages")
                url.set("https://github.com/l-pagel/X.Justiz.Core")
                
                licenses {
                    license {
                        name = "MIT License"
                        url = "https://opensource.org/licenses/MIT"
                    }
                }
                
                developers {
                    developer {
                        id.set("l-pagel")
                        name.set("Lukas M. Pagel")
                    }
                }
                
                scm {
                    connection.set("scm:git:https://github.com/l-pagel/X.Justiz.Core.git")
                    developerConnection.set("scm:git:ssh://git@github.com/l-pagel/X.Justiz.Core.git")
                    url.set("https://github.com/l-pagel/X.Justiz.Core")
                }
            }
        }
    }
// Repository for Central Portal is handled by dev.lukebemish.central-portal-publishing plugin
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/l-pagel/X.Justiz.Core")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

// Map environment variables to project properties expected by the plugin
ext {
    set("sonatypeMavenCentralUser", System.getenv("OSSRH_USERNAME"))
    set("sonatypeMavenCentralPassword", System.getenv("OSSRH_PASSWORD"))
}

sonatypePublish {
    autoPublish = true
}

signing {
    val signingKey = System.getenv("GPG_PRIVATE_KEY")
    val signingPassword = System.getenv("GPG_PASSPHRASE")
    useInMemoryPgpKeys(signingKey, signingPassword)
    sign(publishing.publications["maven"])
}

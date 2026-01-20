plugins {
    java
    `java-library`
    `maven-publish`
}

group = "io.github.l-pagel"
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
            
            groupId = "io.github.l-pagel"
            artifactId = "xjustiz-core"
            
            pom {
                name = "X.Justiz Core"
                description = "Java SDK for X.Justiz Core document transmission messages"
                url = "https://github.com/l-pagel/X.Justiz.Core"
                
                licenses {
                    license {
                        name = "MIT License"
                        url = "https://opensource.org/licenses/MIT"
                    }
                }
                
                developers {
                    developer {
                        id = "l-pagel"
                        name = "Lukas M. Pagel"
                    }
                }
                
                scm {
                    connection = "scm:git:git://github.com/l-pagel/X.Justiz.Core.git"
                    developerConnection = "scm:git:ssh://github.com/l-pagel/X.Justiz.Core.git"
                    url = "https://github.com/l-pagel/X.Justiz.Core"
                }
            }
        }
    }
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

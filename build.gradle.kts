plugins {
    id("java")
}

group = "com.lunarplugins.ojvzinn"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.codemc.org/repository/nms/")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.spigotmc:spigot:1.8.8-R0.1-SNAPSHOT")
    implementation("org.projectlombok:lombok:1.18.26")
    implementation("com.zaxxer:HikariCP:4.0.3")
}

tasks.test {
    useJUnitPlatform()
}

tasks.compileJava {
    options.encoding = "UTF-8"
    version = "1.8"
    base.archivesName.set("LunarPunish")
}

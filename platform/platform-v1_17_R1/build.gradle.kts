dependencies {
    api(project(":scoreboard-api"))
    compileOnly("org.spigotmc:spigot:1.17.1-R0.1-SNAPSHOT")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(16))
    }
}
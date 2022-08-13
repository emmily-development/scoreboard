dependencies {
    api(project(":api"))
    compileOnly("org.spigotmc:spigot:1.18.2-R0.1-20220710.051346-15")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
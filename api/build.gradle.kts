dependencies {
    api("org.jetbrains:annotations:22.0.0")
    api("team.unnamed:commons-validation:3.1.0")
    api("team.unnamed:commons-bukkit:3.1.0")
    api(project(":scoreboard-platform-v1_8_R3"))

    sequenceOf(
        "1_8_R3", "1_16_R3",
        "1_17_R1", "1_18_R2"
    ).forEach {
        runtimeOnly(project(":scoreboard-platform-v$it"))
    }

    compileOnly("org.spigotmc:spigot:1.8.8-R0.1-SNAPSHOT")
}
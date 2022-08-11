rootProject.name = "scoreboard"

include("api")
project(":api").name = "scoreboard-api"

// platforms
sequenceOf(
    "1_8_R3", "1_16_R3",
    "1_17_R1", "1_18_R2"
).forEach {
    val projectPath = ":platform:platform-v$it"

    include(projectPath)
    project(projectPath).name = "scoreboard-platform-$it"
}

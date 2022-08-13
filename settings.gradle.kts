rootProject.name = "scoreboard"

include("api")
project(":api").name = "scoreboard-api"

// platforms
sequenceOf(
    "1_8_R3", "1_16_R3",
    "1_17_R1", "1_18_R2"
).forEach {
    val id = "scoreboard-platform-v$it"

    include(id)
    project(":$id").projectDir = file("platform/platform-v$it")
}
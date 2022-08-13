rootProject.name = "scoreboard"

include("api")

// platforms
sequenceOf(
    "1_8_R3", "1_16_R3",
    "1_17_R1", "1_18_R2"
).forEach {
    include("scoreboard-platform-v$it")
    project(":scoreboard-platform-v$it").projectDir = file("platform/platform-v$it")
}

fun includePrefixed(name: String) {
    val kebabName = name.replace(':', '-')
    val path = name.replace(':', '/')

    include("scoreboard-$kebabName")
    project(":scoreboard-$kebabName").projectDir = file(path)
}
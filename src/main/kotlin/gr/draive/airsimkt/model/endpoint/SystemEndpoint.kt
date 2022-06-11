package gr.draive.airsimkt.model.endpoint

enum class SystemEndpoint(val endpoint: String) {
    Ping("ping"),
    ServerVersion("getServerVersion"),

    Pause("simPause"),
    IsPaused("simIsPaused"),

    ContinueForTime("simContinueForTime"),
    ContinueForFrames("simContinueForFrames"),

    PrintLogMessage("simPrintLogMessage")
}

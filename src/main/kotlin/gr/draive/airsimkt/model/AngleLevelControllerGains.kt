package gr.draive.airsimkt.model

data class AngleLevelControllerGains(
    val rollGains: PIDGains,
    val pitchGains: PIDGains,
    val yawGains: PIDGains
)

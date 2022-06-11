package gr.draive.airsimkt.model

data class AngleRateControllerGains(
    val rollGains: PIDGains,
    val pitchGains: PIDGains,
    val yawGains: PIDGains
)

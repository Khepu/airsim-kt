package gr.draive.airsimkt.model

data class PositionControllerGains(
    val xGains: PIDGains,
    val yGains: PIDGains,
    val zGains: PIDGains
)
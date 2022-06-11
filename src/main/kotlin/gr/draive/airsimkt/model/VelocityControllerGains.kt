package gr.draive.airsimkt.model

data class VelocityControllerGains(
    val xGains: PIDGains,
    val yGains: PIDGains,
    val zGains: PIDGains
)

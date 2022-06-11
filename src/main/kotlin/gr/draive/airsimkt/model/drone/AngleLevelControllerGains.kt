package gr.draive.airsimkt.model.drone

import gr.draive.airsimkt.model.PIDGains

data class AngleLevelControllerGains(
    val rollGains: PIDGains,
    val pitchGains: PIDGains,
    val yawGains: PIDGains
)

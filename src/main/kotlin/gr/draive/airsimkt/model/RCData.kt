package gr.draive.airsimkt.model

data class RCData(
    val timestamp: Long,
    val yaw: Double,
    val pitch: Double,
    val roll: Double,
    val throttle: Double,
    val switch1: Double,
    val switch2: Double,
    val switch3: Double,
    val switch4: Double,
    val switch5: Double,
    val switch6: Double,
    val switch7: Double,
    val switch8: Double,
    val isInitialized: Boolean,
    val isValid: Boolean
)

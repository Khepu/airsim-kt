package gr.draive.airsimkt.model.car

data class CarControls(
    val throttle: Double,
    val steering: Double,
    val brake: Double,
    val isManualGear: Int,
    val gearImmediate: Boolean
)

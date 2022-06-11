package gr.draive.airsimkt.model

data class PIDGains(
    val kp: Double, // Proportional Gain
    val ki: Double, // Integrator Gain
    val kd: Double // Derivative Gain
)

package gr.draive.airsimkt.model.sensor

import gr.draive.airsimkt.model.math.Quaternion
import gr.draive.airsimkt.model.math.Vector3

data class BarometerData(
    val timestamp: Long,
    val altitude: Quaternion,
    val pressure: Vector3,
    val qnh: Vector3
)

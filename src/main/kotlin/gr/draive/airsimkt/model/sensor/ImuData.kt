package gr.draive.airsimkt.model.sensor

import gr.draive.airsimkt.model.math.Quaternion
import gr.draive.airsimkt.model.math.Vector3

data class ImuData(
    val timestamp: Long,
    val orientation: Quaternion,
    val angularVelocity: Vector3,
    val linearAcceleration: Vector3
)

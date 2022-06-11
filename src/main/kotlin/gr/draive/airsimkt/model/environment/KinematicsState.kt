package gr.draive.airsimkt.model.environment

import gr.draive.airsimkt.model.math.Quaternion
import gr.draive.airsimkt.model.math.Vector3

data class KinematicsState(
    val position: Vector3,
    val orientation: Quaternion,
    val linearVelocity: Vector3,
    val angularVelocity: Vector3,
    val linearAcceleration: Vector3,
    val angularAcceleration: Vector3
)

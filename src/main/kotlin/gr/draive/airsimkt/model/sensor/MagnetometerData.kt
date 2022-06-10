package gr.draive.airsimkt.model.sensor

import gr.draive.airsimkt.model.math.Vector3

data class MagnetometerData(
    val timestamp: Long,
    val magneticFieldBody: Vector3,
    val magneticFieldCovariance: Double
)

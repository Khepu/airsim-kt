package gr.draive.airsimkt.model.environment

import gr.draive.airsimkt.model.math.Vector3

data class EnvironmentState(
    val position: Vector3,
    val geoPoint: GeoPoint,
    val gravity: Vector3,
    val airPressure: Double,
    val temperature: Double,
    val airDensity: Double
)

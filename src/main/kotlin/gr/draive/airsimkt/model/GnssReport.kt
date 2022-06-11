package gr.draive.airsimkt.model

import gr.draive.airsimkt.model.environment.GeoPoint
import gr.draive.airsimkt.model.math.Vector3

data class GnssReport(
    val geoPoint: GeoPoint,
    val eph: Double,
    val epv: Double,
    val velocity: Vector3,
    val fixType: GnssFixType,
    val timeUtc: Long
)

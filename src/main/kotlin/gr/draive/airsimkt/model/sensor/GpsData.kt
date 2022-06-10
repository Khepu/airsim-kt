package gr.draive.airsimkt.model.sensor

import gr.draive.airsimkt.model.GnssReport

data class GpsData(
    val timeStamp: Long,
    val gnss: GnssReport,
    val isValid: Boolean
)

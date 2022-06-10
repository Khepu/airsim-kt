package gr.draive.airsimkt.model.sensor

import gr.draive.airsimkt.model.Pose

data class DistanceSensorData(
    val timeStamp: Long,
    val distance: Double,
    val minDistance: Double,
    val maxDistance: Double,
    val relativePose: Pose
)

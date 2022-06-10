package gr.draive.airsimkt.model.sensor

import gr.draive.airsimkt.model.Pose

data class LidarData(
    val pointCould: Double,
    val timestamp: Long,
    val pose: Pose,
    val segmentation: Int
)

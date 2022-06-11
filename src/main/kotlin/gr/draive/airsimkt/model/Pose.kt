package gr.draive.airsimkt.model

import gr.draive.airsimkt.model.math.Quaternion
import gr.draive.airsimkt.model.math.Vector3

data class Pose(
    val position: Vector3,
    val orientation: Quaternion
)

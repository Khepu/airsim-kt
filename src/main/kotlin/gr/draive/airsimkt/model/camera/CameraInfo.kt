package gr.draive.airsimkt.model.camera

import gr.draive.airsimkt.model.Pose
import gr.draive.airsimkt.model.math.ProjectionMatrix

data class CameraInfo(
    val pose: Pose,
    val fov: Int,
    val projMath: ProjectionMatrix
)

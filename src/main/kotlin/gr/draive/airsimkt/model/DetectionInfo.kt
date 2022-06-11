package gr.draive.airsimkt.model

import gr.draive.airsimkt.model.environment.GeoPoint
import gr.draive.airsimkt.model.math.Box2D
import gr.draive.airsimkt.model.math.Box3D

data class DetectionInfo(
    val name: String,
    val geoPoint: GeoPoint,
    val box2D: Box2D,
    val box3D: Box3D,
    val relativePose: Pose
)

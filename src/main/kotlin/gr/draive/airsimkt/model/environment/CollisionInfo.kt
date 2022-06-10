package gr.draive.airsimkt.model.environment

import gr.draive.airsimkt.model.math.Vector3

data class CollisionInfo(
    val hasCollided: Boolean,
    val normal: Vector3,
    val impactPoint: Vector3,
    val position: Vector3,
    val penetrationDepth: Double,
    val timestamp: Double,
    val objectName: String,
    val objectId: Int
)

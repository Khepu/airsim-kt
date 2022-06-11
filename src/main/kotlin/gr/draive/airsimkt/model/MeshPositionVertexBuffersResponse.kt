package gr.draive.airsimkt.model

import gr.draive.airsimkt.model.math.Quaternion
import gr.draive.airsimkt.model.math.Vector3

data class MeshPositionVertexBuffersResponse(
    val position: Vector3,
    val orientation: Quaternion,
    val vertices: Double,
    val indices: Double,
    val name: String
)

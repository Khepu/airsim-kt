package gr.draive.airsimkt.model.camera

import gr.draive.airsimkt.model.math.Quaternion
import gr.draive.airsimkt.model.math.Vector3

data class ImageResponse(
    val imageDataUint8: Byte,
    val imageDataFloat: Double,
    val cameraPosition: Vector3,
    val cameraOrientation: Quaternion,
    val timeStamp: Long,
    val message: String,
    val pixelsAsFloat: Double,
    val compress: Boolean,
    val width: Int,
    val height: Int,
    val imageType: ImageType
)

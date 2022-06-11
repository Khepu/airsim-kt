package gr.draive.airsimkt.model.camera

data class ImageRequest(
    val cameraName: String,
    val imageType: ImageType,
    val pixelsAsFloat: Boolean,
    val compress: Boolean
)

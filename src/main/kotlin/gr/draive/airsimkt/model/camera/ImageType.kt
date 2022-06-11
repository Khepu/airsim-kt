package gr.draive.airsimkt.model.camera

enum class ImageType(val type: Int) {
    Scene(0),
    DepthPlanar(1),
    DepthPerspective(2),
    DepthVis(3),
    DisparityNormalized(4),
    Segmentation(5),
    SurfaceNormals(6),
    Infrared(7),
    OpticalFlow(8),
    OpticalFlowVis(9)
}

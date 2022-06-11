package gr.draive.airsimkt.model.endpoint

enum class CameraEndpoint(val endpoint: String) {
    GetImage("simGetImage"),
    GetLensSettings("simGetLensSettings"),

    GetPresetLensSettings("simGetPresetLensSettings"),
    SetPresetLensSettings("simSetPresetLensSettings"),

    GetPresetFilmbackSettings("simGetPresetFilmbackSettings"),
    SetPresetFilmbackSettings("simSetPresetFilmbackSettings"),

    GetFilmbackSettings("simGetFilmbackSettings"),
    SetFilmbackSettings("simSetFilmbackSettings"),

    GetFocalLength("simGetFocalLength"),
    SetFocalLength("simSetFocalLength"),

    GetFocusDistance("simGetFocusDistance"),
    SetFocusDistance("simSetFocusDistance"),

    GetFocusAperture("GetFocusAperture"),
    SetFocusAperture("SetFocusAperture"),

    GetDistortionParams("simGetDistortionParams"),
    SetDistortionParams("simSetDistortionParams"),

    SetDistortionParam("simSetDistortionParam"),

    SetCameraFov("simSetCameraFov"),
    SetCameraPose("simSetCameraPose"),

    GetCurrentFieldOfView("simGetCurrentFieldOfView"),

    EnableFocusPlane("simEnableFocusPlane"),
    EnableManualFocus("simEnableManualFocus"),
}

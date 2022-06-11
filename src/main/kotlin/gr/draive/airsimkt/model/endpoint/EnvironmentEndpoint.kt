package gr.draive.airsimkt.model.endpoint

enum class EnvironmentEndpoint(val endpoint: String) {
    SetTimeOfDay("simSetTimeOfDay"),
    SetLightIntensity("simSetLightIntensity"),

    EnableWeather("simEnableWeather"),
    SetWeatherParameter("simSetWeatherParameter"),

    SetWind("simSetWind"),

    GetSegmentationObjectID("simGetSegmentationObjectID"),
    SetSegmentationObjectID("simSetSegmentationObjectID"),

    AddDetectionFilterMeshName("simAddDetectionFilterMeshName"),

    SetDetectionFilterRadius("simSetDetectionFilterRadius"),

    ClearDetectionMeshNames("simClearDetectionMeshNames"),

    GetCameraInfo("simGetCameraInfo"),

    GetDetections("simGetDetections"),

    GetWorldExtents("simGetWorldExtents"),
    GetObjectScale("simGetObjectScale"),
    ListSceneObjects("simListSceneObjects"),
    RunConsoleCommand("simRunConsoleCommand"), // RCE, should be restricted...
    LoadLevel("simLoadLevel"),
    ListAssets("simListAssets"),

    SpawnObject("simSpawnObject"),
    DestroyObject("simDestroyObject"),
    GetMeshPositionVertexBuffers("simGetMeshPositionVertexBuffers"),

    SetTraceLine("simSetTraceLine"),
    SetObjectPose("simSetObjectPose"),

    CreateVoxelGrid("simCreateVoxelGrid"),

    AddVehicle("simAddVehicle"),
    ListVehicles("listVehicles"),

    SettingsString("getSettingsString"),

    SwapTextures("simSwapTextures"),
    SetObjectMaterial("simSetObjectMaterial"),
    SetObjectMaterialFromTexture("simSetObjectMaterialFromTexture")
}

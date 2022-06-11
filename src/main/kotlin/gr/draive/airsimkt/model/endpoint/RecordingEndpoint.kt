package gr.draive.airsimkt.model.endpoint

enum class RecordingEndpoint(val endpoint: String) {
    StartRecording("startRecording"),
    StopRecording("stopRecording"),
    IsRecording("isRecording"),
}
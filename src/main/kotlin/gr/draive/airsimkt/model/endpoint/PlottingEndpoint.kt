package gr.draive.airsimkt.model.endpoint

enum class PlottingEndpoint(val endpoint: String) {
    FlushPersistentMarkers("simFlushPersistentMarkers"),
    PlotPoints("simPlotPoints"),
    PlotLineStrip("simPlotLineStrip"),
    PlotLineList("simPlotLineList"),
    PlotArrows("simPlotArrows"),
    PlotStrings("simPlotStrings"),
    PlotTransforms("simPlotTransforms"),
    PlotTransformsWithNames("simPlotTransformsWithNames")
}

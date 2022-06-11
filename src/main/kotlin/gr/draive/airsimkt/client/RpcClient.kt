package gr.draive.airsimkt.client

import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder

fun createRpcClient(ipAddress: String, port: Int): ManagedChannel =
    ManagedChannelBuilder
        .forAddress(ipAddress, port)
        .build()

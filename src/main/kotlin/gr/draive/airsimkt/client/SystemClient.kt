package gr.draive.airsimkt.client

import io.grpc.CallOptions
import io.grpc.ManagedChannel
import io.grpc.MethodDescriptor
import io.grpc.MethodDescriptor.MethodType.UNARY

class SystemClient(
    private val rpcClient: ManagedChannel
) {

    fun ping() =
        rpcClient.newCall(
            MethodDescriptor
                .newBuilder<String, Boolean>()
                .setFullMethodName("ping")
                .setType(UNARY)
                .build(),
            CallOptions.DEFAULT)
}
package groovyx.gpars.samples.remote.dataflow.example

import groovyx.gpars.dataflow.remote.RemoteDataflows
import groovyx.gpars.remote.netty.NettyTransportProvider

def HOST = "localhost"
def PORT = 9009

def var = RemoteDataflows.get HOST, PORT, "example-var" get()

println "var=${var.val}"

NettyTransportProvider.stopClients()
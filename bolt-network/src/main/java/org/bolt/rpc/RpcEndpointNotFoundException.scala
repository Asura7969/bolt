package org.bolt.rpc

import org.bolt.RpcException

private[rpc] class RpcEndpointNotFoundException (uri: String)
  extends RpcException(s"Cannot find endpoint: $uri")

package org.bolt.rpc

private[rpc] class RpcEnvStoppedException()
  extends IllegalStateException("RpcEnv already stopped.")

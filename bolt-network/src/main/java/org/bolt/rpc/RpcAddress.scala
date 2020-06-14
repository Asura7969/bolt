package org.bolt.rpc

import org.bolt.util.Utils

/**
 * Address for an RPC environment, with hostname and port.
 */
case class RpcAddress(host: String, port: Int){
  def hostPort: String = host + ":" + port

  /** Returns a string in the form of "bolt://host:port". */
  def toBoltURL: String = "spark://" + hostPort

  override def toString: String = hostPort
}

object RpcAddress {

  /** Return the [[RpcAddress]] represented by `uri`. */
  def fromURIString(uri: String): RpcAddress = {
    val uriObj = new java.net.URI(uri)
    RpcAddress(uriObj.getHost, uriObj.getPort)
  }

  /** Returns the [[RpcAddress]] encoded in the form of "bolt://host:port" */
  def fromBoltURL(boltUrl: String): RpcAddress = {
    val (host, port) = Utils.extractHostPortFromBoltUrl(boltUrl)
    RpcAddress(host, port)
  }
}
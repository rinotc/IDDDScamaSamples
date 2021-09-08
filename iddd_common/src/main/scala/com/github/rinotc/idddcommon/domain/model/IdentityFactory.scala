package com.github.rinotc.idddcommon.domain.model

trait IdentityFactory[ID <: Identity[_]] {
  def generate: ID
}

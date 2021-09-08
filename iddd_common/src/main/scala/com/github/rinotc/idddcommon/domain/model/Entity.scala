package com.github.rinotc.idddcommon.domain.model

trait Entity[ID <: Identity[_]] {
  val id: ID
}

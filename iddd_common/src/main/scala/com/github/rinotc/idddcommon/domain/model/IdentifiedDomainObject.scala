package com.github.rinotc.idddcommon.domain.model

trait IdentifiedDomainObject[ID <: Identity[_]] {
  val id: ID
}

package org.scalax.bindin.slick

import slick.ast.Node
import slick.compiler.CompilerState

trait MysqlDBProfile extends DBProfile {

  import slick.jdbc.MySQLProfile.api._

  override def bindSqlUtilsComponent: BindSqlUtilsComponent                            = BindSqlUtilsComponentHelper.helper
  override def bindCreateQueryBuilder(n: Node, state: CompilerState): BindQueryBuilder = BindQueryBuilderHelper.helper(state)
  override def bindCapabilities: BindCapabilities                                      = BindCapabilitiesHelper.helper

}

object MysqlDBProfile extends MysqlDBProfile {

  override val bindSqlUtilsComponent: BindSqlUtilsComponent = super.bindSqlUtilsComponent
  override val bindCapabilities: BindCapabilities           = super.bindCapabilities

}
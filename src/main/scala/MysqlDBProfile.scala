package org.scalax.binding.slick

import slick.ast.Node
import slick.compiler.CompilerState

trait MysqlDBProfile extends DBProfile {

  import slick.jdbc.MySQLProfile.api._

  override def bindSqlUtilsComponent: BindSqlUtilsComponent                                       = BindSqlUtilsComponentHelper.helper
  override def bindCreateQueryBuilder(n: Node, state: CompilerState): BindQueryBuilder            = BindQueryBuilderHelper.helper(state)
  override def bindCapabilities: BindCapabilities                                                 = BindCapabilitiesHelper.helper
  override def bindJdbcModelComponent: BindJdbcModelComponent                                     = BindJdbcModelComponentHelper.helper
  override def bindImplicitColumnTypes: BindImplicitColumnTypes                                   = BindImplicitColumnTypesHelper.helper
  override def bindJdbcImplicitColumnTypes: BindJdbcImplicitColumnTypes                           = BindJdbcImplicitColumnTypesHelper.helper
  override def bindJdbcTypes: BindJdbcTypes                                                       = BindJdbcTypesHelper.helper
  override def bindDeleteOrUpdateActionExtensionMethods: BindDeleteOrUpdateActionExtensionMethods = BindDeleteOrUpdateActionExtensionMethodsHelper.helper

}

object MysqlDBProfile extends MysqlDBProfile {

  override val bindSqlUtilsComponent: BindSqlUtilsComponent                                       = super.bindSqlUtilsComponent
  override val bindCapabilities: BindCapabilities                                                 = super.bindCapabilities
  override val bindJdbcModelComponent: BindJdbcModelComponent                                     = super.bindJdbcModelComponent
  override val bindImplicitColumnTypes: BindImplicitColumnTypes                                   = super.bindImplicitColumnTypes
  override val bindJdbcImplicitColumnTypes: BindJdbcImplicitColumnTypes                           = super.bindJdbcImplicitColumnTypes
  override val bindJdbcTypes: BindJdbcTypes                                                       = super.bindJdbcTypes
  override val bindDeleteOrUpdateActionExtensionMethods: BindDeleteOrUpdateActionExtensionMethods = super.bindDeleteOrUpdateActionExtensionMethods

}

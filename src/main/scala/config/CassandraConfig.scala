package config

import com.typesafe.config.ConfigFactory


trait CassandraConfig  {

  private val cassandraConf = ConfigFactory.load("application.conf")


  lazy val cassandraHost = cassandraConf.getString("cassandra.host")
  lazy val cassandraPort = cassandraConf.getString("cassandra.port").toInt
  lazy val cassandraUsername = cassandraConf.getString("cassandra.username")
  lazy val cassandraPassword = cassandraConf.getString("cassandra.password")

  lazy val userKeyspace = cassandraConf.getString("cassandra.userKeyspace")

}

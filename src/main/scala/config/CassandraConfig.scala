package config

import com.typesafe.config.ConfigFactory


trait CassandraConfig  {

  private val cassandraConf = ConfigFactory.load("application.conf")


  lazy val cassandraHost: String = cassandraConf.getString("cassandra.host")
  lazy val cassandraPort: Int = cassandraConf.getString("cassandra.port").toInt
  lazy val cassandraUsername: String = cassandraConf.getString("cassandra.username")
  lazy val cassandraPassword: String = cassandraConf.getString("cassandra.password")

  lazy val userKeyspace = cassandraConf.getString("cassandra.userKeyspace")

}

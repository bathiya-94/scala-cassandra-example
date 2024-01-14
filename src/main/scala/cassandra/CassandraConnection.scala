package cassandra

import com.datastax.driver.core.{Cluster, Session}
import config.CassandraConfig

trait CassandraConnection extends CassandraConfig {
  private lazy val cluster = Cluster.builder()
    .addContactPoint("")
    .withPort(cassandraPort)
    .withCredentials(cassandraPassword, cassandraUsername)
    .withoutMetrics()
    .build()

  lazy val session: Session = cluster.connect(userKeyspace)

}

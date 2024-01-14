package manager

import cassandra.CassandraConnection
import com.datastax.driver.mapping.MappingManager
import model.User

import java.util.UUID

class UserManager extends CassandraConnection {

  private lazy val manager = new MappingManager(session).mapper(classOf[User])

  def save(user: User): Unit = {
    manager.save(user)
  }

  def findById(id: UUID): User = {
    manager.get(id)
  }

  def removeById(user: User): Unit = {
    manager.delete(user)
  }

}

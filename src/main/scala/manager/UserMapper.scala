package manager

import cassandra.CassandraConnection
import com.datastax.driver.mapping.MappingManager
import model.User

import java.util.UUID

class UserMapper extends CassandraConnection {

  private lazy val mapper = new MappingManager(session).mapper(classOf[User])

  def save(user: User): Unit = {
    mapper.save(user)
  }

  def findById(id: UUID): User = {
    mapper.get(id)
  }

  def removeById(user: User): Unit = {
    mapper.delete(user)
  }
}
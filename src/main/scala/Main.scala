import manager.UserMapper
import model.User

import java.util.UUID

object Main {
  def main(args: Array[String]): Unit = {

    val uuid1 =  UUID.randomUUID()
    val uuid2 = UUID.randomUUID()

    val user1 = new User(uuid1, "abc", 5)

    val user2 = new User(uuid2, "xyz", 5)

    val userManager = new UserMapper

    // Create
    userManager.save(user1)
    userManager.save(user2)

    // Update
    user1.setName("kjl")
    userManager.save(user1)

    // Delete
    userManager.removeById(user2)

    // Read
    val user3 = userManager.findById(uuid1)
    println(s"Retrieved user: ${user3.toString}")
  }
}

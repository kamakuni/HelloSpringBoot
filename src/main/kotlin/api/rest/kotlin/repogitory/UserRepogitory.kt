package api.rest.kotlin.repogitory

import org.springframework.stereotype.Repository
import api.rest.kotlin.model.User
import org.springframework.data.repository.CrudRepository

@Repository
interface UserRepository : CrudRepository<User, Long> {

}
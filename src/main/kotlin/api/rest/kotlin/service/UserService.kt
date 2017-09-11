package api.rest.kotlin.service

import api.rest.kotlin.domain.User
import org.springframework.beans.factory.annotation.Autowired
import api.rest.kotlin.repogitory.UserRepository

open class UserService @Autowired constructor(private val userRepository: UserRepository) {
    fun findOne(id: Long): User = userRepository.findOne(id)
}
package api.rest.kotlin.service

import api.rest.kotlin.model.User
import org.springframework.beans.factory.annotation.Autowired
import api.rest.kotlin.repogitory.UserRepository
import org.springframework.stereotype.Service

@Service
open class UserService @Autowired constructor(private val userRepository: UserRepository) {
    fun findOne(id: Long): User = userRepository.findOne(id)
    fun save(user: User) = userRepository.save(user)
    fun delete(id: Long) = userRepository.delete(id)
}
package api.rest.kotlin.controller

import api.rest.kotlin.domain.User
import api.rest.kotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/users")
class UserController @Autowired constructor(private val userService: UserService) {

    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: Long): User {
        return userService.findOne(id)
    }

    @PostMapping
    fun post(@RequestBody user: User): User {
        return userService.save(user)
    }

    @PutMapping
    fun put(@RequestBody user: User): User {
        return userService.save(user)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long){
        return userService.delete(id)
    }

}
package api.rest.kotlin.controller

import api.rest.kotlin.domain.User
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/users")
class UserController //@Autowired constructor(private val userService: UserService) {
{
    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: Long): User {
        return User(id, "kensuke")
    }

    /*@PostMapping
    fun post(@RequestBody user: User) {

    }

    @PutMapping("/{id}")
    fun put() {

    }

    @DeleteMapping("/{id}")
    fun delete(){

    }*/
}
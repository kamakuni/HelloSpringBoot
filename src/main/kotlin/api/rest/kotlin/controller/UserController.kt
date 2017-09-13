package api.rest.kotlin.controller

import api.rest.kotlin.model.Error
import api.rest.kotlin.model.User
import api.rest.kotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/users")
class UserController @Autowired constructor(private val userService: UserService) {

    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: Long): User {
        return userService.findOne(id)
    }

    @PostMapping
    fun post(@RequestBody @Valid user: User): User {
        return userService.save(user)
    }

    @PutMapping
    fun put(@RequestBody @Valid user: User): User {
        return userService.save(user)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long){
        return userService.delete(id)
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun exceptionHandler(ex: MethodArgumentTypeMismatchException): Error{
        return Error("${HttpStatus.BAD_REQUEST}",
                "invalid path values",
                "${ex.message}")
    }

}
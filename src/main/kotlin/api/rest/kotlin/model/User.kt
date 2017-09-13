package api.rest.kotlin.model

import org.hibernate.validator.constraints.NotBlank
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name="users")
data class User(
        @Id
        @NotNull(message = "id must not be null")
        val id: Long = 0,
        @Column(nullable = false)
        @NotBlank(message = "name must not be null")
        val name: String = "")
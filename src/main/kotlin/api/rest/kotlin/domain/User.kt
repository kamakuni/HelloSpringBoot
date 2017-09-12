package api.rest.kotlin.domain

import javax.persistence.*

@Entity
@Table(name="users")
data class User(
        @Id
        val id: Long = 0,
        @Column(nullable = false)
        val name: String = "")
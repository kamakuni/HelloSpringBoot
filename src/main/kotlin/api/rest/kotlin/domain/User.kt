package api.rest.kotlin.domain

import javax.persistence.*

@Entity
@Table(name="users")
data class User(
        @Id @GeneratedValue
        val id: Long,
        @Column(nullable = false)
        val name: String)
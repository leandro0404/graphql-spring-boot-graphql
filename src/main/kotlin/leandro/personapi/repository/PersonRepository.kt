package leandro.personapi.repository

import leandro.personapi.model.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person,Long> {
}
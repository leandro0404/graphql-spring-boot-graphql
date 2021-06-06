package leandro.personapi.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Person(

    @Id  @GeneratedValue(strategy = GenerationType.AUTO) val id: Long? = null,
    var name: String,
    var age : Int,
    var gender: Gender
)
{

}

enum class Gender {
    MALE, FEMALE
}
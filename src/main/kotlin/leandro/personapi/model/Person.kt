package leandro.personapi.model

import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*

@Data
@NoArgsConstructor
@Entity
@Table(name = "person")
class Person(
    @field:Column(name = "Name") private val name: String,
    @field:Column(name = "Age") private val age: Int,
    gender: Gender
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long = 0

    @Enumerated(EnumType.STRING)
    @Column(name = "Gender")
    private val gender: Gender

    @OneToMany(mappedBy = "owner")
    private val documents: Collection<Document>? = null

    init {
        this.gender = gender
    }
}

enum class Gender {
    MALE, FEMALE
}
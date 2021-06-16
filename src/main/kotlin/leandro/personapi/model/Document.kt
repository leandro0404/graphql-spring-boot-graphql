package leandro.personapi.model

import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*

@Data
@NoArgsConstructor
@Entity
@Table(name = "document")
class Document(
    @field:Column(name = "Number") private val number: String, @field:Column(name = "Type") @field:Enumerated(
        EnumType.STRING
    ) private val type: DocumentType, @field:JoinColumn(
        name = "Person_Id",
        nullable = false
    ) @field:ManyToOne private val owner: Person
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null
}
enum class DocumentType{
    CPF, RG , PIS
}
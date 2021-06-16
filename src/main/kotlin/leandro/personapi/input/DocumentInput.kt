package leandro.personapi.input

import graphql.schema.GraphQLInputType
import leandro.personapi.model.DocumentType
import lombok.Getter
import lombok.Setter

@Getter
@Setter
class DocumentInput(number: String, type: DocumentType, ownerId: Long) : GraphQLInputType {
    override fun getName(): String {
        return number!!
    }

    var number = number
    var type = type
    var ownerId = ownerId


}
package leandro.personapi.input

import graphql.schema.GraphQLInputType
import leandro.personapi.model.Gender
import lombok.Getter
import lombok.Setter

@Getter
@Setter
class CreatePersonInput (name : String, age: Int , gender: Gender ) : GraphQLInputType {

    override fun getName(): String {
        return name
    }
    private var name = name
    var age = age
    var gender = gender

}
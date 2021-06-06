package leandro.personapi.resolver

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import leandro.personapi.input.CreatePersonInput
import leandro.personapi.model.Gender
import leandro.personapi.model.Person
import leandro.personapi.repository.PersonRepository
import org.springframework.stereotype.Component

@Component
class PersonResolver (private val  repository: PersonRepository) : GraphQLQueryResolver , GraphQLMutationResolver {

    fun findAllPeople () : Collection<Person> =  repository.findAll();

    fun findPersonById( id:Long) :Person = repository.findById(id).get();

    fun savePerson(person : CreatePersonInput): Person
    {
        var person =  Person(null,person.name, person.age ,person.gender);
        return repository.save(person);
    }
}
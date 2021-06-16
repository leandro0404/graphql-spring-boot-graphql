package leandro.personapi.resolver

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import leandro.personapi.input.DocumentInput
import leandro.personapi.model.Document
import leandro.personapi.repository.DocumentRepository
import leandro.personapi.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class DocumentResolver : GraphQLQueryResolver, GraphQLMutationResolver {
    @Autowired
    private val documentRepository: DocumentRepository? = null

    @Autowired
    private val personRepository: PersonRepository? = null
    fun saveDocument(input: DocumentInput): Document {
        val owner = personRepository!!.findById(input.ownerId).get()
        val document = Document(  input.number, input.type, owner)
        return documentRepository!!.save(document)
    }
}
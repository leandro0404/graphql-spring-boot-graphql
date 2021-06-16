package leandro.personapi.repository

import leandro.personapi.model.Document
import org.springframework.data.jpa.repository.JpaRepository

interface DocumentRepository : JpaRepository<Document,Long> {

}
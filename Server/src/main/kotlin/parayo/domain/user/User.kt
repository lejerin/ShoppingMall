package parayo.domain.user

import java.util.*
import javax.persistence.*

@Entity(name = "user")
class User (
    var email: String,
    var password: String,
    var name: String
){

    @Id
    @GeneratedValue()



}
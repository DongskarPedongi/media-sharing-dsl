package media.sharing.data.model

import javax.persistence.Entity
import javax.persistence.Table

@Entity @Table(name="votes")
class Vote {
    Integer media_id
    Integer user_id
    Integer value
}

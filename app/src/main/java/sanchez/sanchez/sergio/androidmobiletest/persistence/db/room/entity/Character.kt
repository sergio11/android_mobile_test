package sanchez.sanchez.sergio.androidmobiletest.persistence.db.room.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

/**
 * Character Entity Model
 */

@Entity(tableName = "characters")
data class CharacterEntity (
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Long,
    @NonNull
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "modified")
    val modified: Date? = null,
    @ColumnInfo(name = "thumbnail")
    @NonNull
    val thumbnail: String,
    @ColumnInfo(name = "comics")
    @NonNull
    val comics: Long,
    @ColumnInfo(name = "series")
    @NonNull
    val series: Long,
    @ColumnInfo(name = "events")
    @NonNull
    val events: Long
)

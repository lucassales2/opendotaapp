package lucassales2.com.github.data.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Match(@PrimaryKey @ColumnInfo(name = "id") val id: Long)
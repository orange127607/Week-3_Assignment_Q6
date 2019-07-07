package android.example.week3assignment.database

import android.provider.ContactsContract
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update

@Dao
interface ProfileDatabaseDao {

    @Insert
    fun insert(profile: ContactsContract.Profile)

    @Update
    fun update(profile: ContactsContract.Profile)
}
package id.ac.unhas.book

import androidx.lifecycle.LiveData
import androidx.room.*
import java.util.concurrent.Flow

@Dao
interface SubscriberDAO {
    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber): Long

    @Update
    suspend fun updateSubscriber(subscriber: Subscriber) : Int

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber) : Int

    @Query("delete from subscriber_data_table")
    suspend fun deleteAll(): Int

    @Query("select * from subscriber_data_table")
    fun getAllSUbscribers(): kotlinx.coroutines.flow.Flow<List<Subscriber>>
}
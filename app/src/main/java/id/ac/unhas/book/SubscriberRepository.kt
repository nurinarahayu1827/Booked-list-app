package id.ac.unhas.book

class SubscriberRepository(private val dao: SubscriberDAO) {
    val subscribers = dao.getAllSUbscribers()

    suspend fun insert(subscriber: Subscriber): Long{
        return dao.insertSubscriber(subscriber)
    }

    suspend fun update(subscriber: Subscriber): Int{
        return dao.updateSubscriber(subscriber)
    }

    suspend fun delete(subscriber: Subscriber): Int{
        return dao.deleteSubscriber(subscriber)
    }

    suspend fun deleteAll(): Int{
        return dao.deleteAll()
    }
}
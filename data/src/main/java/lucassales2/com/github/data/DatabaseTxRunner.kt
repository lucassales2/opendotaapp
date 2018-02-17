package lucassales2.com.github.data



class DatabaseTxRunner(private val db: OpenDotaDatabase) {
    fun runInTransaction(run: () -> Unit) = db.runInTransaction(run)
}
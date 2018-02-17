package lucassales2.com.github.data

interface Entry {
    val id: Long
}

interface PaginatedEntry : Entry {
    val page: Int
}
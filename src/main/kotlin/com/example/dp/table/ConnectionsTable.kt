package com.example.dp.table

import com.example.dp.utils.ConnectionFields
import com.example.dp.utils.TableNames
import org.jetbrains.exposed.sql.Table

object ConnectionsTable : Table(TableNames.Connection) {
    val user1 = varchar(ConnectionFields.user1, 80) references (UserTable.username)
    val user2 = varchar(ConnectionFields.user2, 80) references (UserTable.username)
    val time = datetime(ConnectionFields.time)
}

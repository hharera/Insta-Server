package com.example.db.table

import com.example.db.utils.CommentFields
import com.example.db.utils.TableNames
import org.jetbrains.exposed.sql.Table

object CommentTable : Table(TableNames.Comment) {
    val pid = integer(CommentFields.pid) references (PostTable.pid)
    val commentId = integer(CommentFields.commentId).primaryKey().autoIncrement()
    val username = varchar(CommentFields.username, 80) references (UserTable.username)
    val commentContent = varchar(CommentFields.commentContent, 120)
    val time = datetime(CommentFields.time)
}


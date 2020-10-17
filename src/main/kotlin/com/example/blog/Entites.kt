package com.example.blog

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.ManyToOne

// Marking a class as an entity means it will have the mapping of an SQLite table in the database.

@Entity
class Article(
        var title: String,
        var headline: String,
        var content: String,
        @ManyToOne var author: User,
        // Unsure of what toSlug() is or what it's doing cannot find any documentation.Provides a default value?
        var slug: String = title.toSlug(),
        var addedAt: LocalDateTime = LocalDateTime.now(),
        @Id @GeneratedValue var id: Long? = null
)

@Entity
class User(
        var login: String,
        var firstname: String,
        var lastname: String,
        var description: String? = null,
        @Id @GeneratedValue var id: Long? = null
)

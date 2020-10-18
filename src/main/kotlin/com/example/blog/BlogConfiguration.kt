package com.example.blog

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

// Named parameters make the code more readable

@Configuration
class BlogConfiguration {
    @Bean
    fun databaseInitializer(userRepository: UserRepository, articleRepository: ArticleRepository) = ApplicationRunner {
        val smaldini = userRepository.save(User("smaldini", "Stephane", "Maldini"))
        articleRepository.save(Article(title = "Reactor Bismuth is out",
        headline = "Lorem ipsum",
        content = "dolar sit amet",
        author = smaldini))
        articleRepository.save(Article(
                title = "Reactor Aluminium has landed",
                headline = "Lorem ipsum",
                content = "dolar sit amet",
                author = smaldini
        ))
    }
}
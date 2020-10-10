package com.example.blog

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog" // In normal Kotlin we would write model.addAttribute("title", "Blog"). This is imported with springframework.ui.set
        return "blog"
    }
}
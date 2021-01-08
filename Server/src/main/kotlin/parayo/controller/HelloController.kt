package parayo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import parayo.common.ApiResponse

@RestController
class HelloController {

    @GetMapping("/api/v1/hello")
    fun hello() = ApiResponse.ok("world")
}
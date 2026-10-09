package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/saysmt")
    public String sayWorld()
    {
        return "Hello, world!";
    }

    @GetMapping("/num")
    public int getNum(@RequestParam int x, @RequestParam int y)
    {
        return ( x + y ); //num?x=5&y=3
    }

}
package com.codeup.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    //Add 3 and 7
    @GetMapping("/add/{x}/and/{y}")
    @ResponseBody
    public int add(@PathVariable int x, @PathVariable int y) {
        return x + y;
    }

    //Subtract 3 from 7
    @GetMapping("/subtract/{x}/from/{y}")
    @ResponseBody
    public int subtract(@PathVariable int x, @PathVariable int y) {
        return y - x;
    }

    //Multiply 4 and 5
    @GetMapping("/multiply/{x}/and/{y}")
    @ResponseBody
    public int multiply(@PathVariable int x, @PathVariable int y) {
        return x * y;
    }

    //Divide 6 by 3
    @GetMapping("/divide/{x}/by/{y}")
    @ResponseBody
    public long divide(@PathVariable long x, @PathVariable long y) {
        return x / y;
    }
}

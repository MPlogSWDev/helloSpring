package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Chris Bay
 */
@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloSpringController {

    //    // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    // lives at /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }

    // Handles requests of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }

    // Handles requests of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }

    // /hello/form
//    @GetMapping("form")
    @RequestMapping(method = RequestMethod.GET)
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form method='post'>" + // submit a request to /hello
                "<input type='text' name='name'>" +
                "<select name='language'>" +
                "<option value='english'>English</option>" +
                "<option value='french'>French</option>" +
                "<option value='german'>German</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='esperanto'>Esperanto</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @PostMapping
    public static String createMessage(@RequestParam String language,@RequestParam String name) {
        String greeting = "";
        if (language.equals("english")){
            greeting = "Hello, ";
        }
        if (language.equals("french")){
            greeting = "Bonjour, ";
        }
        if (language.equals("german")){
            greeting = "Hallo, ";
        }
        if (language.equals("spanish")){
            greeting = "Hola, ";
        }
        if (language.equals("esperanto")){
            greeting = "Saluton, ";
        }
        return greeting + "" + name + "!" ;
    }
}
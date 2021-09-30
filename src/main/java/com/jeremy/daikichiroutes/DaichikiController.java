package com.jeremy.daikichiroutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// 1. Annotation
@RestController
public class DaichikiController {
        public static void main(String[] args) {
                SpringApplication.run(DaichikiController.class, args);
        }
        
        // 1. Annotation
        @RequestMapping("/daichiki")
        // 3. Method that maps to the request route above
        public String welome() { // 3
                return "Welcome!";
        }
        @RequestMapping("/daichiki/today")
        // 3. Method that maps to the request route above
        public String today() { // 3
        	return "Today you will find luck in all your endeavors!";
        }
        @RequestMapping("/daichiki/tomorrow")
        // 3. Method that maps to the request route above
        public String tomorrow() { // 3
        	return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
        }
}
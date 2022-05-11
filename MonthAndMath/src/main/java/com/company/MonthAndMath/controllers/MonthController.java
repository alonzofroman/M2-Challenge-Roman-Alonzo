package com.company.MonthAndMath.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.company.MonthAndMath.models.Month;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class MonthController {

    private static List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month("January", 1),
            new Month("February", 2),
            new Month("March", 3),
            new Month("April", 4),
            new Month("May", 5),
            new Month("June", 6),
            new Month("July", 7),
            new Month("August", 8),
            new Month("September", 9),
            new Month("October", 10),
            new Month("November", 11),
            new Month("December", 12)
    ));

//    Get month by number
    @RequestMapping(value="/month/{number}", method=RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public Month getMonthByID(@PathVariable Integer number) {
        return monthList.get(number-1);
    }

//Get random month
    @RequestMapping(value="/randomMonth", method=RequestMethod.GET)
    @ResponseStatus(value=HttpStatus.OK)
    public Month getRandomMonth() {
        int randomNumber = Month.getRandom();
        return monthList.get(randomNumber);
    }


}

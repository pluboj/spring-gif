package com.pl.giflib.controller;

import com.pl.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping(value = "/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("cowboy-coder",
                LocalDate.of(2017,11,1),
                "User #1", true);
        modelMap.put("gif",gif);
        return "gif-details";
    }

}

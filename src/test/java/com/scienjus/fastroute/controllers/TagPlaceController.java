package com.scienjus.fastroute.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 * @author ScienJus
 * @date 16/4/3.
 */
@RestController
public class TagPlaceController {

    @RequestMapping(value = "/tagPlace", method = GET)
    public String list() {
        return "tagPlace list";
    }

    @RequestMapping(value = "/tagPlace/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "tagPlace detail " + id;
    }

    @RequestMapping(value = "/tagPlace", method = POST)
    public String create() {
        return "create tagPlace";
    }

    @RequestMapping(value = "/tagPlace/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify tagPlace " + id;
    }

    @RequestMapping(value = "/tagPlace/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete tagPlace " + id;
    }
}

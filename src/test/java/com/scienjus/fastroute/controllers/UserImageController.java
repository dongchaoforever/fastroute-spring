package com.scienjus.fastroute.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author ScienJus
 * @date 16/4/3.
 */
@RestController
public class UserImageController {

    @RequestMapping(value = "/userImage", method = GET)
    public String list() {
        return "userImage list";
    }

    @RequestMapping(value = "/userImage/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "userImage detail " + id;
    }

    @RequestMapping(value = "/userImage", method = POST)
    public String create() {
        return "create userImage";
    }

    @RequestMapping(value = "/userImage/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify userImage " + id;
    }

    @RequestMapping(value = "/userImage/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete userImage " + id;
    }
}
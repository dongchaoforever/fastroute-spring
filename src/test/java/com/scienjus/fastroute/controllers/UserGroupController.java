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
public class UserGroupController {

    @RequestMapping(value = "/userGroup", method = GET)
    public String list() {
        return "userGroup list";
    }

    @RequestMapping(value = "/userGroup/{id}", method = GET)
    public String detail(@PathVariable String id) {
        return "userGroup detail " + id;
    }

    @RequestMapping(value = "/userGroup", method = POST)
    public String create() {
        return "create userGroup";
    }

    @RequestMapping(value = "/userGroup/{id}", method = PUT)
    public String modify(@PathVariable String id) {
        return "modify userGroup " + id;
    }

    @RequestMapping(value = "/userGroup/{id}", method = DELETE)
    public String delete(@PathVariable String id) {
        return "delete userGroup " + id;
    }
}
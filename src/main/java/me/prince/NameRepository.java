package me.prince;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NameRepository {
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<String> index() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        return list;
    }
}

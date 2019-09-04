package Sheila;

import Sheila.Items;
import Sheila.ItemsDAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



import java.util.List;

// Different routes specified using the @RequestMapping notation, GET requests can be done by visiting the URL as a user
// Browsers are incapble of POST and DELETE requests therefore a http request is required.
@RestController
public class CampingController {

    @Autowired
    private ItemsDAO itemsDAO;

    @GetMapping("/items")
    public List<String> findAll() {
        return itemsDAO.findAll();

    }

}

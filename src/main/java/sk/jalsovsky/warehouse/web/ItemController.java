package sk.jalsovsky.warehouse.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.jalsovsky.warehouse.domain.Item;
import sk.jalsovsky.warehouse.domain.ItemRepository;

@RestController
public class ItemController {
    @Autowired
    private ItemRepository repository;

    @RequestMapping("/items")
    public Iterable<Item> getItems() {
        return repository.findAll();
    }
}

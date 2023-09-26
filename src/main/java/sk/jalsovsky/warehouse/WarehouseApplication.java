package sk.jalsovsky.warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sk.jalsovsky.warehouse.domain.Item;
import sk.jalsovsky.warehouse.domain.ItemRepository;

@SpringBootApplication
public class WarehouseApplication implements CommandLineRunner {
    @Autowired
    private ItemRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(WarehouseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Item(100, "Rusty Nail", "Useless Junk"));
        repository.save(new Item(3, "Broken Window", "Useless Junk"));
        repository.save(new Item(1, "Skoda Fabia 1.4mpi", "Junk"));
    }
}

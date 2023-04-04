import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {
    @Autowired
    ItemRepository itemrepository;
    @PostMapping("/api/item")
    public String add(@RequestBody Item item){
        itemrepository.save(item);
        return "uzpdate Ok";
    }
    @GetMapping("/api/item")
    public List<Item> get(){
        return itemrepository.findAll();
    }
    @GetMapping("/api/item/{id}")
    public Optional<Item> getId(@PathVariable("id")Long id){
        return itemrepository.findById((id));
    }
}

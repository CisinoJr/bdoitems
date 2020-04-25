package br.com.cisinojr.blackdesert.itemsbdo.web.rest;

import br.com.cisinojr.blackdesert.itemsbdo.services.ItemsService;
import br.com.cisinojr.blackdesert.itemsbdo.services.dto.ItemsDTO;
import com.codahale.metrics.annotation.Timed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemsResource {

    private final ItemsService itemsService;

    public ItemsResource(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @GetMapping
    @Timed
    public ResponseEntity<ItemsDTO> getItemByName(@RequestParam("name") String name) {
        ItemsDTO response = itemsService.findByName(name);
        return ResponseEntity.ok().body(response);
    }

}

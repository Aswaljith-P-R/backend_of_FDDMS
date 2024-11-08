package com.backend.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.backend.backend.model.inventory; // Ensure correct casing for the class name
import com.backend.backend.service.inventoryservice; // Ensure correct casing for the class name

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class inventorycontroller {

    @Autowired
    private inventoryservice inventoryService;

    // Endpoint to add or donate food, incrementing the quantity
    @PostMapping("/donate") // Change @PutMapping to @PostMapping
    public inventory donateFood(@RequestParam String foodItem, @RequestParam int quantity) {
        return inventoryService.donateFood(foodItem, quantity);
    }

    // Endpoint to receive food and decrement the quantity
    @PostMapping("/receive") // Change @PutMapping to @PostMapping
    public inventory receiveFood(@RequestParam String foodItem, @RequestParam int quantity) {
        return inventoryService.receiveFood(foodItem, quantity);
    }

    // Endpoint to get all inventory items
    @GetMapping("/all")
    public List<inventory> getAllInventoryItems() {
        return inventoryService.getAllinventoryItems();
    }

    // Endpoint to delete an inventory item
    @DeleteMapping("/delete/{id}")
    public void deleteInventory(@PathVariable Long id) {
        inventoryService.deleteinventoryItem(id);
    }
}

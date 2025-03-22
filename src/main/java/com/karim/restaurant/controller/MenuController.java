package com.karim.restaurant.controller;

import com.karim.restaurant.entity.Menu;
import com.karim.restaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/")
    public List<Menu> showMenu() {
        return menuService.getAllMenu();
    }

    @PostMapping("/save")
    public Menu saveMenu(@RequestBody Menu menu) {
        return menuService.saveMenu(menu);
    }

}

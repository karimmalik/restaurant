package com.karim.restaurant.controller.impl;

import com.karim.restaurant.controller.MenuController;
import com.karim.restaurant.entity.Menu;
import com.karim.restaurant.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuControllerImpl implements MenuController {

    private static final Logger log = LoggerFactory.getLogger(MenuControllerImpl.class);

    @Autowired
    private MenuService menuService;

    @GetMapping("/showMenu")
    public List<Menu> showMenu() {
        log.info("[Start] Process showMenu");
        List<Menu> menus = menuService.getAllMenu();
        log.info("[End]  Process showMenu");
        return menus;
    }

    @Override
    public Menu showMenuById(int id) {
        return null;
    }

    @Override
    public Menu updateMenu(Menu menu) {
        return null;
    }

    @PostMapping("/saveMenu")
    public Menu saveMenu(@RequestBody Menu menu) {
        log.info("[Start] Process showMenu");
        menuService.saveMenu(menu);
        log.info("[End]  Process showMenu");
        return menu;
    }

    @PutMapping("/updateMenu/{id}")
    public Menu updateMenu(@PathVariable int id, @RequestBody Menu menu) {
        log.info("[Start] Process updateMenu");
        menuService.updateMenu(id, menu);
        log.info("[End]  Process updateMenu");
        return menu;
    }

    @Override
    public void deleteMenu(int id) {

    }

}

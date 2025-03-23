package com.karim.restaurant.controller;

import com.karim.restaurant.entity.Menu;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface MenuController {

    List<Menu> showMenu();
    Menu showMenuById(int id);
    Menu updateMenu(Menu menu);
    Menu updateMenu(int id, Menu menu);
    void deleteMenu(int id);

}

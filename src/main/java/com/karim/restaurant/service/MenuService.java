package com.karim.restaurant.service;

import com.karim.restaurant.entity.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> getAllMenu();
    Menu getMenuById(int id);
    void saveMenu(Menu menu);
    void updateMenu(int Id, Menu menu);
}

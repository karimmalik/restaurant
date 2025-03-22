package com.karim.restaurant.service;

import com.karim.restaurant.entity.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> getAllMenu();
    Menu getMenuById(int id);
    Menu saveMenu(Menu menu);

}

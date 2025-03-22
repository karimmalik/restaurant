package com.karim.restaurant.service.impl;

import com.karim.restaurant.entity.Menu;
import com.karim.restaurant.repository.MenuRepository;
import com.karim.restaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> getAllMenu() {
        return menuRepository.findAll();
    }

    @Override
    public Menu getMenuById(int id) {
        return menuRepository.getById(id);
    }

    @Override
    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }
}

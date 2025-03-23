package com.karim.restaurant.service.impl;

import com.karim.restaurant.entity.Menu;
import com.karim.restaurant.repository.MenuRepository;
import com.karim.restaurant.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService {

    private static final Logger log = LoggerFactory.getLogger(MenuServiceImpl.class);

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> getAllMenu() {
        log.info("[Start]getAllMenu");
        List<Menu> menus = menuRepository.findAll();
        log.info("[End]getAllMenu");
        return menus;
    }

    @Override
    public Menu getMenuById(int id) {
        log.info("[Start]getMenuById");
        Optional<Menu> optionalMenu = menuRepository.findById(id);
        if (optionalMenu.isPresent()) {
            Menu menu = optionalMenu.get();
            log.info("Menu found : {}", menu.getName());
            return menu;
        } else {
            log.info("Menu not found : {}", id);
            return null;
        }
    }

    @Override
    public void saveMenu(Menu menu) {
        log.info("[Start]saveMenu");
        menuRepository.save(menu);
        log.info("[End]saveMenu");
    }

    @Override
    public void updateMenu(int Id, Menu menu) {
        log.info("[Start]updateMenu");
        Optional<Menu> optionalMenu = menuRepository.findById(Id);
        if (optionalMenu.isPresent()) {
            Menu menu1 = optionalMenu.get();
            menu1.setName(menu.getName());
            menu1.setPrice(menu.getPrice());
            menu1.setChefRecommended(menu.isChefRecommended());
            menu1.setSpicy(menu.isSpicy());
            menuRepository.save(menu1);
        } else {
            log.info("Menu not found : {}", Id);
        }
    }
}

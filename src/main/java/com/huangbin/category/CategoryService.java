package com.huangbin.category;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Transactional
@Service
public interface CategoryService {
    /**
     * @return
     */
    void add(Category category);


    /**
     * @return
     */
    Category find(Integer id);

    /**
     * @param locName
     */
    Category update(String locName);


    /**
     * @param id
     */
    void delete(Integer id);


    /**
     * @param id
     * @param locName
     */
    void updateLocName(Integer id, String locName);


    /**
     * @return
     */
    List<Category> findAll();
}

package com.huangbin.category;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 种类业务类
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    CategoryMapper categoryMapper;


    /**
     * @param category
     * @return
     */
    @Override
    public void add(Category category) {
        categoryMapper.add(category);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Category find(Integer id) {
        return categoryMapper.find(id);
    }

    /**
     * @param locName
     */
    @Override
    public Category update(String locName) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void delete(Integer id) {
        categoryMapper.delete(id);
    }

    @Override
    public void updateLocName(Integer id, String locName) {
        categoryMapper.updateLocName(id, locName);
    }

    @Override
    public List<Category> findAll() {
        return categoryMapper.findAll();
    }
}

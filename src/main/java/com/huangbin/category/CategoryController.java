package com.huangbin.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/category")
public class CategoryController {


    @Autowired
    CategoryService categoryService;


    /**
     * @param category
     * @return 新增种类
     */
    @PostMapping("/add")
    public Category add(@RequestBody Category category) {
        System.out.println(category.toString());
        categoryService.add(category);
        return category;
    }


    /**
     * @param id id
     * @return 根据ID查找种类
     */
    @GetMapping("/find/{id}")
    @ResponseBody
    public Category find(@PathVariable Integer id) {
        System.out.println(id.toString());
        return categoryService.find(id);
    }


    /**
     * @return 查询所有的种类
     */
    @GetMapping("/categories")
    @ResponseBody
    public List<Category> findAll() {
        return categoryService.findAll();
    }


    /**
     * @param id
     * @return 新增种类
     */
    @PutMapping("/update/{id}")
    @ResponseBody
    public Category update(@PathVariable Integer id) {
        Category category = categoryService.find(id);
        return category != null ? category : new Category(404, "404", "not found", "1");
    }


    /**
     * @param id
     * @return 新增种类
     */
    @PatchMapping("/updateLocName/{id}")
    public Category updateLocName(@PathVariable Integer id, @RequestParam String locName) {
        categoryService.updateLocName(id, locName);
        return null;
    }


    /**
     * @param id id
     * @return 根据ID查找种类
     */
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        categoryService.delete(id);
    }

}

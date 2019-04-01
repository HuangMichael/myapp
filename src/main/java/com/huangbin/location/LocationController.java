package com.huangbin.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/location")
public class LocationController {


    @Autowired
    LocationService locationService;


    /**
     * @param location
     * @return 新增位置
     */
    @PostMapping("/add")
    @ResponseBody
    public Location add(@RequestBody Location location) {
        System.out.println(location.toString());
        locationService.add(location);
        return location;
    }


    /**
     * @param id id
     * @return 根据ID查找位置
     */
    @GetMapping("/find/{id}")
    @ResponseBody
    public Location find(@PathVariable Integer id) {
        System.out.println(id.toString());
        return locationService.find(id);
    }


    /**
     * @return 查询所有的位置
     */
    @GetMapping("/locations")
    @ResponseBody
    public List<Location> findAll() {
        return locationService.findAll();
    }


    /**
     * @param id
     * @return 新增位置
     */
    @PutMapping("/update/{id}")
    public Location update(@PathVariable Integer id) {
        Location location = locationService.find(id);
        return location != null ? location : new Location(404, "404", "not found", "1");
    }


    /**
     * @param id
     * @return 新增位置
     */
    @PatchMapping("/updateLocName/{id}")
    public Location updateLocName(@PathVariable Integer id, @RequestParam String locName) {
        locationService.updateLocName(id, locName);
        return null;
    }


    /**
     * @param id id
     * @return 根据ID查找位置
     */
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        locationService.delete(id);
    }

}

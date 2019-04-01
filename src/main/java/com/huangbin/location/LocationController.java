package com.huangbin.location;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/location")
@Api(value = "位置管理模块")
public class LocationController {


    @Autowired
    LocationService locationService;


    /**
     * @param location
     * @return 新增位置
     */
    @PostMapping("/add")
    @ResponseBody
    @ApiOperation(value = "添加位置", notes = "根据参数添加用户")
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
    @ApiOperation(value = "查询位置", notes = "根据参数查询位置")
    public Location find(@PathVariable Integer id) {
        System.out.println(id.toString());
        return locationService.find(id);
    }


    /**
     * @return 查询所有的位置
     */
    @GetMapping("/locations")
    @ResponseBody
    @ApiOperation(value = "查询位置", notes = "查询所有位置")
    public List<Location> findAll() {
        return locationService.findAll();
    }


    /**
     * @param id
     * @return 新增位置
     */
    @PutMapping("/update/{id}")
    @ApiOperation(value = "更新位置", notes = "根据参数更新位置")
    public Location update(@PathVariable Integer id) {
        Location location = locationService.find(id);
        return location != null ? location : new Location(404, "404", "not found", "1");
    }


    /**
     * @param id
     * @return 新增位置
     */
    @PatchMapping("/updateLocName/{id}")
    @ApiOperation(value = "更新位置", notes = "根据参数更新位置")
    public Location updateLocName(@PathVariable Integer id, @RequestParam String locName) {
        locationService.updateLocName(id, locName);
        return null;
    }


    /**
     * @param id id
     * @return 根据ID查找位置
     */
    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "删除位置", notes = "根据参数删除位置")
    public void delete(@PathVariable Integer id) {
        locationService.delete(id);
    }

}

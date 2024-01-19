package com.atguigu.ggkt.vod.controller;


import com.atguigu.ggkt.model.vod.Teacher;
import com.atguigu.ggkt.vod.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author author
 * @since 2024-01-18
 */
@Api("讲师管理接口")
@RestController
@RequestMapping("/admin/vod/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    //查询所有讲师列表
    @ApiOperation("查询所有讲师列表")
    @GetMapping("/findAll")
    public List<Teacher> findAll(){
        return teacherService.list();
    }

    @ApiOperation("通过id逻辑删除讲师")
    @DeleteMapping("/{id}")
    public boolean removeById(@ApiParam(name = "id", value = "讲师id", required = true, example = "1")
                                  @PathVariable(name = "id") Integer id) {
        return teacherService.removeById(id);
    }
}

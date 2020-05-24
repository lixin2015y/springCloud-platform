package com.platform.controller;

import com.platform.entity.Dept;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DeptController {

    @GetMapping("getAllDept")
    List<Map> getAllDept() {
        List list = new ArrayList();
        final HashMap<Object, Object> map = new HashMap<>();
        map.put("name", "client2");
        list.add(map);
        return list;
    }

    @PostMapping("addDept")
    Dept addDept(Dept dept) {
        System.out.println(dept);
        return dept;
    }
}

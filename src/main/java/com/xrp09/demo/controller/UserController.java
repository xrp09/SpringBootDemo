package com.xrp09.demo.controller;


import com.xrp09.demo.pojo.JSONResult;
import com.xrp09.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.xrp09.demo.pojo.User;
@RestController
public class UserController {

    @Autowired
    private IUserService userservice;


    @RequestMapping("/hello")
    public JSONResult hello(){
        return JSONResult.ok("测试成功!");
    }

    @RequestMapping("/queryAll")
    public JSONResult query()throws Exception{
        return JSONResult.ok(userservice.getUsers());
    }
    @RequestMapping("/query")
    public JSONResult queryDataByName(@RequestParam String name)throws Exception{
        if (name==null||"".equals(name))
            return JSONResult.errorMsg("名称不能为空");
        return JSONResult.ok(userservice.queryDataByName(name));
    }
    @RequestMapping("/insert")
    public JSONResult InsertData(@RequestParam String name,String age,String love,String desc)throws Exception{
        User user = new User();
        user.setName(name);
        user.setAge(Integer.parseInt(age));
        user.setLove(love);
        user.setDesc(desc);
        userservice.insert(user);
        return JSONResult.ok("新增成功！");
    }
    @RequestMapping("/delete")
    public JSONResult deleteData(@RequestParam String name)throws Exception{
        userservice.delete(name);
        return JSONResult.ok("删除成功！");
    }


}

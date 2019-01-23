package com.xrp09.demo.controller;


import com.xrp09.demo.pojo.JSONResult;
import com.xrp09.demo.pojo.Resource;
import com.xrp09.demo.pojo.User;
import com.xrp09.demo.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
@RestController
public class UserController {

    @Autowired
    private IUserService userservice;

    @Autowired
    private Resource resource;


    @RequestMapping("/hello")
    public JSONResult hello(){
        return JSONResult.ok("测试成功111!");
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

    @RequestMapping("/getUser")
    public User getUserTest(){
        User u  =  new User();
        u.setName("xxx");
        u.setAge(1);
        u.setLove(new Date().toString());
        u.setDesc(null);
        u.setTest(new Date());
        return u;
    }

    @RequestMapping("/getResource")
    public JSONResult getResource(){
        Resource res = new Resource();
        BeanUtils.copyProperties(resource,res);
        return JSONResult.ok(res);

    }


}

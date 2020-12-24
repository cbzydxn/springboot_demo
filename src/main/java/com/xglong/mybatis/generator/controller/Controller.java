package com.xglong.mybatis.generator.controller;


import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import com.xglong.mybatis.generator.mapper.RoleMapper;
import com.xglong.mybatis.generator.mapper.UserMapper;

import com.xglong.mybatis.generator.model.Role;

import com.xglong.mybatis.generator.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.util.*;

/**
 * ClassName:Controller
 * Package:com.xglong.mybatis.generator.controller
 * Description:
 *
 * @Date:2020/7/18 15:43
 * @Author:chenbo@1767210317.qq.com
 */


@RestController
@RequestMapping("/select")
public class Controller {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;


    @RequestMapping("/getUsers/{id}")
    public Map<Long, String> getUsers(@PathVariable("id") Integer id) {

        List<Role> roles = userMapper.getUsers(id);

        for (Role role : roles) {
            System.out.println(role.getRoleId() + ":" + role.getRoleName());
        }


        Map<Long, String> map = new HashMap<>();
        Map<Integer, Map<Long, String>> integerMap = new HashMap<>();

        //List<Map<Long,String>> list = new ArrayList<>();


        //Object o = new Object[1000];

       /* Set<Object> set = new HashSet<>();


        for (Role role : roles) {
            set.add(role.getRoleId());
            set.add(role.getRoleName());
        }*/

       /* int count = 0;
        Map<Object,Map<Long,String>> maps = new HashMap<>();
        Map<Long,String> map = new HashMap<>();
        for (Role role : roles) {
            Long  roleId = role.getRoleId();
            String roleName = role.getRoleName();
            map.put(roleId,roleName);
            maps.put(count++,map);

            list.add(maps);

        }*/

        // System.out.println(list);

       /* count = 0;
        for (Map<Object,Object > map2:list) {

            if(!list.isEmpty()) {
                Map<Object, Object> map1 = list.get(count);
                Object roleId = map1.get("roleId");
                Object roleName = map1.get();
                count++;
                System.out.println("角色编号："+roleId+","+"角色id:"+roleName);
            }
        }
*/


        int count = 0;
        for (Role role : roles) {
            Long roleId = role.getRoleId();
            String roleName = role.getRoleName();

            map.put(roleId, roleName);
            integerMap.put(count++, map);
        }

        System.out.println(integerMap);


       /* for(Map<Long,String > list1:list){
            Map<Long, String> map = list.get(0);
            String s = map.get(3);
            System.out.println(s);

        }*/

       /* String s = map.get(3);
        System.out.println(s);*/


        /*for (Long aLong : map.keySet()) {
            String s = map.get(aLong);
            System.out.println(aLong+":"+s);
        }*/

        count = 0;
        for (Integer integer : integerMap.keySet()) {
            Map<Long, String> map1 = integerMap.get(integer);
            System.out.println(map1.get("3") + "和" + map1.get("5"));
        }


        return map;


    }

    @RequestMapping("/update")
    public void update() {
        User user = new User();
        user.setUserId(4l);
        user.setAge(18);
        user.setUserName("xiaowang");
        userMapper.updateByPrimaryKey(user);
    }


}

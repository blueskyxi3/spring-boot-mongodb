package org.zw.repository;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.zw.model.Offer;
import org.zw.model.User;
import org.zw.util.JsonUtil;

/**
 * Created by summer on 2017/5/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userDao;
    
    @Autowired
    private OfferRepository offerDao;

    @Test
    public void testSaveUser() throws Exception {
        User user=new User();
        user.setId(2l);
        user.setUserName("小明");
        user.setPassWord("fffooo123");
        userDao.saveUser(user);
    }

    @Test
    public void findUserByUserName(){
       User user= userDao.findUserByUserName("小明");
       System.out.println("user is "+user);
    }
    
    @Test
    public void findOfferByUserName(){
       User user= userDao.findUserByUserName("小明");
       System.out.println("user is "+user);
    }

    @Test
    public void updateUser(){
        User user=new User();
        user.setId(2l);
        user.setUserName("天空");
        user.setPassWord("fffxxxx");
        userDao.updateUser(user);
    }

    @Test
    public void deleteUserById(){
        userDao.deleteUserById(1l);
    }
    
    @Test
    public void queryOffer(){
       Offer offer =  offerDao.findOfferByOfferName("xxxx");
       System.out.println(offer);
       List<Map> features = offer.getRoles();
       features.stream().forEach((m)->{
    	   m.forEach((k,v)->{
    		   System.out.println(k.getClass()+":"+v.getClass());
    		   System.out.println(k+":"+v);
    	   });
    	   System.out.println("------------------");
    	   System.out.println( JsonUtil.objectToJson(offer));
       });
    }

}

package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.xkorey.db.master.service.UsersService;
import com.xkorey.db.slave.service.UserinfoService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-base.xml"})
public class TestDao {

    
    @Autowired
    @Qualifier("UsersService")
    private UsersService usersService;
    
    @Autowired
    @Qualifier("UserinfoService")
    private UserinfoService userinfoService;
    
    
    @Test
    public void testMutilDataSource(){
	int id=1000;
	System.out.println(usersService.findUserAgeById(id));
	System.out.println(userinfoService.findUserInfoById(id));
    }
    

}

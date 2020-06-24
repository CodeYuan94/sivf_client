import dao.PatInfMapper;
import entity.view.PatInf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.view.PatInfService;

import java.util.List;

/**
 * @author yuan
 * @project SIVF
 * @description TODO
 * @date 2020/6/24 9:04
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class sivfTest {

//    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");

    @Autowired
    private PatInfMapper patInfMapper;

    @Autowired
    private PatInfService patInfService;

    @Test
    public void test1() {
//        PatInfMapper mapper = (PatInfMapper)context.getBean("patInfMapperImpl");
//        List<PatInf> patInfs = patInfMapper.selectAll();
        List<PatInf> patInfs = patInfService.queryAllPat();
        for (PatInf patInf : patInfs) {
            System.out.println(patInf);
        }
    }
}

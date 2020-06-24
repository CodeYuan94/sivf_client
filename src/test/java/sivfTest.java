import dao.PatInfMapper;
import dao.ReservationMapper;
import entity.view.PatInf;
import entity.view.Reservation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.view.PatInfService;
import utils.CharacterUtil;

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

    @Autowired
    private ReservationMapper reservationMapper;

    @Test
    public void test1() {
//        PatInfMapper mapper = (PatInfMapper)context.getBean("patInfMapperImpl");
//        List<PatInf> patInfs = patInfMapper.selectAll();
//        List<PatInf> patInfs = patInfService.queryAllPat();
//        for (PatInf patInf : patInfs) {
//            System.out.println(patInf);
//        }
        List<PatInf> patInfs = patInfMapper.selectByName("张");
        for (PatInf patInf : patInfs) {
            System.out.println(patInf.getName());
        }
    }

    @Test
    public void testReservation() {
        List<Reservation> reservations = reservationMapper.selectToday();
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    @Test
    public void testChar() {
//        boolean z = CharacterUtil.isChinese("aa");
//        System.out.println(z);
//        String z1 = CharacterUtil.getChinese("asd为rrr好");
//        System.out.println(z1);
        String spell = CharacterUtil.getFirstSpell("孙悟空");
        System.out.println("首字母："+spell);
        String pingYin = CharacterUtil.getPingYin("孙悟空");
        System.out.println("拼音："+pingYin);
        String fullSpell = CharacterUtil.getFullSpell("孙悟空");
        System.out.println("首字母大写的拼音："+fullSpell);
        String capitalize = CharacterUtil.capitalize("abcde");
        System.out.println("首字母大写："+capitalize);
    }
}

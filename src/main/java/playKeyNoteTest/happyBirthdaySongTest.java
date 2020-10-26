package playKeyNoteTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.notePage;
import wrappers.eventsClass;

import java.io.IOException;

public class happyBirthdaySongTest extends eventsClass {

    @BeforeClass
    public static void setUp() throws InterruptedException, IOException {
        loadObjects();
        invokeApp();
    }

    @Test
    public void playHappyBirthdayTune() throws InterruptedException {

        happyBirthdayToYou();
        happyBirthdayTOYOU();
        happyBirthdayToDearPerson();
        happyBirthdayTOOYOU();
    }

    @AfterClass
    public static void tearDown(){
        closeBrowser();
    }

    //[D-D-E-D-G-F#]
    public void happyBirthdayToYou() throws InterruptedException {
        new notePage()
                .enableSound()
                .D_Note()
                .D_Note()
                .E_Note()
                .D_Note()
                .G_Note()
                .F_sharp_Note();
    }
    //[D-D-E-D-A-G]
    public void happyBirthdayTOYOU() throws InterruptedException {
        new notePage()
                .D_Note()
                .D_Note()
                .E_Note()
                .D_Note()
                .A_Note()
                .G_Note();
    }
    //[D-D-^D-B-G-F#-E]
    public void happyBirthdayToDearPerson() throws InterruptedException {
        new notePage()
                .D_Note()
                .D_Note()
                .tri_D_Note()
                .B_Note()
                .G_Note()
                .F_sharp_Note()
                .E_Note();
    }
    //[^C-^C-B-G-A-G]
    public void happyBirthdayTOOYOU() throws InterruptedException {
        new notePage()
                .tri_C_Note()
                .tri_C_Note()
                .B_Note()
                .G_Note()
                .A_Note()
                .G_Note();Thread.sleep(2000);
    }
}

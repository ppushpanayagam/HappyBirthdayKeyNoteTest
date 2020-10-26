package pages;

import playKeyNoteTest.happyBirthdaySongTest;

public class notePage extends happyBirthdaySongTest {
    public notePage enableSound() throws InterruptedException {
        clickByXpath(prop.getProperty("ENABLE_SOUND"));
        Thread.sleep(3000);
        return this;
    }
    public notePage A_Note() throws InterruptedException {
        clickByXpath(prop.getProperty("A_NOTE"));
        return this;
    }
    public notePage B_Note() throws InterruptedException {
        clickByXpath(prop.getProperty("B_NOTE"));
        return this;
    }
    public notePage D_Note() throws InterruptedException {
        clickByXpath(prop.getProperty("D_NOTE"));
        return this;
    }
    public notePage E_Note() throws InterruptedException {
        clickByXpath(prop.getProperty("E_NOTE"));
        return this;
    }
    public notePage G_Note() throws InterruptedException {
        clickByXpath(prop.getProperty("G_NOTE"));
        return this;
    }
    public notePage tri_C_Note() throws InterruptedException {
        clickByXpath(prop.getProperty("TRI_C_NOTE"));
        return this;
    }
    public notePage tri_D_Note() throws InterruptedException {
        clickByXpath(prop.getProperty("TRI_D_NOTE"));
        return this;
    }
    public notePage F_sharp_Note() throws InterruptedException {
        clickByXpath(prop.getProperty("F_SHARP_NOTE"));
        return this;
    }
}

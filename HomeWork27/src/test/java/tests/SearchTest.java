package tests;

import org.testng.annotations.Test;
import pages.MonitorsPage;
import pages.utils.BaseClass;
import pages.MainPage;

public class SearchTest extends BaseClass {

    @Test
    public void searchTest ()
    {
        MainPage main = new MainPage(driver);
        MonitorsPage monitors = new MonitorsPage(driver);

        main.navigateToCategory();
        monitors.choosingMonitors();
        monitors.firstMonitor();
        monitors.secondMonitor();
        monitors.compareMonitors();

    }

}
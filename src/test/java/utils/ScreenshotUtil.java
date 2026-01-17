package utils;

import com.microsoft.playwright.Page;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {
        public static String takeScreenshot(Page page, String testName) {

            new File("test-output/screenshots").mkdirs();

            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String path = "test-output/screenshots/" + testName + "_" + timeStamp + ".png";
            String absolutePath = System.getProperty("user.dir") + "/" + path;

            page.screenshot(new Page.ScreenshotOptions()
                    .setPath(Paths.get(absolutePath))
                    .setFullPage(true));

            return absolutePath;
        }

}


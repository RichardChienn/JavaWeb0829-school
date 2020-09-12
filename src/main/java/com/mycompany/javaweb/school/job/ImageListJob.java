
package com.mycompany.javaweb.school.job;

import java.io.File;
import java.io.PrintWriter;
import javax.servlet.AsyncContext;

public class ImageListJob implements Runnable {

    private AsyncContext ctx;

    public ImageListJob(AsyncContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public void run() {
        try {
            PrintWriter out = ctx.getResponse().getWriter();
            String path = "C:/upload";
            File root = new File(path);
            String[] names = root.list();
            for (String name : names) {
                File file = new File(path + "/" + name);
                if (file.isFile()) {
                    String imagePath = "/JavaWeb0829-school/servlet/image?name=" + name;
                    out.print("<img width='500' src='" + imagePath + "'><p>");
                    out.flush();
                }
            }
            ctx.complete();
        } catch (Exception e) {
        }

    }

}

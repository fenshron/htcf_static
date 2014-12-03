package org.caffcoo.course.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author feng
 *
 */
public class FileDownloadUtil extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		 
        ServletContext context = request.getSession().getServletContext();

         
        // obtain absolute path to file and create input stream
        String relativePath = context.getRealPath("");
     
        
        String filePath = relativePath + File.separator+"video"+File.separator+"htcp.mp4";
        System.out.println("filePath = " + filePath);
        File downloadFile = new File(filePath);
        try {
        FileInputStream inStream = new FileInputStream(downloadFile);
        
        // gets MIME type of the file
        String mimeType = context.getMimeType(filePath);
        
        if (mimeType == null) {        
            // set to binary type if MIME mapping not found
            mimeType = "application/octet-stream";
        }
        System.out.println("MIME type: " + mimeType);
         
        // modifies response
        response.setContentType(mimeType);
        response.setContentLength((int) downloadFile.length());
         
        // forces download
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"", downloadFile.getName());
        response.setHeader(headerKey, headerValue);
         
        // obtains response's output stream
        OutputStream outStream;
		
			outStream = response.getOutputStream();
         
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
         
        while ((bytesRead = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
         
        inStream.close();
        outStream.close();  
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

        
 
}

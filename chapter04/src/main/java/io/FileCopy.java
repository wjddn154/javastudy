package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

   public static void main(String[] args) {
      // 자원 정리 필요하므로 윗쪽으로 올려서 정의
      InputStream is = null;
      OutputStream os = null;
      try {
         is = new FileInputStream("imja.png");
         // Unhandled exception type FileNotFoundException 강제하므로 try/catch 생성 필요

         os = new FileOutputStream("imja.copy.png");

         int data = -1;

         while ((data = is.read()) != -1) {

             os.write(data);
         }

      } catch (FileNotFoundException e) {
         System.out.println("file not found : " + e);
      } catch (IOException e) {
         System.out.println("eroor : " + e);
      } finally {
         // 자원 정리
         try { // close도 try/catch 필요
            if (is != null) {
               is.close();
            }
            if (os != null) {
               os.close();
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }

}
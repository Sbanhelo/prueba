import java.util.*;
import java.io.*;
public class Escribir {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter(new File("holaa"),true);
      for (int i = 1;i<=10 ; i++) {
        fw.write("Esta es la linea "+i+"\n");
      }
      fw.close();
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
    }
  }

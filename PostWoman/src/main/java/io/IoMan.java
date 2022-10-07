package io;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class IoMan {
    public int fund() throws IOException {
        String dir = this.getClass().getClassLoader().getResource("").getPath();
        File file = new File(dir + LocalDate.now() + ".txt");
        //如果文件不存在，创建文件
        if (!file.exists()){
            file.createNewFile();

            //创建FileWriter对象
            FileWriter writer = new FileWriter(file);
            //向文件中写入内容
            writer.write("1");
            writer.flush();
            writer.close();
            return 1;
        }


        //创建FileReader对象，读取文件中的内容
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int res = -1;
        while ((line=br.readLine())!=null) {
            res = Integer.parseInt(line);
        }
        if (res != -1){
            FileWriter writer = new FileWriter(file);
            //向文件中写入内容
            writer.write(String.valueOf(res + 1));
            writer.flush();
            writer.close();
        }
        else {
            throw new IOException("sdfsadfa");
        }
        br.close();
        return  res + 1;
    }
}

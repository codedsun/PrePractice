package CompetetiveProgramming.Hackerrank.WeekOfCode37;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Line{
    int x;
    int b;
    Line(int x,int b){
        this.x = x;
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

public class DynamicLineIntersection {
    static class Reader{
        final  int BUFFER_SIZE = 1<<16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        Reader(){
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException{
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == ' ')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException{
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;

        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

    public static int getIndex(ArrayList<Line> lines, Line o){
        int index = -1;
        for(int i = 0;i <lines.size(); i++){
            if(lines.get(i).getX() == o.getX() && lines.get(i).getB() == o.getB()){
                index = i;
                break;
            }

        }
        return index;
    }

    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        ArrayList<Line> lines = new ArrayList<>();
        int n = r.nextInt();
        int k,b;
        String c ;int count =0 ;
        while(n-- >=1){

            c = r.readLine();


            if(c.equalsIgnoreCase("+")){

                k = r.nextInt();
                b = r.nextInt();
                lines.add(new Line(k,b));
            }
            else if(c.equalsIgnoreCase("-")){
                k = r.nextInt();
                b = r.nextInt();
                Line obj  = new Line(k,b);
                System.out.println(lines.remove(getIndex(lines,obj)));
            }
            else if(c.equalsIgnoreCase("?")){
                int query = r.nextInt();
                for(Line l : lines){
                    if(((query - l.getB())%l.getX())==0){
                        count++;
                    }
                }
                System.out.println(count);
                count = 0;

            }




        }
    }

}

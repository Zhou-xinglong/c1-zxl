public class task9 {
    public static void main(String[] args) {
            Star c1  = new Star();
            c1.shine();
            Sun c2 =new Sun();
            c2.doAnything();
            Star a = new Sun();
            Sun c3 = (Sun)a;
            c3.shine();
    }
}

interface Universe{
    public abstract void doAnything();
}
class Star{
    public void shine(){
        System.out.println("star: 星星一闪一闪亮晶晶");
        System.out.println("====================");
    }
}
class Sun extends Star implements Universe{
    public void doAnything(){
        System.out.println("sun:太阳吸引着9大行星旋转");
        System.out.println("sun:光照八分钟,到达地球");
    }
}


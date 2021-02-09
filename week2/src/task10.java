public class task10 {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.plugin(new sb());
        c.plugin(new jp());
        c.plugin(new mkf());
        c.plugin(new dn());
    }
}
interface USB{
    public void star();
    public void stop();
}
class Computer{
    public void plugin(USB usb){
        usb.star();
        usb.stop();
    }
}
class sb implements USB{
    public void star()
    {
        System.out.println("鼠标启动了");
    }
    public void stop()
    {
        System.out.println("鼠标关闭了");
    }
}
class jp implements USB{
    public void star()
    {
        System.out.println("键盘启动了");
    }
    public void stop()
    {
        System.out.println("键盘关闭了");
    }
}
class mkf implements USB{
    public void star()
    {
        System.out.println("麦克风启动了");
    }
    public void stop()
    {
        System.out.println("麦克风关闭了");
    }
}
class dn implements USB{
    public void star()
    {
        System.out.println("电脑开机成功");
    }
    public void stop()
    {
        System.out.println("电脑关机成功");
    }
}

package Demo04;

public class Test {
//    继承练习题1
//    编写Computer类，包含CPU、内存、硬盘等属性
//    ，getDetails方法用于返回Computer的详细信息
//    编写PC子类，继承Computer类，添加特有属性brand品牌
//    编写NotePad子类，继承Computer，添加属性color
//    编写Test类，创建PC、NotePad对象，给特有属性赋值，
//    以及从Computer类继承的属性赋值，并使用方法打印

    public static void main(String[] args) {
        PC pc = new PC();
        pc.setCpu("core");
        pc.setDisk("三星");
        pc.setStorage("RAM");
        pc.setBrand("联想") ;
        pc.showPC(pc);
        NotePad notePad = new NotePad();
        notePad.setCpu("core i7");
        notePad.setDisk("金士顿");
        notePad.setStorage("ROM");
        notePad.setColor("sliver");
        notePad.showNote(notePad);

    }


}

/**
 * @author LongZhen
 * @date Created in 2023/1/23 21:23
 */


public abstract class SoyaMilk {

    final void make() {
        select();

        if(customerWantCondiment()) {
            addCondiment();
        }

        soak();

        beat();
    }

    // 第一步：选择黄豆
    public void select() {
        System.out.println("选择");
    }

    // 第二步：添加配料
    public abstract void addCondiment();

    // 第三步：浸泡
    public void soak() {
        System.out.println("浸泡");
    }

    // 第四步：打碎
    public void beat() {
        System.out.println("打碎");
    }

    public boolean customerWantCondiment() {
        return true;
    }
}

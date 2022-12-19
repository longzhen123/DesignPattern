package deepclone;

import java.io.Serializable;

public class DeepCloneTarget implements Cloneable, Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
    private int age;

    public DeepCloneTarget(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

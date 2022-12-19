package deepclone;

import java.io.*;

public class DeepType implements Cloneable, Serializable{

    String name;
    DeepCloneTarget target;

    public DeepType(String name, DeepCloneTarget target) {
        this.name = name;
        this.target = target;
    }

    // clone方法实现深拷贝
    @Override
    protected Object clone(){
        DeepType deep = null;
        try {
            deep = (DeepType) super.clone();
            deep.target = (DeepCloneTarget) target.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return deep;
    }

    // 序列化方法实现深拷贝（推荐）
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        DeepType cloneObj = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);

            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            cloneObj = (DeepType) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(null != oos) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(null != ois) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return cloneObj;
    }
}

package deepclone;

public class Client {

    public static void main(String[] args) {

        DeepType protoType = new DeepType("a", new DeepCloneTarget("a", 1));

        DeepType clone1 = (DeepType) protoType.clone();

        System.out.println(clone1.target.hashCode() + ", " + protoType.target.hashCode());

        DeepType clone2 = (DeepType) protoType.deepClone();
        System.out.println(clone2.target.hashCode() + ", " + protoType.target.hashCode());

    }
}

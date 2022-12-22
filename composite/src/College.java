import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    private List<OrganizationComponent> list;

    public College(String name, String des, List<OrganizationComponent> list) {
        super(name, des);
        this.list = list;
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        list.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        list.remove(organizationComponent);
    }

    public College(String name, String des) {
        super(name, des);
        list = new ArrayList<>();
    }

    public List<OrganizationComponent> getList() {
        return list;
    }

    public void setList(List<OrganizationComponent> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void print() {
        System.out.println("=================");
        for(OrganizationComponent organizationComponent: list) {
            System.out.println(organizationComponent);
        }
    }

    public College(List<OrganizationComponent> list) {
        this.list = list;
    }

    public College() {
        list = new ArrayList<>();
    }
}

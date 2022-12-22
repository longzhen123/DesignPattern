import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{
    private List<OrganizationComponent> list;

    public University() {
        list = new ArrayList<>();
    }

    public University(String name, String des, List<OrganizationComponent> list) {
        super(name, des);
        this.list = list;
    }
    public University(String name, String des) {
        super(name, des);
        this.list = new ArrayList<>();
    }


    public University(List<OrganizationComponent> list) {
        this.list = list;
    }

    public List<OrganizationComponent> getList() {
        return list;
    }

    public void setList(List<OrganizationComponent> list) {
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

    @Override
    public void print() {
        System.out.println("=================================");
        for (OrganizationComponent organizationComponent:
             list) {
            System.out.println(organizationComponent);
        }
    }
}

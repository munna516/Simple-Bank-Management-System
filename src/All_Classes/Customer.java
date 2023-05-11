package All_Classes;

public class Customer {
    private String name;
  private int nid;
  private Account accounts[] = new Account[10];

  public void setName(String name) {
    this.name = name;
  }

  public void setNid(int nid) {
    this.nid = nid;
  }

  public String getName() {
    return name;
  }

  public int getNid() {
    return nid;
  }
}

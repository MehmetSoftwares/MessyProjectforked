public class User {

  private int c_id;
  public String c_nam;
  private String address;

  public User(String n, int i) {
    // valider input (tjekliste: Input valideres)
    if (n == null || n.length() == 0 || n.length() > 100) {
      throw new IllegalArgumentException("Name must be 1–100 characters");
    }
    this.c_nam = n;
    this.c_id = i;
  }

  public void setC_nam(String n) {
    if (n == null || n.length() == 0) {
      return;
    }
    this.c_nam = n;
  }

  public void setA(String a) {
    this.address = a;
  }

  public int geti() {
    return c_id;
  }

  public String getn() {
    return c_nam;
  }

  public String geta() {
    return address;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof User u) {
      return c_nam != null && c_nam.equals(u.c_nam);
    }
    return false;
  }

  @Override
  public String toString() {
    return "User{name='" + c_nam + "', id=" + c_id + ", address='" + address + "'}";
  }
}

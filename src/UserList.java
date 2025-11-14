import java.util.ArrayList;

public class UserList {

  public ArrayList<User> u = new ArrayList<>();

  public void add(User u) {
    this.u.add(u);
    if (u == null) {
      return;
    }
  }

  public User getu(User wanted) {
    for (User user : u) {
      if (user.equals(wanted)) {
        return user;
      }
    }
    return null;
  }
  public ArrayList<User> getAll() {
    return u;
  }

}

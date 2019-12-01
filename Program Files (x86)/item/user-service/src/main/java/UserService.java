public class UserService implements IUserService {
    private IUserDao userDao;
    public UserService(IUserDao userDao){
        super();
        this.userDao = userDao;
    }
    public void add(User user){
        userDao.add(user);
    }
    public User getUserByName(String userName){
        return userDao.getUserByName(userName);
    }
}

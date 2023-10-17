package example.service;

public class Application {

    public static void main(String[] args) {
        UserService defaultUserService = new DefaultUserService();
        UserService cachedUserService = new CachedUserService(defaultUserService);


        defaultUserService.deactivateUser("id");
        defaultUserService.deactivateUser("id", true);
        defaultUserService.deactivateUser("id", false);
    }

}

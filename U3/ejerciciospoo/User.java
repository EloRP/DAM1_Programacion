package ejerciciospoo;

import java.time.LocalDateTime;

public class User {
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime lastLogin;
    private boolean enabled;

    public User(String username, String password, String email, boolean enabled) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.enabled = enabled;
        this.createdAt = LocalDateTime.now();

    }

    public User(String username, String password) {
        this(username, password, null, true);
    
    }

    public User(String username){
        this(username, null);
    }

    public String toString() {
        return username;
    }

    public static void main(String[] args) {
        User user1 = new User("elo");
        User user2 = new User("elo");
    
        System.out.println(user1.toString());
        System.out.println(user2.toString());

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
    }

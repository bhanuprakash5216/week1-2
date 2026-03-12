import java.util.*;

class UsernameSystem {

    HashMap<String, Integer> users = new HashMap<>();
    HashMap<String, Integer> attempts = new HashMap<>();

    // Check username availability
    public boolean checkAvailability(String username) {

        attempts.put(username, attempts.getOrDefault(username, 0) + 1);

        if (users.containsKey(username)) {
            return false;
        }
        return true;
    }

    // Register user
    public String register(String username, int userId) {

        if (checkAvailability(username)) {
            users.put(username, userId);
            return "User Registered";
        } else {
            return "Username already taken";
        }
    }

    // Suggest alternative usernames
    public List<String> suggestAlternatives(String username) {

        List<String> suggestions = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            String newName = username + i;
            if (!users.containsKey(newName)) {
                suggestions.add(newName);
            }
        }

        String alt = username.replace("_", ".");
        if (!users.containsKey(alt)) {
            suggestions.add(alt);
        }

        return suggestions;
    }

    // Get most attempted username
    public String getMostAttempted() {

        String most = "";
        int max = 0;

        for (String user : attempts.keySet()) {

            if (attempts.get(user) > max) {
                max = attempts.get(user);
                most = user;
            }
        }

        return most;
    }

    public static void main(String[] args) {

        UsernameSystem system = new UsernameSystem();

        system.users.put("john_doe", 101);
        system.users.put("admin", 102);

        System.out.println(system.checkAvailability("john_doe"));
        System.out.println(system.checkAvailability("jane_smith"));

        System.out.println(system.suggestAlternatives("john_doe"));

        System.out.println(system.getMostAttempted());
    }
}
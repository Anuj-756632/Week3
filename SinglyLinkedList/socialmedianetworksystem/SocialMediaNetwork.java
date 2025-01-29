package socialmedianetworksystem;
import java.util.ArrayList;
import java.util.List;
class SocialMediaNetwork {
    User head;

    // Constructor to initialize the network
    public SocialMediaNetwork() {
        head = null;
    }

    // Add a new user to the network
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        User user1 = searchByUserId(userId1);
        User user2 = searchByUserId(userId2);
        
        if (user1 != null && user2 != null) {
            user1.addFriend(userId2);
            user2.addFriend(userId1);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Remove a friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = searchByUserId(userId1);
        User user2 = searchByUserId(userId2);
        
        if (user1 != null && user2 != null) {
            user1.removeFriend(userId2);
            user2.removeFriend(userId1);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = searchByUserId(userId1);
        User user2 = searchByUserId(userId2);

        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = user1.getMutualFriends(user2);
            if (mutualFriends.isEmpty()) {
                System.out.println("No mutual friends found.");
            } else {
                System.out.println("Mutual friends: " + mutualFriends);
            }
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Display all friends of a specific user
    public void displayAllFriends(int userId) {
        User user = searchByUserId(userId);
        if (user != null) {
            if (user.friendIds.isEmpty()) {
                System.out.println("No friends found.");
            } else {
                System.out.println("Friends of " + user.name + ": " + user.friendIds);
            }
        } else {
            System.out.println("User not found.");
        }
    }

    // Search for a user by User ID
    public User searchByUserId(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // User not found
    }

    // Search for a user by Name
    public User searchByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // User not found
    }

    // Count the number of friends for each user
    public void countFriendsForAllUsers() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }

    // Display all users in the network
    public void displayAllUsers() {
        User temp = head;
        while (temp != null) {
            System.out.println("User ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
            temp = temp.next;
        }
    }
}
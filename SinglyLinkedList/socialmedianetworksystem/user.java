package socialmedianetworksystem;
import java.util.ArrayList;
import java.util.List;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds; // List of Friend IDs
    User next;

    // Constructor to initialize a new user
    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }

    // Add a friend ID to the user's friend list
    public void addFriend(int friendId) {
        if (!friendIds.contains(friendId)) {
            friendIds.add(friendId);
        }
    }

    // Remove a friend ID from the user's friend list
    public void removeFriend(int friendId) {
        friendIds.remove(Integer.valueOf(friendId));
    }

    // Get mutual friends with another user
    public List<Integer> getMutualFriends(User otherUser) {
        List<Integer> mutualFriends = new ArrayList<>();
        for (int friendId : this.friendIds) {
            if (otherUser.friendIds.contains(friendId)) {
                mutualFriends.add(friendId);
            }
        }
        return mutualFriends;
    }
}


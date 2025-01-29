package socialmedianetworksystem;


public class SocialMediaManagement {
    public static void main(String[] args) {
        SocialMediaNetwork network = new SocialMediaNetwork();

        // Adding users to the network
        network.addUser(1, "Alice", 25);
        network.addUser(2, "Bob", 30);
        network.addUser(3, "Charlie", 22);
        network.addUser(4, "David", 28);

        // Display all users
        System.out.println("All users in the network:");
        network.displayAllUsers();

        // Adding friend connections
        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 3);
        network.addFriendConnection(2, 4);

        // Display friends of a specific user
        System.out.println("\nFriends of Alice:");
        network.displayAllFriends(1);

        // Find mutual friends between two users
        System.out.println("\nFinding mutual friends between Alice and Bob:");
        network.findMutualFriends(1, 2);

        // Remove a friend connection
        network.removeFriendConnection(1, 2);
        System.out.println("\nAfter removing Alice and Bob's friendship:");
        network.displayAllFriends(1);

        // Search user by name
        User searchedUser = network.searchByName("Charlie");
        if (searchedUser != null) {
            System.out.println("\nUser found: " + searchedUser.name);
        } else {
            System.out.println("\nUser not found.");
        }

        // Count the number of friends for each user
        System.out.println("\nCounting the number of friends for each user:");
        network.countFriendsForAllUsers();
    }
}
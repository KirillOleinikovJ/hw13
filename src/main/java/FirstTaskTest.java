import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;
public class FirstTaskTest {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        System.out.println("-------------------FirstTask task1/1-------------------");
        System.out.println(FirstTask.addNewUser(newUsers()));
        System.out.println("-------------------FirstTask task1/2-------------------");
        Optional<User> userByIdToUpdate = FirstTask.getIdUsers(7);
        System.out.println(FirstTask.getIdUsers(7));
        if (userByIdToUpdate.isPresent()) {
            User userToUpdate = userByIdToUpdate.get();
            userToUpdate.setUsername("KIRILL");
            Optional<User> updatedUser = FirstTask.updateUser(userToUpdate);
            updatedUser.ifPresent(System.out::println);
        } else {
            System.out.println("User with this ID not found");
        }
        System.out.println("-------------------FirstTask task1/3-------------------");
        System.out.println(FirstTask.deleteUser(7));
        System.out.println("-------------------FirstTask task1/4-------------------");
        System.out.println(FirstTask.getInfoAllUsers());
        System.out.println("-------------------FirstTask task1/5-------------------");
        System.out.println(FirstTask.getIdUsers(4));
        System.out.println("-------------------FirstTask task1/6-------------------");
        System.out.println(FirstTask.getUsersName("Goga.Boba"));
        System.out.println("--------------------FirstTask task2--------------------");
        System.out.println(FirstTask.getCommentsOfUsersLastPost(10));
        System.out.println("--------------------FirstTask task3--------------------");
        System.out.println(FirstTask.getUncomletedTasks(4));


    }

    private static User newUsers() {
        User user = new User();
        user.setName("Kirill Oleinikov");
        user.setUsername("JAVA");
        user.setEmail("kirill@gmail.com");
        user.setPhone("+380951451057");
        user.setWebsite("Test");
        Adress address = new Adress();
        address.setStreet("Novgorodskaya");
        address.setCity("Zaporozhie");
        address.setSuite("Suite 999");
        address.setZipcode("555555");
        Geo geo = new Geo();
        geo.setLat(-54.111);
        geo.setLng(54.034);
        address.setGeo(geo);
        user.setAddress(address);
        Company company = new Company();
        company.setBs("test");
        company.setName("test");
        company.setCatchPhrase("test");
        user.setCompany(company);
        return user;
    }
}

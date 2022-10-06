public class Lesson7 {

static  IRepository iRepository;

    public static void main(String[] args) {

        iRepository = new RepositoryImpl();
        iRepository.login("user name", "133232");

    }

}

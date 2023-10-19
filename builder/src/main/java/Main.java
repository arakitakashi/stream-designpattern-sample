public class Main {
    public static void main(String[] args) {
//        User user = User.builder(1, "Alice")
//                .withEmailAddress("alice@fastcampus.co.kr")
//                .withVerified(true)
//                .build();

        User user = User.builder(1, "Alice")
                        .with(builder -> {
                            builder.emailAddress = "alice@fastcampus.co.jp";
                            builder.isVerified = true;
                        }).build();

        System.out.println(user);
    }
}

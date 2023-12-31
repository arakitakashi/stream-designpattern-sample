import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Consumer;

public class User {
     private int id;
     private String name;
     private String emailAddress;
     private boolean isVerified;
     private LocalDateTime createdAt;
     private List<Integer> friendUserIds;

     public User(Builder builder) {
          this.id = builder.id;
          this.name = builder.name;
          this.emailAddress = builder.emailAddress;;
          this.isVerified = builder.isVerified;
          this.friendUserIds = builder.friendUserIds;
     }

     public static Builder builder(int id, String name) {
          return new Builder(id, name);
     }

     public static class Builder {
          private int id;
          private String name;
          public String emailAddress;
          public boolean isVerified;
          public LocalDateTime createdAt;
          public List<Integer> friendUserIds;

          private Builder(int id, String name) {
               this.id = id;
               this.name = name;
          }

          public Builder with(Consumer<Builder> consumer) {
               consumer.accept(this);
               return this;
          }

          public User build() {
               return new User(this);
          }
     }

     @Override
     public String toString() {
          return "User{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", emailAddress='" + emailAddress + '\'' +
                  ", isVerified=" + isVerified +
                  ", createdAt=" + createdAt +
                  ", friendUserIds=" + friendUserIds +
                  '}';
     }
}

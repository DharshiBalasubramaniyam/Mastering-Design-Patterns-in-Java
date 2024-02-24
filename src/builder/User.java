package builder;

public class User {
    private String name; // required field
    private String email; //  required field
    private String phone; // optional field
    private String city; // optional field

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.getName();
        this.email = userBuilder.getEmail();
        this.phone = userBuilder.getPhone();
        this.city = userBuilder.getCity();
    }

    public static UserBuilder builder(String name, String email) {
        return new UserBuilder(name, email);
    }

    @Override
    public String toString() {
        return "User = " +
                "{ name: '" + name + '\'' +
                ", email: '" + email + '\'' +
                ", phone: '" + phone + '\'' +
                ", city: '" + city + '\'' +
                " }";
    }

    public static class UserBuilder {
        private String name; // required field
        private String email; //  required field
        private String phone = "unknown"; // optional field
        private String city = "unknown"; // optional field

        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getCity() {
            return city;
        }

        public UserBuilder city(String city) {
            this.city = city;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}

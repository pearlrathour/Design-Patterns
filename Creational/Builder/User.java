package Creational.Builder;

class User {
    private final String UserId;
    private final String UserName;
    private final String emailId;

    private User(UserBuilder builder){
        this.UserId= builder.UserId;
        this.UserName= builder.UserName;
        this.emailId= builder.emailId;
    }

    public String getUserId() {
        return UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "User [UserId=" + UserId + ", UserName=" + UserName + ", emailId=" + emailId + "]";
    }

    // inner class to create object
    static class UserBuilder {
        private String UserId;
        private String UserName;
        private String emailId;

        public UserBuilder(){

        }

        public UserBuilder setUserId(String userId) {
            this.UserId = userId;
            return this;
        }
        public UserBuilder setUserName(String userName) {
            this.UserName = userName;
            return this;
        }
        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build(){
            User user= new User(this);
            return user;
        }
        
    }
}

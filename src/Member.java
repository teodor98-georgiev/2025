public class Member {
    String memberId;
    String name;
    String phoneNumber;
    String email;

    public Member(String memberId, String name, String phoneNumber, String email) {
        this.memberId = memberId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString(){
        return memberId + name;
    }

}

class Main {
    static void check_password(String username, String password) {
        if (!username.equals("vishwa") || !password.equals("vishwa")) {
            System.out.print("username and/or password is wrong");
        } else {
            System.out.print("success");
        }
    }

    public static void main(String args[]) {
        check_password("vishwa", "vishwa");
    }
}

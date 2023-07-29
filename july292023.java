class Main {
    static void check_password(String username, String password) {
        if (username.equals("vishwa")) {
            if (password.equals("julyttt")) {
                System.out.print("success");
            } else {
                System.out.print("password wrong");
            }
        } else {
            System.out.print("username wrong");
        }
    }

    public static void main(String args[]) {
        check_password("vishwa", "visa");
    }
}

package day044.sub;

import day044.SlackUser;

public class SlackAdminUser extends SlackUser {
    int adminID;
    public SlackAdminUser(String name, String status,int adminID){
        this.adminID=adminID;
        this.name=name;
        this.status=status;
    }

}

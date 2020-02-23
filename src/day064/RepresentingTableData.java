package day064;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RepresentingTableData {
    public static void main(String[] args) {
        /*first_name,email,gender
Regan,rboichat0@1688.com,Female
Carleen,cmorillas1@blog.com,Female
Olenka,ogillanders2@qq.com,Female
Winny,wmundee3@google.cn,Male
Nola,ndabnot4@lycos.com,Female
Johannes,jitzhayek5@technorati.com,Male
Hazel,hsquier6@engadget.com,Female
Gaylord,gcancellor7@yale.edu,Male
Lewes,lmaccosto8@loc.gov,Male
Bernie,bpock9@i2i.jp,Female
Jacky,jsikoraa@yale.edu,Female
Gussi,gtrickeyb@a8.net,Female
Gordon,gpedric@blogspot.com,Male
Laurel,ltartd@youtube.com,Female
Gerrard,gjillarde@google.fr,Male
Cheri,clownef@theatlantic.com,Female
Lyndell,llegliseg@slideshare.net,Female
Thorstein,tunderdownh@ucla.edu,Male
Jeromy,jwebburni@cyberchimps.com,Male
Ulises,ufranzonelloj@smh.com.au,Male*/
        // for single row
        // i want to get the value by it's column name
        // so i choose Map

        Map<String, String> row1 = new LinkedHashMap<>();
        row1.put("first_name", "Regan");
        row1.put("email", "rboichat0@1688.com");
        row1.put("gender", "Female");

        Map<String, String> row2 = new LinkedHashMap<>();
        row2.put("first_name", "Carleen");
        row2.put("email", "cmorillas1@blog.com");
        row2.put("gender", "Male");

//        System.out.println("row1 = " + row1);
//        System.out.println("row2 = " + row2);

        // for one row I used one map
        // but I have many rows !
        // may of Some type -->> List<SomeType>
        List<Map<String, String>> rowMapLst = new ArrayList<>();
        rowMapLst.add(row1);
        rowMapLst.add(row2);

        System.out.println("rowMapLst = " + rowMapLst);
        // How do I get 2nd row email column value
        System.out.println("rowMapLst.get(1).get(\"email\") = "
                + rowMapLst.get(1).get("email"));

        // update the Name of 1st row to Hulk
        rowMapLst.get(0).replace("first_name", "Hulk");
        System.out.println("rowMapLst = " + rowMapLst);
        rowMapLst.get(0).put("first_name", "Jane");
        System.out.println("rowMapLst = " + rowMapLst);

    }
}

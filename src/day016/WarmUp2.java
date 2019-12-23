package day016;

public class WarmUp2 {
    public static void main(String[] args) {
        /*
        Task 2:
When searching from google ,
it will always show your search keyword in tab name
for example if you search Java
your tab title is : Java - Google Search
Create a program to ask user to
enter a String with any number of word
Create a variable called searchKeyword to save user input
Create another String variable called tabTitle
assign tabTitle value to searchKeyword +  "- Google Search"
Check if tabTitle start with your searchKeyword
and end with - Google Search
If so print the test has passed , if not print test has failed
(Assume you don't know tab title is already correct
in real world , we will capture it with automation)

        * */
        String keyWordToSearch= "Java";
        String tabTitle=keyWordToSearch+ " -Google Search";
        if(tabTitle.startsWith(keyWordToSearch) && tabTitle.endsWith(" -Google Search")){
            System.out.println("test has passed");

        }else{
            System.out.println("test has failed");
        }
    }
}

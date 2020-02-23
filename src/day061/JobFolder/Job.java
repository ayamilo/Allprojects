package day061.JobFolder;

public class Job implements Comparable<Job> {
    private String location;
    private double salary;
    private String companyName;


    public Job(String location, double salary, String companyName) {
        this.location = location;
        this.salary = salary;
        this.companyName = companyName;

    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Job other) {
        if (this.salary > other.salary) {
            return 1;
        } else if (this.salary < other.salary) {
            return -1;
        } else {
            return 0;
        }
    }


    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }
}
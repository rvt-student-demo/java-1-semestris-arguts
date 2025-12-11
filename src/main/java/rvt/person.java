package rvt;

public class person {

    private String name;
    private String address;

    public person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return this.name + "\n" + "  " + this.address;
    }
}

class Student extends person {

    private int studyCredits;

    public Student(String name, String address) {
        super(name, address);      // call Person constructor
        this.studyCredits = 0;     // students start with 0 credits
    }

    public void study() {
        this.studyCredits = this.studyCredits + 1;
    }

    public int credits() {
        return this.studyCredits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "  Study credits " + this.studyCredits;
    }
}

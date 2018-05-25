public class Student {
    private String name;
    private int math;
    private int science;
    private int nepali;

    public Student(final String name, final int math, final int science, final int nepali) {
        this.name = name;
        this.math = math;
        this.science = science;
        this.nepali = nepali;
    }

    public String getName() {
        return name;
    }

    public int getMath() {
        return math;
    }

    public int getScience() {
        return science;
    }

    public int getNepali() {
        return nepali;
    }

    public int getTotal() {
        return this.math + this.nepali + this.science;
    }

    public double getPercentage() {
        return (this.math + this.nepali + this.science) / 3 ;
    }

    public boolean isFail() {
        return this.math < 32 || this.nepali < 32 || this.science < 32;
    }
}




package hospital;

public class Patient implements Comparable<Patient> {
    String name;
    int emergency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmergency() {
        return emergency;
    }

    public void setEmergency(int emergency) {
        this.emergency = emergency;
    }

    public Patient(String name, int emergency) {
        this.name = name;
        this.emergency = emergency;
    }

    @Override
    public int compareTo(Patient o) {
        return Integer.compare(o.emergency, this.emergency);
    }
    @Override
    public String toString(){
        return this.name + " " + this.emergency;
    }
}
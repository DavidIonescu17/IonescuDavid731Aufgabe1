import java.time.LocalDate;
import java.time.LocalDateTime;

public class Event {
    int id;
    String name;
    Stufe stufe;
    String beschreibung;
    LocalDate date;
    double punkte;

    public Event(int id, String name, Stufe stufe, String beschreibung, LocalDate date, double punkte) {
        this.id = id;
        this.name = name;
        this.stufe = stufe;
        this.beschreibung = beschreibung;
        this.date = date;
        this.punkte = punkte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stufe getStufe() {
        return stufe;
    }

    public void setStufe(Stufe stufe) {
        this.stufe = stufe;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPunkte() {
        return punkte;
    }

    public void setPunkte(double punkte) {
        this.punkte = punkte;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stufe=" + stufe +
                ", beschreibung='" + beschreibung + '\'' +
                ", date=" + date +
                ", punkte=" + punkte +
                '}';
    }
}
enum Stufe{Genin, Chunin, Jonin, Kage}

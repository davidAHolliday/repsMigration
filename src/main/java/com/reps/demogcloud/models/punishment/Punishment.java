package com.reps.demogcloud.models.punishment;
import com.reps.demogcloud.models.infraction.Infraction;
import com.reps.demogcloud.models.student.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Punishments")
public class Punishment {
    @Id
    private String id;
    private String punishmentId;
    private Student student;
    private Infraction infraction;
    private String status;


//    private int closedInfraction;
//    private int infractionTimes;
//    private String timeCreated;
//    private String classPeriod;
public Punishment(){};

    public Punishment(String id, String punishmentId, Student student, Infraction infraction, String status) {
        this.id = id;
        this.punishmentId = punishmentId;
        this.student = student;
        this.infraction = infraction;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPunishmentId() {
        return punishmentId;
    }

    public void setPunishmentId(String punishmentId) {
        this.punishmentId = punishmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Infraction getInfraction() {
        return infraction;
    }

    public void setInfraction(Infraction infraction) {
        this.infraction = infraction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

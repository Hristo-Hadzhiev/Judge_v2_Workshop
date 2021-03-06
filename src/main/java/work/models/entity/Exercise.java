package work.models.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;

@Entity
@Table(name = "exercises")
public class Exercise extends BaseEntity{

    private String name;
    private LocalDateTime startedOn;
    private LocalDateTime dueDate;

    public Exercise() {
    }

    @Column(name = "name", nullable = false, unique = true)
    @Min(value = 2, message = "Name length must be minimum two characters!")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "started_on", nullable = false)
    @PastOrPresent(message = "The date cannot be in the future")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    public LocalDateTime getStartedOn() {
        return startedOn;
    }

    public void setStartedOn(LocalDateTime startedOn) {
        this.startedOn = startedOn;
    }

    @Column(name = "due_date", nullable = false)
    @FutureOrPresent(message = "The date cannot be in the past")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}

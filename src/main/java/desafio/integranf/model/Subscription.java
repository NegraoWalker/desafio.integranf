package desafio.integranf.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "subscriptions")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;

    private LocalDate startDate;
    private LocalDate endDate;
    private Integer yearlyInvoiceCount;

    public Subscription() {
    }

    public Subscription(Long id, User user, Plan plan, LocalDate startDate, LocalDate endDate, Integer yearlyInvoiceCount) {
        this.id = id;
        this.user = user;
        this.plan = plan;
        this.startDate = startDate;
        this.endDate = endDate;
        this.yearlyInvoiceCount = yearlyInvoiceCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getYearlyInvoiceCount() {
        return yearlyInvoiceCount;
    }

    public void setYearlyInvoiceCount(Integer yearlyInvoiceCount) {
        this.yearlyInvoiceCount = yearlyInvoiceCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscription that = (Subscription) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

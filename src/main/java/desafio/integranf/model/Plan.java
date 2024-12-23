package desafio.integranf.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "plans")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal monthlyCost;
    private Integer yearlyInvoiceLimit;
    private Boolean isDiscontinued;

    @OneToMany(mappedBy = "plan")
    private List<Subscription> subscriptions;

    @OneToMany(mappedBy = "plan")
    private List<PlanHistory> planHistories;

    public Plan() {
    }

    public Plan(Long id, String name, BigDecimal monthlyCost, Integer yearlyInvoiceLimit, Boolean isDiscontinued, List<Subscription> subscriptions, List<PlanHistory> planHistories) {
        this.id = id;
        this.name = name;
        this.monthlyCost = monthlyCost;
        this.yearlyInvoiceLimit = yearlyInvoiceLimit;
        this.isDiscontinued = isDiscontinued;
        this.subscriptions = subscriptions;
        this.planHistories = planHistories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(BigDecimal monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public Integer getYearlyInvoiceLimit() {
        return yearlyInvoiceLimit;
    }

    public void setYearlyInvoiceLimit(Integer yearlyInvoiceLimit) {
        this.yearlyInvoiceLimit = yearlyInvoiceLimit;
    }

    public Boolean getDiscontinued() {
        return isDiscontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        isDiscontinued = discontinued;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<PlanHistory> getPlanHistories() {
        return planHistories;
    }

    public void setPlanHistories(List<PlanHistory> planHistories) {
        this.planHistories = planHistories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return Objects.equals(id, plan.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

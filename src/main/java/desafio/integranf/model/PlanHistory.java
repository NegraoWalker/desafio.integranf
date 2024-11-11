package desafio.integranf.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "plan_histories")
public class PlanHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal monthlyCost;
    private Integer yearlyInvoiceLimit;
    private LocalDate modifiedDate;

    @ManyToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;

    public PlanHistory() {
    }

    public PlanHistory(Long id, String name, BigDecimal monthlyCost, Integer yearlyInvoiceLimit, LocalDate modifiedDate, Plan plan) {
        this.id = id;
        this.name = name;
        this.monthlyCost = monthlyCost;
        this.yearlyInvoiceLimit = yearlyInvoiceLimit;
        this.modifiedDate = modifiedDate;
        this.plan = plan;
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

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanHistory that = (PlanHistory) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

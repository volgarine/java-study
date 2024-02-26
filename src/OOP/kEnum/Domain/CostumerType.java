package OOP.kEnum.Domain;

public enum CostumerType {
    EMPLOYER(1, "Employer"),
    EMPLOYEEE(2, "Employee");
    private int value;
    private String reportName;

    CostumerType(int value, String reportName) {
        this.value = value;
        this.reportName = reportName;
    }

    public String getReportName() {
        return reportName;
    }

    public int getValue() {
        return value;
    }
}

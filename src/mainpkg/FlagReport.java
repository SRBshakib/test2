/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author SRB Shakib
 */
public class FlagReport {
    
    private String carModelNo;
    private String problemType;
    private String submittionDate;

    public FlagReport() {
    }

    public FlagReport(String carModelNo, String problemType, String submittionDate) {
        this.carModelNo = carModelNo;
        this.problemType = problemType;
        this.submittionDate = submittionDate;
    }

    public String getCarModelNo() {
        return carModelNo;
    }

    public void setCarModelNo(String carModelNo) {
        this.carModelNo = carModelNo;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    public String getSubmittionDate() {
        return submittionDate;
    }

    public void setSubmittionDate(String submittionDate) {
        this.submittionDate = submittionDate;
    }

    @Override
    public String toString() {
        return "FlagReport{" + "carModelNo=" + carModelNo + ", problemType=" + problemType + ", submittionDate=" + submittionDate + '}';
    }
    
    
    
}

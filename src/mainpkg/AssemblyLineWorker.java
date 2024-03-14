/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author SRB Shakib
 */
public class AssemblyLineWorker {
    
    private String WorkerName;
    private int workerId;

    public AssemblyLineWorker() {
    }

    public AssemblyLineWorker(String WorkerName, int workerId) {
        this.WorkerName = WorkerName;
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return WorkerName;
    }

    public void setWorkerName(String WorkerName) {
        this.WorkerName = WorkerName;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    @Override
    public String toString() {
        return "AssemblyLineWorker{" + "WorkerName=" + WorkerName + ", workerId=" + workerId + '}';
    }
    
    
    
}

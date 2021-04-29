/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;

/**
 *
 * @author school
 */
public class SMIClass {
    private double SMI = 0.0;
    private int addedModules = 0;
    private int changedModules = 0;
    private int deletedModules = 0;
    private int totalModules = 0;

    public SMIClass(double SMI, int addedModules, int changedModules, int deletedModules, int totalModules) {
        this.SMI = SMI;
        this.addedModules = addedModules;
        this.changedModules = changedModules;
        this.deletedModules = deletedModules;
        this.totalModules = totalModules;
    }

    public double getSMI() {
        return SMI;
    }

    public void setSMI(double SMI) {
        this.SMI = SMI;
    }

    public int getAddedModules() {
        return addedModules;
    }

    public void setAddedModules(int addedModules) {
        this.addedModules = addedModules;
    }

    public int getChangedModules() {
        return changedModules;
    }

    public void setChangedModules(int changedModules) {
        this.changedModules = changedModules;
    }

    public int getDeletedModules() {
        return deletedModules;
    }

    public void setDeletedModules(int deletedModules) {
        this.deletedModules = deletedModules;
    }

    public int getTotalModules() {
        return totalModules;
    }

    public void setTotalModules(int totalModules) {
        this.totalModules = totalModules;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;

import java.util.ArrayList;
import javax.swing.JPanel;

//Cleanup Done
public class Project {
    String projectName, productName, creator, comments;
    String language = "";
    ArrayList<FunctionPointsPane> projectPanes = new ArrayList<>();
    
    public Project(String projectName, String productName, String creator, String comments, String language){
        this.projectName = projectName;
        this.productName = productName;
        this.creator = creator;
        this.comments = comments;
        this.language = language;
    }
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ArrayList<FunctionPointsPane> getProjectPanes() {
        return projectPanes;
    }

    public void setProjectPanes(ArrayList<FunctionPointsPane> projectPanes) {
        this.projectPanes = projectPanes;
    }
    
    public void addProjectPane(FunctionPointsPane pane) {
        projectPanes.add(pane);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Project{" + "projectName=" + projectName + ", productName=" + productName + ", creator=" + creator + ", comments=" + comments + ", language=" + language + '}';
    }
}

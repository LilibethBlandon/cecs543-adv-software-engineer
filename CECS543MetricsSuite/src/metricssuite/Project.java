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
    private String projectName, productName, creator, comments;
    private String language = "";
    private ArrayList<FunctionPointsPane> functionPointPanes = new ArrayList<>();
    
    private ArrayList<UseCasePointsPane> useCasePanes = new ArrayList<>();
    
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

    //FP
    public ArrayList<FunctionPointsPane> getFunctionPointsPanes() {
        return functionPointPanes;
    }

    public void setFunctionPointPanes(ArrayList<FunctionPointsPane> functionPointPanes) {
        this.functionPointPanes = functionPointPanes;
    }
    
    public void addFunctionPointPane(FunctionPointsPane pane) {
        functionPointPanes.add(pane);
    }
    
    //UCP
    public ArrayList<UseCasePointsPane> getUseCasePointsPanes() {
        return useCasePanes;
    }
    
    public void setUseCasePointPanes(ArrayList<UseCasePointsPane> useCasePanes) {
        this.useCasePanes = useCasePanes;
    }
    
    public void addUseCasePointPane(UseCasePointsPane pane) {
        useCasePanes.add(pane);
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

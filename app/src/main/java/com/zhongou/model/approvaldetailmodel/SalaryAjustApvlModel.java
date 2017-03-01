package com.zhongou.model.approvaldetailmodel;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sjy on 2016/12/26.
 */

public class SalaryAjustApvlModel implements Serializable {
    private static final long serialVersionUID = 1L;

    public String TargetEmployee= "";
    public String Reason= "";
    public String Remark= "";
    public String OriSalary= "";
    public String SrcSalary= "";

    public String ApprovalStatus;
    public String EmployeeName;
    public String StoreName;
    public String DepartmentName;
    public String ApplicationCreateTime;

    public List<SalaryAjustApvlModel.ApprovalInfoLists> ApprovalInfoLists ;

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public static class ApprovalInfoLists implements Serializable{
        public String Comment = "";
        public String ApprovalDate = "";
        public String YesOrNo= "";
        public String ApprovalEmployeeName= "";

        public String getComment() {
            return Comment;
        }

        public void setComment(String comment) {
            Comment = comment;
        }

        public String getApprovalDate() {
            return ApprovalDate;
        }

        public void setApprovalDate(String approvalDate) {
            ApprovalDate = approvalDate;
        }

        public String getYesOrNo() {
            return YesOrNo;
        }

        public void setYesOrNo(String yesOrNo) {
            YesOrNo = yesOrNo;
        }

        public String getApprovalEmployeeName() {
            return ApprovalEmployeeName;
        }

        public void setApprovalEmployeeName(String approvalEmployeeName) {
            ApprovalEmployeeName = approvalEmployeeName;
        }
    }

    public List<SalaryAjustApvlModel.ApprovalInfoLists> getApprovalInfoLists() {
        return ApprovalInfoLists;
    }

    public void setApprovalInfoLists(List<SalaryAjustApvlModel.ApprovalInfoLists> approvalInfoLists) {
        this.ApprovalInfoLists = approvalInfoLists;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getApprovalStatus() {
        return ApprovalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        ApprovalStatus = approvalStatus;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getApplicationCreateTime() {
        return ApplicationCreateTime;
    }

    public void setApplicationCreateTime(String applicationCreateTime) {
        ApplicationCreateTime = applicationCreateTime;
    }

    public String getTargetEmployee() {
        return TargetEmployee;
    }

    public void setTargetEmployee(String targetEmployee) {
        TargetEmployee = targetEmployee;
    }

    public String getOriSalary() {
        return OriSalary;
    }

    public void setOriSalary(String oriSalary) {
        OriSalary = oriSalary;
    }

    public String getSrcSalary() {
        return SrcSalary;
    }

    public void setSrcSalary(String srcSalary) {
        SrcSalary = srcSalary;
    }
}

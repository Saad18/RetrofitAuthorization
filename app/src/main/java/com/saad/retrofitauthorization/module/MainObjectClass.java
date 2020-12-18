package com.saad.retrofitauthorization.module;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainObjectClass {

    @SerializedName("tsync_id")
    @Expose
    private String tsyncId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("full_address")
    @Expose
    private String fullAddress;
    @SerializedName("name_of_university")
    @Expose
    private String nameOfUniversity;
    @SerializedName("graduation_year")
    @Expose
    private long graduationYear;
    @SerializedName("cgpa")
    @Expose
    private double cgpa;
    @SerializedName("experience_in_months")
    @Expose
    private long experienceInMonths;
    @SerializedName("current_work_place_name")
    @Expose
    private String currentWorkPlaceName;
    @SerializedName("applying_in")
    @Expose
    private String applyingIn;
    @SerializedName("expected_salary")
    @Expose
    private long expectedSalary;
    @SerializedName("field_buzz_reference")
    @Expose
    private String fieldBuzzReference;
    @SerializedName("github_project_url")
    @Expose
    private String githubProjectUrl;
    @SerializedName("cv_file")
    @Expose
    private CvFile cvFile;
    @SerializedName("on_spot_update_time")
    @Expose
    private long onSpotUpdateTime;
    @SerializedName("on_spot_creation_time")
    @Expose
    private long onSpotCreationTime;

    public MainObjectClass() {
    }


    public MainObjectClass(String tsyncId, String name, String email, String phone,
                           String fullAddress, String nameOfUniversity, long graduationYear,
                           double cgpa, long experienceInMonths, String currentWorkPlaceName,
                           String applyingIn, long expectedSalary, String fieldBuzzReference,
                           String githubProjectUrl, CvFile cvFile, long onSpotUpdateTime,
                           long onSpotCreationTime) {
        super();
        this.tsyncId = tsyncId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.fullAddress = fullAddress;
        this.nameOfUniversity = nameOfUniversity;
        this.graduationYear = graduationYear;
        this.cgpa = cgpa;
        this.experienceInMonths = experienceInMonths;
        this.currentWorkPlaceName = currentWorkPlaceName;
        this.applyingIn = applyingIn;
        this.expectedSalary = expectedSalary;
        this.fieldBuzzReference = fieldBuzzReference;
        this.githubProjectUrl = githubProjectUrl;
        this.cvFile = cvFile;
        this.onSpotUpdateTime = onSpotUpdateTime;
        this.onSpotCreationTime = onSpotCreationTime;
    }

    public String getTsyncId() {
        return tsyncId;
    }

    public void setTsyncId(String tsyncId) {
        this.tsyncId = tsyncId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public long getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(long graduationYear) {
        this.graduationYear = graduationYear;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public long getExperienceInMonths() {
        return experienceInMonths;
    }

    public void setExperienceInMonths(long experienceInMonths) {
        this.experienceInMonths = experienceInMonths;
    }

    public String getCurrentWorkPlaceName() {
        return currentWorkPlaceName;
    }

    public void setCurrentWorkPlaceName(String currentWorkPlaceName) {
        this.currentWorkPlaceName = currentWorkPlaceName;
    }

    public String getApplyingIn() {
        return applyingIn;
    }

    public void setApplyingIn(String applyingIn) {
        this.applyingIn = applyingIn;
    }

    public long getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(long expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public String getFieldBuzzReference() {
        return fieldBuzzReference;
    }

    public void setFieldBuzzReference(String fieldBuzzReference) {
        this.fieldBuzzReference = fieldBuzzReference;
    }

    public String getGithubProjectUrl() {
        return githubProjectUrl;
    }

    public void setGithubProjectUrl(String githubProjectUrl) {
        this.githubProjectUrl = githubProjectUrl;
    }

    public CvFile getCvFile() {
        return cvFile;
    }

    public void setCvFile(CvFile cvFile) {
        this.cvFile = cvFile;
    }

    public long getOnSpotUpdateTime() {
        return onSpotUpdateTime;
    }

    public void setOnSpotUpdateTime(long onSpotUpdateTime) {
        this.onSpotUpdateTime = onSpotUpdateTime;
    }

    public long getOnSpotCreationTime() {
        return onSpotCreationTime;
    }

    public void setOnSpotCreationTime(long onSpotCreationTime) {
        this.onSpotCreationTime = onSpotCreationTime;
    }

}
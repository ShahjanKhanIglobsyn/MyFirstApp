
package com.example.saveuserapp.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("school_id")
    @Expose
    private String schoolId;
    @SerializedName("route_id")
    @Expose
    private String routeId;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("birth_date")
    @Expose
    private String birthDate;
    @SerializedName("agency_name")
    @Expose
    private String agencyName;
    @SerializedName("blood_group")
    @Expose
    private String bloodGroup;
    @SerializedName("licence_number")
    @Expose
    private String licenceNumber;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("marital_status")
    @Expose
    private String maritalStatus;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("location")
    @Expose
    private List<Double> location;
    @SerializedName("dropup_address")
    @Expose
    private String dropupAddress;
    @SerializedName("dropup_location")
    @Expose
    private List<Double> dropupLocation;
    @SerializedName("pickup_address")
    @Expose
    private String pickupAddress;
    @SerializedName("pickup_location")
    @Expose
    private List<Double> pickupLocation;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("user_type")
    @Expose
    private String userType;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("server_token")
    @Expose
    private String serverToken;
    @SerializedName("is_available")
    @Expose
    private Boolean isAvailable;
    @SerializedName("pickup_notify")
    @Expose
    private Boolean pickupNotify;
    @SerializedName("dropup_notify")
    @Expose
    private Boolean dropupNotify;
    @SerializedName("changeRoute_notify")
    @Expose
    private Boolean changeRouteNotify;
    @SerializedName("pickupHome_notify")
    @Expose
    private Boolean pickupHomeNotify;
    @SerializedName("device_token")
    @Expose
    private String deviceToken;
    @SerializedName("device_type")
    @Expose
    private String deviceType;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("__v")
    @Expose
    private Integer v;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public String getDropupAddress() {
        return dropupAddress;
    }

    public void setDropupAddress(String dropupAddress) {
        this.dropupAddress = dropupAddress;
    }

    public List<Double> getDropupLocation() {
        return dropupLocation;
    }

    public void setDropupLocation(List<Double> dropupLocation) {
        this.dropupLocation = dropupLocation;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    public List<Double> getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(List<Double> pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getServerToken() {
        return serverToken;
    }

    public void setServerToken(String serverToken) {
        this.serverToken = serverToken;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Boolean getPickupNotify() {
        return pickupNotify;
    }

    public void setPickupNotify(Boolean pickupNotify) {
        this.pickupNotify = pickupNotify;
    }

    public Boolean getDropupNotify() {
        return dropupNotify;
    }

    public void setDropupNotify(Boolean dropupNotify) {
        this.dropupNotify = dropupNotify;
    }

    public Boolean getChangeRouteNotify() {
        return changeRouteNotify;
    }

    public void setChangeRouteNotify(Boolean changeRouteNotify) {
        this.changeRouteNotify = changeRouteNotify;
    }

    public Boolean getPickupHomeNotify() {
        return pickupHomeNotify;
    }

    public void setPickupHomeNotify(Boolean pickupHomeNotify) {
        this.pickupHomeNotify = pickupHomeNotify;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}

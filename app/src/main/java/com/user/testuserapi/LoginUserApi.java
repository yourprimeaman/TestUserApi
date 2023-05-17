package com.user.testuserapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginUserApi {

    @SerializedName("Result")
    @Expose
    private Boolean result;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("user_role")
    @Expose
    private List<UserRole> userRole;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("message")
    @Expose
    private String message;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<UserRole> getUserRole() {
        return userRole;
    }

    public void setUserRole(List<UserRole> userRole) {
        this.userRole = userRole;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public class User {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("user_name")
        @Expose
        private String userName;
        @SerializedName("user_email")
        @Expose
        private String userEmail;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("user_phone")
        @Expose
        private String userPhone;
        @SerializedName("user_type")
        @Expose
        private String userType;
        @SerializedName("role_id")
        @Expose
        private Integer roleId;
        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("create_by")
        @Expose
        private Object createBy;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("modified_by")
        @Expose
        private Object modifiedBy;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("OTP")
        @Expose
        private Object otp;
        @SerializedName("OTP_Verify")
        @Expose
        private String oTPVerify;
        @SerializedName("FCM_Token")
        @Expose
        private Object fCMToken;
        @SerializedName("comp_code")
        @Expose
        private String compCode;
        @SerializedName("plant_id")
        @Expose
        private Object plantId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUserPhone() {
            return userPhone;
        }

        public void setUserPhone(String userPhone) {
            this.userPhone = userPhone;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }

        public Integer getRoleId() {
            return roleId;
        }

        public void setRoleId(Integer roleId) {
            this.roleId = roleId;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Object getCreateBy() {
            return createBy;
        }

        public void setCreateBy(Object createBy) {
            this.createBy = createBy;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public Object getModifiedBy() {
            return modifiedBy;
        }

        public void setModifiedBy(Object modifiedBy) {
            this.modifiedBy = modifiedBy;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Object getOtp() {
            return otp;
        }

        public void setOtp(Object otp) {
            this.otp = otp;
        }

        public String getOTPVerify() {
            return oTPVerify;
        }

        public void setOTPVerify(String oTPVerify) {
            this.oTPVerify = oTPVerify;
        }

        public Object getFCMToken() {
            return fCMToken;
        }

        public void setFCMToken(Object fCMToken) {
            this.fCMToken = fCMToken;
        }

        public String getCompCode() {
            return compCode;
        }

        public void setCompCode(String compCode) {
            this.compCode = compCode;
        }

        public Object getPlantId() {
            return plantId;
        }

        public void setPlantId(Object plantId) {
            this.plantId = plantId;
        }

    }

    public class UserRole {

        @SerializedName("role_name")
        @Expose
        private String roleName;
        @SerializedName("role_id")
        @Expose
        private Integer roleId;
        @SerializedName("app_icon")
        @Expose
        private String appIcon;
        @SerializedName("menu_id")
        @Expose
        private Integer menuId;
        @SerializedName("web_action")
        @Expose
        private String webAction;
        @SerializedName("mobile_action")
        @Expose
        private String mobileAction;
        @SerializedName("menu_name")
        @Expose
        private String menuName;
        @SerializedName("module_id")
        @Expose
        private Integer moduleId;
        @SerializedName("module_name")
        @Expose
        private String moduleName;
        @SerializedName("is_read")
        @Expose
        private Integer isRead;
        @SerializedName("is_write")
        @Expose
        private Integer isWrite;
        @SerializedName("is_import")
        @Expose
        private Integer isImport;
        @SerializedName("is_delete")
        @Expose
        private Integer isDelete;
        @SerializedName("is_mobile")
        @Expose
        private Integer isMobile;
        @SerializedName("is_web")
        @Expose
        private Integer isWeb;
        @SerializedName("is_export")
        @Expose
        private Integer isExport;

        public String getRoleName() {
            return roleName;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public Integer getRoleId() {
            return roleId;
        }

        public void setRoleId(Integer roleId) {
            this.roleId = roleId;
        }

        public String getAppIcon() {
            return appIcon;
        }

        public void setAppIcon(String appIcon) {
            this.appIcon = appIcon;
        }

        public Integer getMenuId() {
            return menuId;
        }

        public void setMenuId(Integer menuId) {
            this.menuId = menuId;
        }

        public String getWebAction() {
            return webAction;
        }

        public void setWebAction(String webAction) {
            this.webAction = webAction;
        }

        public String getMobileAction() {
            return mobileAction;
        }

        public void setMobileAction(String mobileAction) {
            this.mobileAction = mobileAction;
        }

        public String getMenuName() {
            return menuName;
        }

        public void setMenuName(String menuName) {
            this.menuName = menuName;
        }

        public Integer getModuleId() {
            return moduleId;
        }

        public void setModuleId(Integer moduleId) {
            this.moduleId = moduleId;
        }

        public String getModuleName() {
            return moduleName;
        }

        public void setModuleName(String moduleName) {
            this.moduleName = moduleName;
        }

        public Integer getIsRead() {
            return isRead;
        }

        public void setIsRead(Integer isRead) {
            this.isRead = isRead;
        }

        public Integer getIsWrite() {
            return isWrite;
        }

        public void setIsWrite(Integer isWrite) {
            this.isWrite = isWrite;
        }

        public Integer getIsImport() {
            return isImport;
        }

        public void setIsImport(Integer isImport) {
            this.isImport = isImport;
        }

        public Integer getIsDelete() {
            return isDelete;
        }

        public void setIsDelete(Integer isDelete) {
            this.isDelete = isDelete;
        }

        public Integer getIsMobile() {
            return isMobile;
        }

        public void setIsMobile(Integer isMobile) {
            this.isMobile = isMobile;
        }

        public Integer getIsWeb() {
            return isWeb;
        }

        public void setIsWeb(Integer isWeb) {
            this.isWeb = isWeb;
        }

        public Integer getIsExport() {
            return isExport;
        }

        public void setIsExport(Integer isExport) {
            this.isExport = isExport;
        }
    }
}

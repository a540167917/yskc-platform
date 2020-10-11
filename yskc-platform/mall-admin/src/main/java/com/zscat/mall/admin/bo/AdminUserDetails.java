package com.zscat.mall.admin.bo;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//import com.zscat.ums.model.UmsAdmin;
//import com.zscat.ums.model.UmsPermission;

/**
 * SpringSecurity需要的用户详情 
 */
public class AdminUserDetails {
//    private UmsAdmin umsAdmin;
//    private List<UmsPermission> permissionList;
//
//    public AdminUserDetails(UmsAdmin umsAdmin, List<UmsPermission> permissionList) {
//        this.umsAdmin = umsAdmin;
//        this.permissionList = permissionList;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        //返回当前用户的权限
//        return permissionList.stream()
//                .filter(permission -> permission.getValue() != null)
//                .map(permission -> new SimpleGrantedAuthority(permission.getValue()))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public String getPassword() {
//        return umsAdmin.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return umsAdmin.getUsername();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return umsAdmin.getStatus().equals(1);
//    }
//
//    public UmsAdmin getUmsAdmin() {
//        return umsAdmin;
//    }
//
//    public void setUmsAdmin(UmsAdmin umsAdmin) {
//        this.umsAdmin = umsAdmin;
//    }
}

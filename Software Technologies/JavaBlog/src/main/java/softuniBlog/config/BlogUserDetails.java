package softuniBlog.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;
import softuniBlog.entity.User;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by DJColdBrain on 04-Aug-17.
 */
public class BlogUserDetails extends User implements UserDetails{

    private ArrayList<String> roles;
    private User user;

    public BlogUserDetails(ArrayList<String> roles, User user) {
        super(user.getEmail(), user.getFullName(), user.getPassword());
        this.roles = roles;
        this.user = user;
    }

    public User getUser(){
        return this.user;
    }

    @Override
    public String getUsername(){
        return this.user.getEmail();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        String userRoles = StringUtils.collectionToCommaDelimitedString(this.roles);
        return AuthorityUtils.commaSeparatedStringToAuthorityList(userRoles);
    }

    @Override
    public boolean isAccountNonExpired(){
        return true;
    }

    @Override
    public boolean isAccountNonLocked(){
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired(){
        return true;
    }

    @Override
    public boolean isEnabled(){
        return true;
    }
}

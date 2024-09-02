/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.Model;
import java.sql.Types;

/**
 *
 * @author ESTUDIANTE
 */
public class User {
    private long id;
    private String UserName;
    private String password;
    private Types Role;
    
    public User(){
    
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Types getRole() {
        return Role;
    }

    public void setRole(Types Role) {
        this.Role = Role;
    }
    
}

package sflima.weatherapp.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sflima.weatherapp.model.BaseEntity;

import javax.persistence.Entity;

//to emplement
/*@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor*/
public class UserModel  {
    String userName;
    String userLogin;
    String userPassword;

}

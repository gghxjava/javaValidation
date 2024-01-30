package com.example.spring.entity;

import com.example.spring.enumData.UserTypeAdmin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnumTest {

    /**
     * @see RGB
     */
    private String rgb;

    /**
     * @see UserTypeAdmin
     */
    private String isQxd;





    /**
     * @see UserTypeAdmin
     */
    private String desc;

    /**
     * @see UserTypeAdmin
     */
    private String sy1;

    /**
     * @see UserTypeAdmin
     */
    private String sy3;

    /**
     * @see UserTypeAdmin#ordinal()
     */
    private String sy4;

    /**
     * @see UserTypeAdmin#ordinal()
     */
    private String address;

    /**
     * @see UserTypeAdmin#name()
     */
    private String name;

    /**
     * @see UserTypeAdmin
     */
    private UserTypeAdmin userTypeAdmin;

}

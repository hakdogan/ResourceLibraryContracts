package com.kodcu;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author hakdogan
 */

@ManagedBean
@SessionScoped
public class MyContracts implements Serializable {
    
    String contract = "colored";

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }
    
}

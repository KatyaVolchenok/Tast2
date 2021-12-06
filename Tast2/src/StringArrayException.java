/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shwartskopff
 */
public class StringArrayException extends Exception {
     
    private static final String DEFAULT_DESCRIPTION = "Common error";
    
    public StringArrayException (){
        super(DEFAULT_DESCRIPTION);
    }
    public StringArrayException(String string) {
        super(string);
    }
}

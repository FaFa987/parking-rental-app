package se.lexicon.model;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;


public class VehicleTypeTest {


    @Test
    void getVehicleTypeSuccessfulCodeOne() {

        //Arrange
        int code = 1;
        //Act
        VehicleType vt = VehicleType.getVehicleType(code);
        //Assert
        assertEquals(VehicleType.CAR,vt);;
    }


    public void testGetVehicleTypeUnsuccessfulCodeOne() {

        //Arrange
        int code = 1;
        //Act , Assert
        //throw an exception
        /*assertThrowsExactly(EnumConstantNotPresentException.class , new Executable() {

            @Override
            public void execute(){
                VehicleType.getVehicleType(code);
            }
        });*/

        assertThrowsExactly(EnumConstantNotPresentException.class ,
                () -> VehicleType.getVehicleType(code));

    }
}

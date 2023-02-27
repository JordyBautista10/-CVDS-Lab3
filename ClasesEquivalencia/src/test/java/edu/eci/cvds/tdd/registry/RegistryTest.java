package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void DeadRegistryResult() {
        //Arrange
        Person person = new Person();
        //Act
        RegisterResult result = registry.registerVoter(person);
        //Asert
        Assert.assertEquals(RegisterResult.DEAD, result);
    } 

    @Test
    public void invalidAgeRegistryResult() {
        //Arrange
        Person person = new Person("Juan", 1089873475, -6 , Gender.MALE, true);
        //Act
        RegisterResult result = registry.registerVoter(person);
        //Asert
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    } 

    @Test
    public void underAgeRegistryResult() {
        //Arrange
        Person person = new Person("Liliana", 1001872865, 10, Gender.FEMALE, true);
        //Act
        RegisterResult result = registry.registerVoter(person);
        //Asert
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    } 

    @Test
    public void duplicatedRegistryResult() {
        //Arrange
        Person persona = new Person("Luis", 1001092865, 28, Gender.UNIDENTIFIED, true);
        Person person = new Person("Luis", 1001092865, 28, Gender.UNIDENTIFIED, true);
        //Act
        RegisterResult results = registry.registerVoter(persona);
        RegisterResult result = registry.registerVoter(person);
        //Asert
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }

    @Test
    public void validRegistryResult() {
        //Arrange
        Person person = new Person("Pedro", 79693584, 45, Gender.MALE, true);
        //Act
        RegisterResult result = registry.registerVoter(person);
        //Asert
        Assert.assertEquals(RegisterResult.VALID, result);
        
    } 
    



    
}
package edu.eci.cvds.tdd.registry;
import java.util.*;

public class Registry {

    ArrayList<Integer> persons = new ArrayList();  

    public RegisterResult registerVoter(Person p) {

        boolean alive = p.isAlive();
        int age = p.getAge();
        int idd = p.getId();
        RegisterResult resultado = isAlive(alive);
        resultado = resultado == RegisterResult.VALID ? isInvalidAge(age) : resultado;
        resultado = resultado == RegisterResult.VALID ? isUnderAge(age) : resultado;
        resultado = resultado == RegisterResult.VALID ? isDuplicated(idd) : resultado;  
        addIdd(idd, resultado);
        return resultado;
    }

    public RegisterResult isAlive(boolean alive){
        return (alive == true) ? RegisterResult.VALID : RegisterResult.DEAD;
    }

    public RegisterResult isInvalidAge(int age){
        return (age < 0 || age >= 120)  ? RegisterResult.INVALID_AGE : RegisterResult.VALID;
    }

    public RegisterResult isUnderAge(int age){
        return (age >= 0 && age < 18)  ? RegisterResult.UNDERAGE : RegisterResult.VALID;
    }

    public RegisterResult isDuplicated(int idd){
        RegisterResult resultado = RegisterResult.VALID;
        for(Integer i: persons){
            if (i == idd){
                resultado = RegisterResult.DUPLICATED;
                break;
            }   
        }
        return resultado;
    }

    public boolean addIdd(int idd, RegisterResult resultado){
        return (resultado == RegisterResult.VALID) ? persons.add(idd): false;
    }
}

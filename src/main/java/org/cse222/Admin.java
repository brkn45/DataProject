package org.cse222;

public class Admin extends Person {


    public Admin(){
        super();
    }

    public Admin(String name, String surName, int age, char gender, Address address, int id){
        super(name, surName, age, gender, address, id);
    }

    public void assignNurseToFloor(Nurse newNurse, int blockNumber, int floorNumber){


    }

    public void assignConsultantToFloor(Consultant newConsultant, int blockNumber, int floorNumber){


    }

    public void assignDoctorToBlock(Doctor newDoctor, int blockNumber, int officeNumber, int floorNumber){


    }

    public void assignTechnicalWorkerToBlock(TechnicianWorker newTechnicianWorker, int blockNumber){


    }



}